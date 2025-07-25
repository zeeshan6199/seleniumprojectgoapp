package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class Mpnblock {
    WebDriver driver;

    public Mpnblock(WebDriver driver){
        this.driver = driver;
    }

    public void requestcompliance() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement complianceDropdownButton = null;

        System.out.println("Attempting to locate 'Compliance' button...");
        try {
            complianceDropdownButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[.//span[text()='Compliance']] | //div[@role='button'][.//span[text()='Compliance']]")
            ));
            System.out.println("'Compliance' button located.");
        } catch (Exception e) {
            System.err.println("Could not locate 'Compliance' button: " + e.getMessage());
            return;
        }

        try {
            try {
    // First click using JS to make sure Oracle JET reacts
    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].click();", complianceDropdownButton
    );
    System.out.println("Clicked 'Compliance' using JavaScript.");
    Thread.sleep(500); // Wait for Oracle JET to try rendering
} catch (Exception e) {
    System.err.println("Failed clicking Compliance button: " + e.getMessage());
}

// Force the menu open if Oracle JET doesn't display it
try {
    ((JavascriptExecutor) driver).executeScript(
        "const menu = document.querySelector('oj-menu.oj-menu-dropdown');" +
        "if(menu){ menu.style.display='block'; menu.setAttribute('aria-hidden','false'); }"
    );
    System.out.println("Forced open dropdown via JavaScript.");
    Thread.sleep(500);
} catch (Exception e) {
    System.err.println("Error forcing menu open: " + e.getMessage());
}
        } catch (Exception e) {
            System.err.println("Standard click failed, attempting JS click...");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", complianceDropdownButton);
        }

        // Allow dropdown time to render
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for oj-menu to appear (without using dynamic ID)
        WebElement menu = null;
        try {
            menu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//oj-menu[contains(@class,'oj-menu-dropdown') and @aria-hidden='false']")
            ));
            System.out.println("Dropdown menu is now visible.");
        } catch (Exception e) {
            System.err.println("Dropdown menu did not become visible: " + e.getMessage());
            return;
        }

        // Locate the "Request compliance from supplier" option
        WebElement requestComplianceOption = null;
        try {
            requestComplianceOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//oj-option//span[normalize-space()='Request compliance from supplier']")
                ));
            System.out.println("Found 'Request compliance from supplier' option.");
        } catch (Exception e) {
            System.err.println("Could not find dropdown option: " + e.getMessage());
            return;
        }

        // Attempt to click the option
        try {
            requestComplianceOption.click();
            System.out.println("Clicked 'Request compliance from supplier' successfully.");
        } catch (Exception e) {
            System.err.println("Standard click failed. Trying JavaScript click...");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", requestComplianceOption);
            System.out.println("JavaScript click executed.");
        }

        // Optional: Wait for the result of the action
        // Example: wait for a dialog or notification
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'oj-dialog')]")
            ));
            System.out.println("Compliance request dialog appeared.");
        } catch (Exception e) {
            System.out.println("No dialog appeared, continuing anyway.");
        }
    }
}