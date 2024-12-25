package org.example.Ex_18_12_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;


public class Selenium02 {
    @Test
    public void selenium_test(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
