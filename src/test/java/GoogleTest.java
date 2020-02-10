import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class GoogleTest {

    @Test
    public void checkTitle() {
        System.out.println("I 'm Here ...");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        assertEquals("Google", title);
        driver.quit();
    }
}
