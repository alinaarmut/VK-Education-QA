package homework_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupPage {

    private WebDriver driver;

    public GroupPage(WebDriver driver) {
        this.driver = driver;
    }
    By openGroupLocator = By.xpath("//a[contains(text(),'Группы')]");

    public void clickGroup() {
        driver.findElement(openGroupLocator).click();
    }
}
