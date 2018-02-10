/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author tusshar
 */
public class LearnAutomation1 {

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
       
        List<WebElement> month_list = month_dd.getOptions();
        
        int total_month = month_list.size();
        
        System.out.println("Total Month Count is :"+total_month);
        
        for(WebElement ele:month_list)
        {
            String month_name =ele.getText();
            System.out.println("Months are ==>"+month_name);
            
            
        }
        
        
       
        
    }
    
}
