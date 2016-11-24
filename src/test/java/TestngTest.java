import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BaseRozetkaPage;

import static org.testng.Assert.assertTrue;


public class TestngTest extends BaseTest {


    @Test
    public void test1() {
        BaseRozetkaPage basePage = new BaseRozetkaPage(driver);
        basePage.getDismissBtn().click();
        basePage.getMenuElement("Доставка").click();
        assertTrue(driver.findElement(By.xpath(".//*[@id='deliveries-payments-container']/section[1]/ul/li[2]")).getText().contains("Доставка производится до входа"));

    }

    @Test
    public void test2() {

        BaseRozetkaPage basePage = new BaseRozetkaPage(driver);
        basePage.getDismissBtn().click();

        basePage.getSearchField().sendKeys("Мяч");
        basePage.getCategoriesDropdown().click();
        basePage.getCategorySportItem().click();
        basePage.getSearchField().submit();
        assertTrue(driver.getPageSource().contains("найдено более"));

    }
}
