package com.example.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver=driver;
    }

    public void search(String value,int no){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        List<WebElement> elements=driver.findElements(By.tagName("oj-input-text"));
        if(!elements.isEmpty()){
            elements.get(no).click();
            elements.get(no).sendKeys(value);
            
        }else{

        }
        WebElement srch=driver.findElement(By.xpath("//span[text()='Search']"));
        srch.click();

    }
    public void open(String value){
        WebElement entity=driver.findElement(By.linkText(value));
        String ent=entity.getAttribute("href");
        driver.get(ent);
    }

    
}
