import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task1 {

    private WebDriver drv;


    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.iedriver().setup();
    }

    @After
    public void cleanup() {
        drv.quit();
    }

    @Test
    public void chrome() {

        drv = new ChromeDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void firefox() {

        drv = new FirefoxDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void ie() {

        drv = new InternetExplorerDriver();
        drv.get("https://www.seleniumhq.org");
    }

}
