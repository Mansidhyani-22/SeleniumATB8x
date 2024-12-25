package org.example.Task23_12_2024;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class SeleniumTask23_2
{
    public static void main(String[] args)
    {

        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Mansi");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Dhyani");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-1")).click();
        driver.findElement(By.id("datepicker")).sendKeys("23dec2024");
        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-2")).click();

        //Thread.sleep(5000);


    }
}