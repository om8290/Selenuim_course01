package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Assignemnt {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver web1= new ChromeDriver();
        web1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         web1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement forgotPassword =web1.findElement(By.cssSelector("p.oxd-text.oxd-text--p.orangehrm-login-forgot-header"));
        System.out.println("Forgot Password Text: " + forgotPassword.getText());

        WebElement name = web1.findElement(By.xpath("//input[@name='username']"));
        name.sendKeys("Admin");
        WebElement password = web1.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");

        WebDriverWait wait = new WebDriverWait(web1, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));


        loginButton.click();
        System.out.println("Page Title after login: " + web1.getTitle());


        WebElement dashboardText = web1.findElement(By.tagName("h6"));
        System.out.println("Dashboard Heading: " + dashboardText.getText());
        File screenshot = ((ChromeDriver) web1).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Om Rastogi\\Desktop\\selnium\\screenshot.png"));
        System.out.println("Screenshot taken successfully");

        // Close the browser
        web1.quit();

    }
}
