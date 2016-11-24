package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BaseRozetkaPage {

    private WebDriver driver;

    public BaseRozetkaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getMenuElement (String text) {
        String xpath = ".//*[@class='m-top']//a[contains(@class, 'novisited') and text()[contains(.,'" +
                text + "')]]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getDismissBtn() {
        return dismissBtn;
    }

    @FindBy(xpath = "//div[contains(text(),'Отказаться')]")
    private WebElement dismissBtn;











}
