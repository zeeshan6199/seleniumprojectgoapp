package com.example.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Request {
    WebDriver driver;

    //constructor
    public Request(WebDriver driver){
        this.driver=driver;
    }

    //locators
    By declarationtype=By.id("oj-select-2");
    By IPCA=By.xpath("//div[text()='IPC 1752A Declaration']");
    
    By type=By.xpath("//span[@title='Provide detailed substance-level information for all materials']");
    //specification
   


    public void reqipca(String spec){
        
        driver.findElement(declarationtype).click();
                try{
                Thread.sleep(15000);
            }catch (Exception e) {
            System.err.println("Error forcing menu open: " + e.getMessage());
        }
       driver.findElement(IPCA).click();
            try{
                Thread.sleep(6000);
            }catch (Exception e) {
            System.err.println("Error forcing menu open: " + e.getMessage());
        }
       List<WebElement> elements=driver.findElements(By.xpath("//a[@class='oj-combobox-arrow oj-combobox-icon oj-component-icon oj-clickable-icon-nocontext oj-combobox-open-icon']"));
        if(!elements.isEmpty()){
            elements.get(0).click();
        }else{

        };
        driver.findElement(type).click();
           try{
                Thread.sleep(6000);
            }catch (Exception e) {
            System.err.println("Error forcing menu open: " + e.getMessage());
        }
        WebElement title=driver.findElement(By.xpath("//label[text()='Specification']"));
        title.click();
        
         List<WebElement> els=driver.findElements(By.tagName("oj-select-one"));
         System.out.println(
            "Specifications dropdown" + els
         );
            if(!els.isEmpty()){
            
            els.get(1).sendKeys(spec);
            WebElement option = driver.findElement(By.xpath("//li/div[@aria-label='"+spec+"']"));
            option.click();
             
            }else{

            };

            WebElement cal=driver.findElement(By.xpath("//div/input[@class='oj-inputdatetime-input oj-text-field-input oj-component-initnode']"));
            cal.click();
            WebElement dat=driver.findElement(By.linkText("30"));
            dat.click();
             try{
                Thread.sleep(3000);
            }catch (Exception e) {
            System.err.println("Error forcing menu open: " + e.getMessage());
        };
            WebElement crt=driver.findElement(By.xpath("//div[@slot='footer']//span[text()='Create']/ancestor::button"));
            System.out.println(
            "the create btn" + crt
         );
            crt.click();






        }


    




    
}
