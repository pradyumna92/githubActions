import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ChromeDemo {

    WebDriver driver;

    @BeforeClass
    public void initDriver() {
        System.out.println("You are testing in chrome");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

    }

    @Test
    public void searchTestNGInGoogle() {

        driver.get("https://google.com");
        System.out.println("Tested Headless browser");
//        final String searchKey = "TestNG";
//        System.out.println("Search " + searchKey + " in google");
//        driver.navigate().to("https://www.google.com");
//        WebElement element = driver.findElement(By.name("q"));
//        System.out.println("Enter " + searchKey);
//        element.sendKeys(searchKey);
//        System.out.println("submit");
//        element.submit();
//        System.out.println("Got " + searchKey + " results");
    }

    @AfterClass
    public void quitDriver() {
   //     driver.quit();
    }
}

