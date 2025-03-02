package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class DropStatic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver web1= new ChromeDriver();
         web1.get("https://rahulshettyacademy.com/dropdownsPractise/");
         web1.getTitle();
         web1.manage().window().maximize();
// web1.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();


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
//        web1.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        web1.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

web1.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000L);
        List<WebElement> options = web1.findElements(By.cssSelector("li.ui-menu-item a"));
        Thread.sleep(3000L);
for(WebElement op: options){
     if(op.getText().equalsIgnoreCase("India")){
          op.click();
          break;
     }
}
        web1.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
 web1.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
  Thread.sleep(3000L);
web1.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(3000L);


         web1.quit();
// json wire protocaol


    }
}
