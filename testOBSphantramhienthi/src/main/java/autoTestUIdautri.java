
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

public class autoTestUIdautri {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void Run() {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        Actions actions = new Actions(chromeDriver);

        chromeDriver.get("https://interactive.onplay.live/operation-onlive-tournament");
        String window1Handle = chromeDriver.getWindowHandle();

        WebElement textUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div/div/div/form/div/div[1]/form/div[2]/div/div/div/div/input")));
        textUsername.sendKeys("minhdn");

        WebElement textPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div/main/div/div/div/div/div/div/form/div/div[1]/form/div[3]/div/div/div/div/input")));
        textPassword.sendKeys("vtvlive@123");

        WebElement buttonLoginSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-login")));
        buttonLoginSubmit.submit();

        WebElement buttonVanHanhOnlive = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[3]/nav/div[1]/section/div[1]/div/div[4]/div/div[1]/div/p")));
        buttonVanHanhOnlive.click();

        actions.moveToElement(buttonVanHanhOnlive);
        chromeDriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

        WebElement buttonQuanLyGiaiDau = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[2]/nav/div[1]/section/div[1]/div/div[4]/div[2]/a[6]/div[1]/p")));
        buttonQuanLyGiaiDau.click();
        chromeDriver.manage().window().maximize();
        sleep(500);
        WebElement buttonQuanLyCauHoiDuDoan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[1]/div/div[2]/div/div[8]")));
        buttonQuanLyCauHoiDuDoan.click();

