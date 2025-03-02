package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        WebDriver web= new ChromeDriver();
         web.get("https://google.com");
         web.manage().window().maximize();
         web.navigate().to("https://practicetestautomation.com/practice-test-login/");
         web.navigate().back();
         web.navigate().forward();
    }
}
