package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import web.driverClass;

public class hw2Selenium {
    /**
           * Testcase-1
           *
           * Verify find your account link is displayed for incorrect credentials
           * username : %^&&*()
           * password: abcd@1234
           * Link --> Find your account and log in.
     */

     @Test
             public void setUserNameValue() {
         driverClass.openUrl("https://www.facebook.com/");
         String logInEmail="email";
         By logInEmailLocator= By.id(logInEmail);
         WebElement userNameTxtBox=driverClass.getDriver().findElement(logInEmailLocator);
         userNameTxtBox.sendKeys("%^&&*()");

     }
     @Test
    public void userPassword(){

         driverClass.openUrl("https://www.facebook.com/");
         String putPassword="pass";
         By putPasswordLocator= By.id(putPassword);
         WebElement passwordBox=driverClass.getDriver().findElement(putPasswordLocator);
         passwordBox.sendKeys("abcd@1234");
     }
}












