import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class ChromeTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        System.out.println("I 'm Here 2 ...");
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testCheese() throws Exception {
        System.out.println("I 'm Here 2 ...");
        WebElement queryBox = driver.findElement(By.name("q99"));
        queryBox.sendKeys("cheese");
        queryBox.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }
}