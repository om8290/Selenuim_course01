package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DropStatic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver web1= new ChromeDriver();
         web1.get("https://rahulshettyacademy.com/dropdownsPractise/");
         web1.getTitle();
         web1.manage().window().maximize();



        WebElement staticdrop= web1.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select= new Select(staticdrop);
         select.selectByIndex(1);
         System.out.println(select.getFirstSelectedOption().getText());
         web1.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(2000L);


          for(int i=0; i< 5;i++){
              web1.findElement(By.id("hrefIncAdt")).click();
          }
        Thread.sleep(2000L);


         web1.findElement(By.id("btnclosepaxoption")).click();

web1.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        web1.findElement(By.xpath("//a[@value='BKK']")).click();
        Thread.sleep(2000L);
        web1.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
// json wire protocaol


    }
}
