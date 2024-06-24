import com.test.page.SearchPage;
import com.test.page.SearchResultsPage;
import com.test.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking {

    WebDriver driver;

    @BeforeMethod
    public void chromedriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver

        driver =  new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://www.flightcentre.com.au/");

        driver.findElement(By.className("fc-close-btn")).click();
    }


    @Test(priority = 1)
    public void testSearchPage(){

        SearchPage searchPage = new SearchPage(driver);
        SearchResultsPage resultsPage = new SearchResultsPage(driver);

       searchPage.origin("");
        System.out.println("Origin passed");

        searchPage.destination("");
        System.out.println("Destination passed");

        searchPage.travelDates();

     //   Assert.assertEquals("Search flights", searchPage.getSearchFlight().getText());
        searchPage.searchFlight();
//      wait.wait(driver, 30);
//        System.out.println("wait worked");
        resultsPage.ButtonWrapper();

    }

   // }
}