
package tests;

import org.testng.annotations.Test;
import com.example.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.pages.LoginPage;
import com.example.pages.DashboardPage;
import com.example.pages.SearchPage;
import com.example.pages.ItemBlock;;

public class AmlReportTest extends BaseTest  {
    @Test(priority = 5)
    public void validateamlreport(){
        driver.get("https://gocompliance-test.gosaas.io/");
        LoginPage loginpage=new LoginPage(driver);
        DashboardPage dash=new DashboardPage(driver);
        SearchPage sp=new SearchPage(driver);
        ItemBlock ib=new ItemBlock(driver);

        loginpage.LoginAs("wajahat.ahsen","Abcdef123@");


        dash.clickPM();
        sp.search("AUT-ITEM01",1);
        sp.open("AUT-ITEM01");
        ib.viewamlreport();




    }


    
}

