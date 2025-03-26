package homework_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class LoginTest {
    private LoginPage loginPage;
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ok.ru/dk?st.cmd=anonymMain");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.setUsername("username@mail.ru");
        loginPage.setPassword("password");
        loginPage.openProfile();
        String currentTitle = driver.getTitle();
        Assertions.assertEquals("Социальная сеть Одноклассники. Общение с друзьями в ОК. Ваше место встречи с одноклассниками", currentTitle);
    }
    @Test
    public void formValidationTest() {
        driver.findElement(loginPage.usernameLocator).sendKeys("username@mail.ru");
        loginPage.openProfile();
        Assertions.assertTrue(driver.findElement(loginPage.errorMessage).isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
