
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestngTest extends BaseTest {


    @Test
    public void test1() {
        if (Integer.parseInt(TIMEOUT) > 10) {
            System.out.println("55 X 55 " + BaseTest.URL);

        }

        preConfig();
        driver = getDriver();
        driver.get(BaseTest.URL);
    }
}
