package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    //locators
    By usernamefield=By.id("LoginUser|input");
    By passwordfield=By.id("LoginPassword|input");

    By loginbtn=By.xpath("//span[text()='Sign in']");

    //actions
    public void enterusername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }

    public void enterpassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public void signinbtn(){
        driver.findElement(loginbtn).click();
    }

    public void LoginAs(String username,String password){
        enterusername(username);
        enterpassword(password);
        signinbtn();
    }
}
