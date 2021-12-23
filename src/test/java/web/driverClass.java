package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverClass {
    static  WebDriver driver;
    public static void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);}
    public static void quitPage(){
         driver.quit();
        }
    public static WebDriver getDriver() {
        return driver;
    }
}
