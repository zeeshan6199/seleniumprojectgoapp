package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.*;



public class Declarationblock {
    WebDriver driver;

    public Declarationblock(WebDriver driver){
        this.driver=driver;

    }

    
    
   

    public void verifydec(){
        WebElement decb=driver.findElement(By.xpath("//div/span[contains(text(),'Declaration block')]"));
        Assert.assertTrue(decb.isDisplayed());
    }

    public void opentosupplier(){
         try {
            Thread.sleep(10000);
         } catch (Exception e) {
            // TODO: handle exception
         }
         WebElement opentosup=driver.findElement(By.xpath("//div/span[text()='Open to Supplier']"));
         try {
            Thread.sleep(3000);
         } catch (Exception e) {
            // TODO: handle exception
         }
        opentosup.click();
         
        try {
            Thread.sleep(5000);
         } catch (Exception e) {
            // TODO: handle exception
         }
        WebElement os=driver.findElement(By.xpath("//div[@slot='footer']//span[text()='Yes']/ancestor::button"));
        System.out.println("YES BUTTON FOUND?"+os);
        os.click();
    }
      public void submitdeclaration(){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        List<WebElement> dd=driver.findElements(By.xpath("//td/a[@class='oj-link-standalone']"));
        if(!dd.isEmpty()){
            dd.get(0).click();
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        WebElement submit=driver.findElement(By.xpath("//div/span[text()='Submit']"));
        try {
            Thread.sleep(3000);
         } catch (Exception e) {
            // TODO: handle exception
         }
        submit.click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        WebElement it=driver.findElement(By.xpath("//div[@slot='footer']//span[text()='Yes']/ancestor::button"));
        it.click();

        
    }

    public void approvedeclaration(){
        
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
        }
         WebElement home=driver.findElement(By.xpath("//span[@class='oj-ux-ico-home half oj-button-icon oj-start']"));
         home.click();
          List<WebElement> elements=driver.findElements(By.id("actionCardStyle"));
       if(!elements.isEmpty()){
          elements.get(0).click();
       }else{
          
       }
        List<WebElement> elep=driver.findElements(By.className("oj-tabbar-item-content"));
        if(!elep.isEmpty()){
            elep.get(3).click();
        }
        else{}
        WebElement declarationsearch=driver.findElement(By.xpath("//span[text()='Search']"));
        declarationsearch.click();

        try {
            Thread.sleep(25000);
        } catch (Exception e) {
            // TODO: handle exception
        }

         List<WebElement> decresult=driver.findElements(By.xpath("//td/a[@class='oj-link-standalone']"));
        if(!decresult.isEmpty()){
            decresult.get(0).click();
        }

       WebElement bvn=driver.findElement(By.xpath("//div/span[text()='Approve']"));
        try {
            Thread.sleep(3000);
         } catch (Exception e) {
            // TODO: handle exception
         }
        bvn.click();
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        WebElement bvnd=driver.findElement(By.xpath("//div[@slot='footer']//span[text()='Approve']/ancestor::button"));
        bvnd.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }
      


        


        
    }

    public void openaffectedobjects(){
        try {
            Thread.sleep(5000);
         } catch (Exception e) {
            // TODO: handle exception
         }
        List<WebElement> affobj=driver.findElements(By.xpath("div[@class='oj-tabbar-item-content']"));
        if(!affobj.isEmpty()){
            affobj.get(1).click();
        }
        WebElement afid=driver.findElement(By.xpath("//span[contains(@class, 'oj-icon-color-danger')]/following-sibling::a[contains(@class, 'oj-link-standalone')]"));
        afid.click();

    }



    
}
