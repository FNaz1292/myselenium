package class1;

import helperPackage.misc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
    /**
     * Testcase-2
     *
     * Verify find your account link is displayed if login with empty credentials on Messenger page
     * Link --> Find your account and log in.
     * Also, verify "Continue" button is displayed and enabled
     * verify "keep me signed in" check-box is not selected by default
     *
     */
    /*
    * Psuedo Code:
    * Step 1 open the Facebook web page.
    * Find the link to land on messenger page.
    * Find element for Messenger Login Button and click without putting any credentials.
    * find the locator for txt Find your account and Login
    *Find element for Continue Button.
    * use Is displayed and Is enabled button.
    * find the locator for "Keep me signed In"
    * By using assert statement verify if Check box is not selected by default
    */
    @Test
    public void linkDisplayed(){
        driverClass.openUrl("https://www.facebook.com");
        By hrefTag= By.xpath("//a[@href='https://messenger.com/']");
        WebElement aTag= driverClass.getDriver().findElement(hrefTag);
        aTag.click();
        misc.sleep(2);
        By messLoginButton= By.xpath("/button[@id='loginbutton']");
        WebElement loginButtonMess= driverClass.getDriver().findElement(messLoginButton);
        loginButtonMess.click();
        By messPageTxt= By.xpath("//a[starts-with(text(), 'Find your account and log in.')]");
        WebElement messLoginTxt= driverClass.getDriver().findElement(messPageTxt);
        boolean messPageTxtLogin =messLoginTxt.isDisplayed();
        misc.sleep(3);
        By buttonCont= By.id("loginbutton");
        WebElement continueButton= driverClass.getDriver().findElement(buttonCont);
        boolean button= continueButton.isEnabled();
        boolean buttonIsEnabled= continueButton.isDisplayed();
        By keepInSignedTxt= By.xpath("//label[contains(text(), \"Keep me signed in\")]");
        WebElement checkbox=driverClass.getDriver().findElement(keepInSignedTxt);
        Assert.assertFalse(checkbox.isSelected(),"Check box for Keep me signed is selected by Default");




    }

}












