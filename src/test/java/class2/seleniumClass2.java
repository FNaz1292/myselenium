package class2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import web.driverClass;

import java.sql.Driver;

import static java.sql.Driver.*;

public class seleniumClass2 {
    @Test
    public void class2(){
        driverClass.openUrl("https://www.facebook.com/");
    }
@Test
    public void eg2(){
        driverClass.openUrl("https://www.hotels.com/");
    driverClass.getDriver().navigate().refresh();

    }

}
