package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class AffectedPage {
    WebDriver driver;
    public AffectedPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterfmd(String m){
        WebElement fmd=driver.findElement(By.id("mass|input"));
        fmd.sendKeys(m);
    }
    public void declarecompliance(int option){
        List<WebElement> coms=driver.findElements(By.xpath("//input[@class='oj-combobox-input']"));
        if(!coms.isEmpty()){
            coms.get(0).click();
        }
        List<WebElement> decs=driver.findElements(By.tagName("oj-option"));
        if(!decs.isEmpty()){
            decs.get(option).click();
        }

    }
    public void savedeclaration(){
        WebElement sav=driver.findElement(By.xpath("//oj-button[@id='saveAndClose']"));
        sav.click();

    }

  
    
}
