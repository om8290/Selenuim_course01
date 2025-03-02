package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class From {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable


        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//            driver.get("https://zoom.us/signin#/login");
//            driver.findElement(By.id("email")).sendKeys("omrastogi12@gmail.com");
//            driver.findElement(By.className("btn-block")).click();
//             System.out.println(driver.findElement(By.cssSelector("p.agree-terms")).getText());
         driver.get("https://practicetestautomation.com/practice-test-login/");
//              driver.findElement(By.linkText("HOME")).click();
//        driver.findElement(By.linkText("BLOG")).click();
//        driver.findElement(By.linkText("PRACTICE")).click();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Congratulations student. You successfully logged in!");
//        driver.findElement(By.linkText("Log out")).click();


//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("omrastogi12@gmail.com");

    }
}
