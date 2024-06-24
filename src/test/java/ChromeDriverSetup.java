import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ChromeDriverSetup {

    public void chromedriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.get("https://www.flightcentre.com.au/");

       // driver.get("https://image.travel.flightcentre.com.au/lib/fe921…c71/m/1/9e9a699d-91f8-403a-99cf-68ba7cb11828.jpeg\n");
      driver.findElement(By.className("fc-close-btn")).click();

        WebElement origin = driver.findElement(By.id("origin"));
        origin.sendKeys("");
        driver.findElement(By.id("origin-option-1")).click();

        WebElement destination = driver.findElement(By.id("destination"));
        destination.sendKeys("");
        driver.findElement(By.id("destination-option-0")).click();






    }

}


