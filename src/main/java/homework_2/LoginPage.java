package homework_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    By usernameLocator = By.xpath("//*[@id='field_email']");
    By passwdLocator = By.xpath("//*[@id='field_password']");
    By openProfile = By.xpath("//input[@value='Войти в Одноклассники']");
    By errorMessage = By.cssSelector(".input-e.login_error");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openProfile(){
        driver.findElement(openProfile).click();
    }
    public void setUsername(String username) {
      driver.findElement(usernameLocator).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwdLocator).sendKeys(password);
    }

}
