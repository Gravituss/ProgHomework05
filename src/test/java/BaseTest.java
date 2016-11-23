import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Config;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    public final String URL = Config.getProperty("baseUrl");
    public final String BROWSER = Config.getProperty("driver");
    public final String TIMEOUT = Config.getProperty("timeout");
    WebDriver driver;


    public WebDriver getDriver () {
        if (BROWSER.equals("firefox")) return new FirefoxDriver();
        if (BROWSER.equals("chrome")) return new ChromeDriver();
        return new ChromeDriver();
    }

    @Before
    public void preConfig () {
        System.setProperty("webdriver.gecko.driver", "C:\\Temp\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver.exe");
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(TIMEOUT), TimeUnit.SECONDS);
        driver.get(URL);
    }

    @After
    public void tearDown () {
        driver.quit();
    }




}
