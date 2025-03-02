package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        // Set the path to the WebDriver executables


        // Initialize WebDriver instances
        WebDriver chromeDriver = new ChromeDriver();
//        WebDriver firefoxDriver = new FirefoxDriver();


            chromeDriver.get("https://www.youtube.com/");
            System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getCurrentUrl());
//chromeDriver.close();
 chromeDriver.quit();
  WebDriver edg1= new EdgeDriver();
   edg1.get("https://www.youtube.com/");



//            firefoxDriver.get("https://www.youtube.com/");


    }
}
