package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class DashboardPage{
       WebDriver driver;

       //Constructor

       public DashboardPage(WebDriver driver){
            this.driver=driver;

       }
       


      
       

       //actions

       public void clickPM(){
          List<WebElement> elements=driver.findElements(By.id("actionCardStyle"));
       if(!elements.isEmpty()){
          elements.get(0).click();
       }else{
          
       }
        
       }

}