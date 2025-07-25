package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.testng.Assert;


public class ItemBlock {
    WebDriver driver;

    public ItemBlock(WebDriver driver){
        this.driver=driver;
    }

    public void viewamlreport(){
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        WebElement reportbtn=driver.findElement(By.xpath("//button/.//span[text()='Reports']"));
        reportbtn.click();
        
        WebElement amlr=driver.findElement(By.id("amlReport"));
        amlr.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }


        List<WebElement> rwexpand=driver.findElements(By.tagName("oj-row-expander"));
        Assert.assertEquals(2, rwexpand.size());




    }

    public void viewbomreport(){
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        WebElement reportbtn=driver.findElement(By.xpath("//button/.//span[text()='Reports']"));
        reportbtn.click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        WebElement bomr=driver.findElement(By.id("bomReport"));
        bomr.click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        List<WebElement> specs=driver.findElements(By.xpath("//ul[@class='oj-select-choices']"));
        if(!specs.isEmpty()){
            specs.get(1).click();
            WebElement sl1=driver.findElement(By.xpath("//div[text()='AUT-SPECIFICATIONHOMOG']"));
           
            sl1.click();
            WebElement genr=driver.findElement(By.xpath("//div[@class='oj-button-label']//span[text()='Generate']/ancestor::button"));
            genr.click();

             try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
         WebElement status=driver.findElement(By.xpath("//*[contains(text(),'Compliant')]"));
         assert status.isDisplayed();

         WebElement cancel=driver.findElement(By.xpath("//span[@aria-label='AUT-SPECIFICATIONHOMOG remove']"));
         cancel.click();
          try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
        List<WebElement> specs2=driver.findElements(By.xpath("//ul[@class='oj-select-choices']"));
        
         specs2.get(1).click();
         WebElement sl2=driver.findElement(By.xpath("//div[text()='AUT-SPECIFICATIONPART']"));
         sl2.click();
         WebElement genre=driver.findElement(By.xpath("//div[@class='oj-button-label']//span[text()='Generate']/ancestor::button"));
         genre.click();
         try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
         WebElement statuses=driver.findElement(By.xpath("//*[contains(text(),'Non-compliant')]"));
         assert statuses.isDisplayed();






        }
     

      


    }



