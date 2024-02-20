import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;


public class autoTestUIOBSTool {
    ChromeDriver chromeDriver;
    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }
    @Test
    public void Run1() {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        Actions actions = new Actions(chromeDriver);
        chromeDriver.get("https://obstool.onlive.vn/");

        WebElement textUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        textUsername.sendKeys("minhdn");

        WebElement textPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        textPassword.sendKeys("chanh211002");

        WebElement buttonLoginSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
        buttonLoginSubmit.submit();
        WebElement chooseQuizForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[1]/main/div/div/div/div[3]/div/form/div/div[1]/div/div/div/div/div[1]/div[1]/div[2]/div/i")));
        chooseQuizForm.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        WebElement textQuestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
        textQuestion.clear();
        String inputQuestionText = "Cau hoi dau tien";

        textQuestion.sendKeys(inputQuestionText);

        WebElement textAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/div/input")));
        textAnsA.clear();
        String inputAnsAText = "Dap An A...";
        textAnsA.sendKeys(inputAnsAText);

        WebElement textAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/input")));
        textAnsB.clear();
        String inputAnsBText = "Dap An B...";
        textAnsB.sendKeys(inputAnsBText);

        WebElement textAnsC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[3]/div[2]/div/div[1]/div/input")));
        textAnsC.clear();
        String inputAnsCText = "Dap An C...";
        textAnsC.sendKeys(inputAnsCText);

        WebElement textAnsD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div/input")));
        textAnsD.clear();
        String inputAnsDText = "Dap An D...";
        textAnsD.sendKeys(inputAnsDText);

        WebElement setTimeStart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[6]/div/div[2]/div/div[1]/div/input")));

        setTimeStart.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
        setTimeStart.sendKeys("70");


        WebElement openNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div > main > div > div > div > div:nth-child(3) > div > form > div > div:nth-child(8) > div > div > div:nth-child(1) > button > span")));
        openNowButton.click();

        WebElement buttonGame1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[3]")));
        buttonGame1.click();

        //update ket qua
        WebElement buttonUpdateAns = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div:nth-child(3) > div > div.v-window.v-item-group.theme--light.v-tabs-items > div > div.v-window-item.v-window-item--active > div > div > div.v-card.v-sheet.theme--light > div > div:nth-child(2) > div > div.row.row-label > div.col-bottom.col.col-3 > div > button")));
        buttonUpdateAns.click();

        WebElement chooseRadioButtonAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div.v-dialog__content.v-dialog__content--active > div > div > div > div.row.align-center > div.col-sm-9.col > div > div > div.v-input__slot > div > div:nth-child(1) > div.v-radio.theme--light > div > div")));
        chooseRadioButtonAnsA.click();

        WebElement buttonConfirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("buttonSubmit")));
        buttonConfirm.click();

        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        ((ChromeDriver) chromeDriver).executeScript("window.open('https://play.onlive.vn/minhdn211002/94881');");

        Set<String> handles = chromeDriver.getWindowHandles();
        for (String handle : handles) {
            chromeDriver.switchTo().window(handle);

            if (chromeDriver.getTitle().equals("chanh21 | ON Live")) {
                WebElement buttonLoginAcc2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
                buttonLoginAcc2.click();

                WebElement buttonLoginWithOtherAcc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#dkLogin > div > div > div > form:nth-child(2) > button")));
                buttonLoginWithOtherAcc.submit();
                WebElement textUsername2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                textUsername2.sendKeys("aftv_onlive031");

                WebElement textPassword2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                textPassword2.sendKeys("Onlive#2023");

                WebElement buttonLoginSubmit2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
                buttonLoginSubmit2.submit();

                WebElement buttonPlay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[11]/dl/dd[2]")));
                buttonPlay.click();

                WebElement buttonHere = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[28]/div/span/a/span")));
                buttonHere.click();


                WebElement frameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("live-interactive-iframe")));
                chromeDriver.switchTo().frame(frameElement);

                WebElement textQuestionDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("question-text")));
                String getTextQuestionDisplay = textQuestionDisplay.getText();
                System.out.println(getTextQuestionDisplay);
                Assert.assertEquals(getTextQuestionDisplay, inputQuestionText);

                getTextAns("0-answer1",inputAnsAText);
                getTextAns("1-answer2",inputAnsBText);
                getTextAns("2-answer3",inputAnsCText);
                getTextAns("3-answer4",inputAnsDText);

                WebElement buttonSentAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("0-answer1")));
                buttonSentAnsA.click();
                sleep(5000);
                getPercent("0-answer1","100%");
                getPercent("1-answer2","0%");
                getPercent("2-answer3","0%");
                getPercent("3-answer4","0%");
                chromeDriver.switchTo().defaultContent();
                WebElement buttonLoginMore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button")));
                buttonLoginMore.click();

                WebElement buttonLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logout")));
                buttonLogout.click();

                WebElement buttonLogoutSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div/div/div/div/div/button[2]")));
                buttonLogoutSubmit.click();

                WebElement buttonLoginAcc3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
                buttonLoginAcc3.click();


                WebElement textUsername3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                textUsername3.sendKeys("aftv_onlive037");

                WebElement textPassword3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                textPassword3.sendKeys("Onlive#2023");

                WebElement buttonLoginSubmit3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
                buttonLoginSubmit3.submit();

                WebElement buttonPlay2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[11]/dl/dd[2]")));
                buttonPlay2.click();

                WebElement frameElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("live-interactive-iframe")));
                chromeDriver.switchTo().frame(frameElement2);
                sleep(5000);
                WebElement buttonSentAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("1-answer2")));
                buttonSentAnsB.click();

                sleep(5000);
                getPercent("0-answer1","50%");
                getPercent("1-answer2","50%");
                getPercent("2-answer3", "0%");
                getPercent("3-answer4", "0%");

            }
        }
    }
    @Test
    public void Run2() {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        chromeDriver.get("https://play.onlive.vn/minhdn211002/95394");
        String window1Handle = chromeDriver.getWindowHandle();

        //   String window1URL = chromeDriver.getCurrentUrl();

        WebElement buttonLoginAcc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
        buttonLoginAcc.click();

        WebElement textUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        textUsername.sendKeys("aftv_onlive031");

        WebElement textPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        textPassword.sendKeys("Onlive#2023");

        WebElement buttonLoginSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
        buttonLoginSubmit.submit();

        WebElement buttonPlay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[11]/dl/dd[2]")));
        buttonPlay.click();

        WebElement buttonHere = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[28]/div/span/a/span")));
        buttonHere.click();
        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        ((ChromeDriver) chromeDriver).executeScript("window.open('https://obstool.onlive.vn/');");
//        String window2Handle = chromeDriver.getWindowHandle();
//        chromeDriver.switchTo().window(window2Handle);
//        chromeDriver.switchTo().activeElement();
        Set<String> handles = chromeDriver.getWindowHandles();
        for (String handle : handles) {
            chromeDriver.switchTo().window(handle);
            sleep(3000);
            if (chromeDriver.getTitle().equals("Interactive | Onlive Interactive")) {
                WebElement openLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[1]/main/div/header/div/div[5]")));
                openLogout.click();
                WebElement buttonLogOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div")));
                buttonLogOut.click();
                WebElement buttonLogOutSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div/div/div/div/div/button[2]")));
                buttonLogOutSubmit.click();
                WebElement textUsername2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                textUsername2.sendKeys("minhdn");

                WebElement textPassword2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                textPassword2.sendKeys("chanh211002");

                WebElement buttonLoginSubmit2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
                buttonLoginSubmit2.submit();

                WebElement textQuestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
                textQuestion.clear();
                String inputQuestionText = "Cau hoi dau tien";
                textQuestion.sendKeys(inputQuestionText);

                WebElement textAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/div/input")));
                textAnsA.clear();
                String inputAnsAText = "Dap An A...";
                textAnsA.sendKeys(inputAnsAText);

                WebElement textAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/input")));
                textAnsB.clear();
                String inputAnsBText = "Dap An B...";
                textAnsB.sendKeys(inputAnsBText);

                WebElement textAnsC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[3]/div[2]/div/div[1]/div/input")));
                textAnsC.clear();
                String inputAnsCText = "Dap An C...";
                textAnsC.sendKeys(inputAnsCText);

                WebElement textAnsD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[5]/div/div[3]/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div/input")));
                textAnsD.clear();
                String inputAnsDText = "Dap An D...";
                textAnsD.sendKeys(inputAnsDText);

                WebElement setTimeStart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/form/div/div[6]/div/div[2]/div/div[1]/div/input")));

                setTimeStart.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
                setTimeStart.sendKeys("70");
                WebElement openNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div > main > div > div > div > div:nth-child(3) > div > form > div > div:nth-child(8) > div > div > div:nth-child(1) > button > span")));
                openNowButton.click();

                WebElement buttonGame1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[3]")));
                buttonGame1.click();

                //update ket qua
                WebElement buttonUpdateAns = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div.v-application--wrap > main > div > div > div > div:nth-child(3) > div > div.v-window.v-item-group.theme--light.v-tabs-items > div > div.v-window-item.v-window-item--active > div > div > div.v-card.v-sheet.theme--light > div > div:nth-child(2) > div > div.row.row-label > div.col-bottom.col.col-3 > div > button")));
                buttonUpdateAns.click();

                WebElement chooseRadioButtonAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app > div.v-dialog__content.v-dialog__content--active > div > div > div > div.row.align-center > div.col-sm-9.col > div > div > div.v-input__slot > div > div:nth-child(1) > div.v-radio.theme--light > div > div")));
                chooseRadioButtonAnsA.click();

                WebElement buttonConfirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("buttonSubmit")));
                buttonConfirm.click();

                chromeDriver.switchTo().window(window1Handle);
                chromeDriver.switchTo().activeElement();
                //if (chromeDriver.getTitle().equals("Kênh phát sóng ON Live của chanh21")) {
                sleep(3000);

                WebElement frameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("live-interactive-iframe")));
                chromeDriver.switchTo().frame(frameElement);

                WebElement textQuestionDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("question-text")));
                String getTextQuestionDisplay = textQuestionDisplay.getText();
                System.out.println(getTextQuestionDisplay);
                Assert.assertEquals(getTextQuestionDisplay, "Cau hoi dau tien");

                getTextAns("0-answer1", "Dap An A...");

                getTextAns("1-answer2", "Dap An B...");

                getTextAns("2-answer3", "Dap An C...");

                getTextAns("3-answer4", "Dap An D...");

                WebElement buttonSentAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("0-answer1")));
                buttonSentAnsA.click();

                sleep(5000);

                getPercent("0-answer1", "100%");

                getPercent("1-answer2", "0%");

                getPercent("2-answer3", "0%");

                getPercent("3-answer4", "0%");
                chromeDriver.switchTo().defaultContent();
                WebElement buttonLoginMore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button")));
                buttonLoginMore.click();

                WebElement buttonLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logout")));
                buttonLogout.click();

                WebElement buttonLogoutSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div/div/div/div/div/button[2]")));
                buttonLogoutSubmit.click();

                WebElement buttonLoginAcc3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
                buttonLoginAcc3.click();


                WebElement textUsername3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                textUsername3.sendKeys("aftv_onlive037");

                WebElement textPassword3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                textPassword3.sendKeys("Onlive#2023");

                WebElement buttonLoginSubmit3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-danger")));
                buttonLoginSubmit3.submit();

                WebElement buttonPlay2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[11]/dl/dd[2]")));
                buttonPlay2.click();

                WebElement frameElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("live-interactive-iframe")));
                chromeDriver.switchTo().frame(frameElement2);
                sleep(5000);
                WebElement buttonSentAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("1-answer2")));
                buttonSentAnsB.click();

                sleep(5000);
                getPercent("0-answer1","50%");
                getPercent("1-answer2","50%");
                getPercent("2-answer3", "0%");
                getPercent("3-answer4", "0%");
            }
        }
    }
    @AfterMethod
    public void CleanUp(){
        sleep(4000);
//        chromeDriver.quit();
    }
    private void sleep(int time){
        try{
            Thread.sleep(time);
        } catch (Exception ex){
            System.out.printf(ex.getMessage());
        }
    }
    public void getTextAns(String id, String textAnsExpected){
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement ansActual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        String textAnsActual = ansActual.getText().split("\n")[1];
        System.out.println(textAnsActual);
        Assert.assertEquals(textAnsActual, textAnsExpected);
    }
    public void getPercent(String id, String percentExpected){
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        WebElement percentActual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        String textPercentActual = percentActual.getText().split("\n")[0];
        Assert.assertEquals(textPercentActual, percentExpected);
    }

}