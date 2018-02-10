/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author tusshar
 */
public class LearnAutomation {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.facebook.com");
        
        driver.manage().window().maximize();
        
        WebElement month_dropdown =driver.findElement(By.id("month"));
        
        Select month_dd= new Select(month_dropdown);
        
        WebElement month_value= month_dd.getFirstSelectedOption();
        
        //It should return month
        System.out.println("After selection value is :"+month_value.getText());
        
       //It will select MAY Month
        month_dd.selectByIndex(5);
        
       // month_dd.deselectByValue("feb");
       WebElement month_value1= month_dd.getFirstSelectedOption();
        
        System.out.println("After selection value is :"+month_value1.getText());
       
       Thread.sleep(5000);
       
       driver.quit();
        
        System.out.println("Testing End");
        
    }
    
}
