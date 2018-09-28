import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.*;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.*;

public class exampleTest {
    private WebDriver driver;
    private By ganresBtn = byTa("ta:mainPage:ganresBtn");
    private By legkoeChtenie = byTa("ta:legkoeChtenie");
    private By novieBtn = byTa("ta:mainPage:novieBtnBtn");
    private By luchshieKnigiBtn = byTa("ta:mainPage:luchshieKnigiBtn");
    private By chtoChitatBtn = byTa("ta:mainPage:chtoChitatBtn");


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTestMobile() throws InterruptedException {
        driver.get("https://pda.litres.ru/");
        Thread.sleep(2000);
        driver.findElement(ganresBtn).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(legkoeChtenie).isDisplayed(), true);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(novieBtn).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(luchshieKnigiBtn).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(chtoChitatBtn).click();
        Thread.sleep(5000);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://litres.ru/");
        Thread.sleep(2000);
        driver.findElement(ganresBtn).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(legkoeChtenie).isDisplayed(), true);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(novieBtn).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(luchshieKnigiBtn).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(chtoChitatBtn).click();
        Thread.sleep(5000);
    }



    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
