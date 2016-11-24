
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.BaseRozetkaPage;

import java.util.concurrent.TimeUnit;


public class TestngTest extends BaseTest {

    public void preconditions(){
        preConfig();
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(TIMEOUT), TimeUnit.SECONDS);
        driver.get(BaseTest.URL);
        driver.manage().window().maximize();

    }

    @Test
    public void test1() {
        preconditions();
        BaseRozetkaPage basePage = new BaseRozetkaPage(driver);
        basePage.getDismissBtn().click();
        basePage.getMenuElement("Доставка").click();
        assert(driver.getPageSource().contains("Доставка производится до входа"));

        tearDown();
    }

//    @Test
//    public void test2() {
//
//
//        preconditions();
//
//
//
//
//
//
//        tearDown();
//    }


}
