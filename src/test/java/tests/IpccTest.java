
package tests;

import org.testng.annotations.Test;
import com.example.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.pages.LoginPage;
import com.example.pages.DashboardPage;
import com.example.pages.SearchPage;
import com.example.pages.Mpnblock;
import com.example.pages.Request;
import com.example.pages.Declarationblock;
import java.util.*;
import com.example.pages.PendingDeclarations;
import com.example.pages.AffectedPage;

public class IpccTest extends BaseTest {
    @Test(priority = 3)
    public void ipcclasscflow(){
        driver.get("https://gocompliance-test.gosaas.io/");

        LoginPage loginpage=new LoginPage(driver);
        DashboardPage dash=new DashboardPage(driver);
        SearchPage sp=new SearchPage(driver);
        Mpnblock mpn=new Mpnblock(driver);
        Request req=new Request(driver);
        Declarationblock decb=new Declarationblock(driver);
        PendingDeclarations pd=new PendingDeclarations(driver);
        AffectedPage afg=new AffectedPage(driver);


        loginpage.LoginAs("wajahat.ahsen","Abcdef123@");

        dash.clickPM();
        List<WebElement> ele=driver.findElements(By.className("oj-tabbar-item-content"));
        if(!ele.isEmpty()){
            ele.get(2).click();
        }
        else{}
        WebElement cross=driver.findElement(By.xpath("//span[@class='oj-ux-icon-size-md oj-text-color-secondary cursor-pointer oj-ux-ico-close undefined']"));
        cross.click();
        
       sp.search("AUT-MPN01",1);
       sp.open("AUT-MPN01");
       try{
        Thread.sleep(10000);
       }catch (Exception e) {
    System.err.println("Error forcing menu open: " + e.getMessage());
}
       mpn.requestcompliance();
       req.reqipca("AUT-SPECIFICATIONPART");
       decb.verifydec();
       decb.opentosupplier();
       pd.opendeclaration();
       afg.enterfmd("10");
       afg.declarecompliance(1);
       afg.savedeclaration();
       decb.submitdeclaration();
       decb.approvedeclaration();
       
       
       

      
       






       


        
        
        
       

    }

}

