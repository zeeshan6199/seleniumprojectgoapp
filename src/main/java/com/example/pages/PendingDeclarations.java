package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import java.util.*;

public class PendingDeclarations {
    WebDriver driver;

    public PendingDeclarations(WebDriver driver){
        this.driver=driver;
    }

    public void verifypdscreen(){
        WebElement prtable=driver.findElement(By.xpath("//div[@slot='requests']"));
        System.out.println("INSIDE THE VERIFY PD BLOCK");
        Assert.assertTrue(prtable.isDisplayed());

        
    }
    public void opendeclaration(){
        try {
            
            Thread.sleep(30000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("INSIDE THE VERIFY OPEN DECLARATION SCREEN");
        List<WebElement> dds=driver.findElements(By.xpath("//td/a[@class='oj-link-standalone']"));
        if(!dds.isEmpty()){
            dds.get(1).click();
        }
        
    }
    
}
