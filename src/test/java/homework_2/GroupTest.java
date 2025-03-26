package homework_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GroupTest {
    private WebDriver driver;
    private GroupPage groupPage;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ok.ru/dk?st.cmd=anonymMain");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupPage = new GroupPage(driver);
    }

    @Test
    public void checkGroupTest() {
        groupPage.clickGroup();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://ok.ru/groups", currentUrl);

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

