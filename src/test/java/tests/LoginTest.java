

package tests;

import org.testng.annotations.Test;
import com.example.base.BaseTest;


import com.example.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test(priority = 1)

    public void testloginfunctionality(){
        driver.get("https://gocompliance-test.gosaas.io/");

        LoginPage loginpage=new LoginPage(driver);
        loginpage.LoginAs("*******","***********");

        
        
        
       

    }
    
}