        WebElement findGiaiDauQLCH = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[1]")));
        findGiaiDauQLCH.click();
        WebElement chooseGiaiDauQLCH = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-list-item__title' and text()='Minh autotest']")));
        chooseGiaiDauQLCH.click();
//        WebElement inputTextQuestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/form/div/div[2]/div/div[2]/div/div/div[1]/div/textarea")));
//        String inputTextQuestionStr = "Cau hoi dau tri";
//        inputTextQuestion.sendKeys(inputTextQuestionStr);
//        WebElement inputTextAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/form/div/div[2]/div/div[3]/div[1]/div/div/div[1]/div/input")));
//        String inputTextAnsAStr = "Dap An A...";
//        inputTextAnsA.sendKeys(inputTextAnsAStr);
//
//        WebElement inputTextAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/form/div/div[2]/div/div[3]/div[2]/div/div/div[1]/div/input")));
//        String inputTextAnsBStr = "Dap An B...";
//        inputTextAnsB.sendKeys(inputTextAnsBStr);
//        WebElement inputTextOnG = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/form/div/div[3]/div/div[2]/div/div[1]/div/input")));
//        inputTextOnG.sendKeys("0");
//        WebElement buttonLuu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/form/div/div[5]/button/span")));
//        buttonLuu.click();
        WebElement buttonDieuKhieu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[1]/div/div[2]/div/div[7]/span")));
        buttonDieuKhieu.click();
        WebElement findTranDau = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]")));
        findTranDau.click();
        sleep(500);
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).perform();
//        WebElement buttonThemCauHoi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div[1]/div/button/span/i")));
//        buttonThemCauHoi.click();
//        sleep(1000);
//        WebElement checkBoxThemCauHoi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[5]/div/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div")));
//        checkBoxThemCauHoi.click();
//        WebElement buttonLuuThemCauHoi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[5]/div/div/div/div[2]/div/button")));
//        buttonLuuThemCauHoi.click();
//        WebElement buttonBanCauHoi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div[2]/div/div/div/table/tbody/tr/td[4]/div/div/button[3]/span")));
//        buttonBanCauHoi.click();
        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        ((ChromeDriver) chromeDriver).executeScript("window.open('https://play.onlive.vn/minhdn211002/95516');");

        Set<String> handles = chromeDriver.getWindowHandles();
        for (String handle : handles) {
            chromeDriver.switchTo().window(handle);

            if (chromeDriver.getTitle().equals("chanh21 | ON Live")) {
                String window2Handle = chromeDriver.getWindowHandle();
                sleep(1000);
                WebElement buttonLoginAcc2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-login")));
                buttonLoginAcc2.click();

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
                WebElement buttonOpenDauTri = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div[24]/div")));
                buttonOpenDauTri.click();
                sleep(2000);
                WebElement frameDauTri = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/iframe")));

                String inputTextQuestionStr = "Cau hoi dau tri";
                String inputTextAnsAStr = "Dap An A...";
                String inputTextAnsBStr = "Dap An B...";
                chromeDriver.switchTo().frame(frameDauTri);
                WebElement outputQuestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("main_content-question")));
                String outputTextQuestion = outputQuestion.getText();
                System.out.println(outputTextQuestion);
                Assert.assertEquals(outputTextQuestion, "1. " + inputTextQuestionStr);

                WebElement outputAnsA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-0")));
                String outputTextAnsA = outputAnsA.getText();
                System.out.println(outputTextAnsA);
                Assert.assertEquals(outputTextAnsA, inputTextAnsAStr);

                WebElement outputAnsB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-1")));
                String outputTextAnsB = outputAnsB.getText();
                System.out.println(outputTextAnsB);
                Assert.assertEquals(outputTextAnsB, inputTextAnsBStr);


                WebElement inputTextSoNguoiDuDoan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[4]/input")));
                inputTextSoNguoiDuDoan.sendKeys("100");

                WebElement buttonGuiDuDoan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-submit")));

                Assert.assertEquals(buttonGuiDuDoan.isEnabled(), false, "ButtonGuiDuDoan is disabled.");
                inputTextSoNguoiDuDoan.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
                outputAnsA.click();
                Assert.assertEquals(buttonGuiDuDoan.isEnabled(), false, "ButtonGuiDuDoan is disabled.");
                String inputSoNguoiDuDoan = "100";
                inputTextSoNguoiDuDoan.sendKeys(inputSoNguoiDuDoan);
                buttonGuiDuDoan.click();
                WebElement outputTextAnsAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div[2]/span[1]")));
                String outputTextAnsAfterStr = outputTextAnsAfter.getText();
                System.out.println(outputTextAnsAfterStr);
                Assert.assertEquals(outputTextAnsAfterStr, inputTextAnsAStr);

                WebElement outputTextSoNguoiDuDoanAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/div[2]/span[3]")));
                String outputTextSoNguoiDuDoanAfterStr = outputTextSoNguoiDuDoanAfter.getText();
                System.out.println(outputTextSoNguoiDuDoanAfterStr);
                Assert.assertEquals(outputTextSoNguoiDuDoanAfterStr, "100");
                WebElement buttonChoiLai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/button/span")));
                buttonChoiLai.click();

                WebElement outputQuestion2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("main_content-question")));
                String outputTextQuestion2 = outputQuestion2.getText();
                System.out.println(outputTextQuestion2);
                Assert.assertEquals(outputTextQuestion2, "1. " + inputTextQuestionStr);

                WebElement outputAnsA2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-0")));
                String outputTextAnsA2 = outputAnsA2.getText();
                System.out.println(outputTextAnsA2);
                Assert.assertEquals(outputTextAnsA2, inputTextAnsAStr);

                WebElement outputAnsB2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-1")));
                String outputTextAnsB2 = outputAnsB2.getText();
                System.out.println(outputTextAnsB2);
                Assert.assertEquals(outputTextAnsB2, inputTextAnsBStr);

                WebElement outputAnsB3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-1")));
                ;
                outputAnsB3.click();

                WebElement inputTextSoNguoiDuDoan2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[4]/input")));
                inputTextSoNguoiDuDoan2.sendKeys("100");
                WebElement buttonGuiDuDoan2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-submit")));
                buttonGuiDuDoan2.click();

                chromeDriver.switchTo().defaultContent();
                sleep(7000);
                try {
                    WebElement checkFrameDauTri = chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/iframe"));
                    chromeDriver.switchTo().frame(checkFrameDauTri);
                    System.out.println("Frame ton tai.");
//                    Assert.assertTrue(false);
                } catch (NoSuchElementException e) {
                    System.out.println("Frame khong ton tai.");
                }
                buttonOpenDauTri.click();
                sleep(2000);
                WebElement frameDauTri2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/iframe")));
                chromeDriver.switchTo().frame(frameDauTri2);
                WebElement outputAnsA3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ans-0")));
                outputAnsA3.click();
                WebElement inputTextSoNguoiDuDoan3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[4]/input")));
                inputTextSoNguoiDuDoan3.sendKeys("100");
                WebElement buttonGuiDuDoan3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-submit")));
                buttonGuiDuDoan3.click();
                WebElement buttonAnCuaSo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[1]/div[2]")));
                buttonAnCuaSo.click();
                chromeDriver.switchTo().defaultContent();
                sleep(7000);
                try {
                    WebElement checkFrameDauTri = chromeDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/iframe"));
                    chromeDriver.switchTo().frame(checkFrameDauTri);
                    System.out.println("Frame ton tai.");
//                    Assert.assertTrue(false);
                } catch (NoSuchElementException e) {
                    System.out.println("Frame khong ton tai.");
                }
                try {
                    WebElement normalElementBefore = chromeDriver.findElement(By.className("normal"));
                    JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeDriver;
                    String scriptBefore = "return arguments[0].classList;";
                    Object classListBefore = jsExecutor.executeScript(scriptBefore, normalElementBefore);
                    String classListBeforeStr = classListBefore.toString();
                    System.out.println("DOMTokenList:" + classListBefore);
                    Assert.assertEquals(classListBeforeStr, "[normal]");
                    chromeDriver.switchTo().window(window1Handle);
                    chromeDriver.switchTo().activeElement();
                    WebElement buttonPower = chromeDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/main/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div[2]/div/div/div/table/tbody/tr/td[4]/div/button[3]"));
                    buttonPower.click();
                    chromeDriver.switchTo().window(window2Handle);
                    chromeDriver.switchTo().activeElement();
                    sleep(1000);
                    WebElement normalElementAfter = chromeDriver.findElement(By.className("normal"));
                    String scriptAfter = "return arguments[0].classList;";
                    Object classListAfter = jsExecutor.executeScript(scriptAfter, normalElementAfter);
                    String classListAfterStr = classListAfter.toString();
                    System.out.println("DOMTokenList:" + classListAfter);
                    Assert.assertEquals(classListAfterStr, "[normal, power]");
                    WebElement powerElementAfter = chromeDriver.findElement(By.className("power"));
                    if (powerElementAfter.getAttribute("class").contains("power")) {
                        System.out.println("power.");
                    } else {
                        System.out.println("no power.");
                    }
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    System.out.println("not found");
                }
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

}