
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
        basePage.getMenuElement("Доставка").click();
        boolean bol = false;

        if(driver.getPageSource().contains("Новой Почтой")){
            bol = true;
        }
        assert(bol);









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
