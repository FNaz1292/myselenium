package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class hw1Selenium {
    /**
     * * Write code in above test-method to perform below steps
     * 1. Launch amazon.com
     * 2. verify url of the launched is as expected
     */
    @Test
    public void websiteLaunch() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.amazon.com/";
        // driver.get("https//:amazon.com/");
        driver.navigate().to(url);

    }

    }

