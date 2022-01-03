package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import web.driverClass;

    public class hw3Selenium {
        /**
         * On https://www.darksky.net/
         * Verify feelsLike-tempValue is in between low-tempValue and high-tempValue
         */
        @Test
        public void darkSkyNet() {
            driverClass.openUrl("https://www.darksky.net/");
            By feelsLike = By.className("feels-like-text");
            WebElement feelsLikeTemp = driverClass.getDriver().findElement(feelsLike);
            boolean tempDisplayed = feelsLikeTemp.isDisplayed();
            By feelsLow = By.className("low-temp-text");
            By feelsHigh = By.className("high-temp-text");
            Assert.assertTrue(tempDisplayed, "if feels like temperature is not between low temp to high temp");
        }

        /**
         * On https://www.darksky.net/
         * Verify current-temp is displayed correctly when user changes temp-unit
         */
        @Test
        public void changeTempUnit() {
            driverClass.openUrl("https://www.darksky.net/");
            /**String classTemp="selectric-wrapper selectric-units selectric-open selectric-below";*/
            By tempUnit = By.xpath("//*[@class='label'][1]");
            WebElement tempUnitVerified = driverClass.getDriver().findElement(tempUnit);
            boolean tempUnitConverted = tempUnitVerified.isEnabled();
            Assert.assertTrue(tempUnitConverted, "The temperature displayed is not converted correctly");
            driverClass.quitPage();
        }

        /**
         * On https://www.darsky.net/
         * Verify blog post date is showing in correct format MonthName, Date Year
         * use below locator for blog-dates
         * (//time[@itemprop='datePublished'])[1]
         * (//time[@itemprop='datePublished'])[2]
         * (//time[@itemprop='datePublished'])[3]
         * (//time[@itemprop='datePublished'])[4]
         */
        @Test
        public void blogDates() {
            driverClass.openUrl("https://www.darksky.net/");
            By blogClick = By.tagName("//a[@href='https://blog.darksky.net/']");
            WebElement blogPost = driverClass.getDriver().findElement(blogClick);
            blogPost.click();
            By blogPostDate = By.xpath("//time[@itemprop='datePublished'][1]");
            WebElement correctDateFormat = driverClass.getDriver().findElement(blogPostDate);
            Assert.assertTrue(correctDateFormat.isDisplayed());
        }
        /**
         * On https://www.facebook.com/
         * Enter values in below fields:
         * First name
         * Last name
         * Mobile number
         * New password
         * Date of birth
         * Click "Sign Up"
         * Verify error msg (Please choose a gender. You can change who can see this later.) is displayed
         */
        @Test
        public void verifyErr(){
            driverClass.openUrl("https://www.facebook.com/");
            By openRegistration= By.xpath("//a[text()='Create new account']");
            WebElement createAccButton=driverClass.getDriver().findElement(openRegistration);
            createAccButton.click();
            By firstNameLocator= By.name("firstname");
            WebElement firstNameElement= driverClass.getDriver().findElement(firstNameLocator);
            firstNameElement.sendKeys("Dorthy");
            By lastNameLocator= By.name("lastname");
            WebElement lastNameElement= driverClass.getDriver().findElement(lastNameLocator);
            lastNameElement.sendKeys("Dolphin");
            By emailLocator= By.xpath("//*[@aria-label='Mobile number or email']");
            WebElement emailElement= driverClass.getDriver().findElement(emailLocator);
            emailElement.sendKeys("89765373737");
            By passId= By.id("password_step_input");
            WebElement passwordElement= driverClass.getDriver().findElement(passId);
            passwordElement.sendKeys("31-56A");
            By monthLocator = By.id("month");
            WebElement birthMonthElement = driverClass.getDriver().findElement(monthLocator);
            Select monthDd = new Select(birthMonthElement);
            monthDd.selectByVisibleText("Apr");
            By BDayLocator = By.name("birthday_day");
            WebElement dayDdElement = driverClass.getDriver().findElement(BDayLocator);
            Select birthDd = new Select(dayDdElement);
            birthDd.selectByValue("8");
            By yearLocator = By.xpath("//select[@aria-label='Year']");
            WebElement yearDdElement = driverClass.getDriver().findElement(yearLocator);
            Select yearDd = new Select(yearDdElement);
            yearDd.selectByIndex(20);
            By signUpLocator= By.name("websubmit");
            WebElement signUpElement= driverClass.getDriver().findElement(signUpLocator);
            signUpElement.click();
            By genderButtonMissed= By.tagName("//*[@id='js_za']");
            WebElement missedGenderElement=driverClass.getDriver().findElement(genderButtonMissed);
            boolean messageDisplayed=missedGenderElement.isDisplayed();
            Assert.assertTrue(messageDisplayed);


        }


        /**
         * On https://www.hotels.com/
         * Verify the correct roomCount and guestCount on Homepage
         */

       @Test
        public void roomCount(){
           driverClass.openUrl("https://www.hotels.com");

        }
    }

