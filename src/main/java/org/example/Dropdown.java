package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver web1= new ChromeDriver();

         web1.get("https://demo.guru99.com/test/newtours/register.php");
         Thread.sleep(3000L);
          web1.findElement(By.xpath("//input[@name='firstName']")).sendKeys("om rastogi");
        Thread.sleep(3000L);
        web1.findElement(By.xpath("//select[@name='country']")).click();
        Thread.sleep(3000L);
         WebElement optuins= web1.findElement(By.xpath("//select[@name='country']"));
        Select option= new Select(optuins);
        Thread.sleep(3000L);
        option.selectByValue("INDIA");
 web1.findElement(By.xpath("//input[@name='submit']")).click();
 Thread.sleep(3000L);
  String output = web1.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[3]")).getText();
        System.out.println(output);
      Assert.assertEquals(output, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
    }
}
