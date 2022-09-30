/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import io.github.bonigarcia.wdm.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;

import java.time.*;

class LibraryTest {
    public WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        assertEquals("Web form", title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

    @Test
    public void eightComponents() {

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);
    }

}