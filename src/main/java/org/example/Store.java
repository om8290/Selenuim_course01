package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable if necessary
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        // Wait for the page to load and products to be displayed
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addItems(driver, itemsNeeded);
        driver.quit();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int itemsAdded = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        for (int i = 0; i <= products.size(); i++) {
            // Extract the product name and trim any extra spaces
            String[] nameParts = products.get(i).getText().split("-");
            String formattedName = nameParts[0].trim();

            // Check if the extracted name is in the list of items needed
            if (itemsNeededList.contains(formattedName)) {
                itemsAdded++;
                System.out.println((products.get(i)).getText());
                // Click the "Add to Cart" button corresponding to the current product
                products.get(i).findElement(By.xpath("following-sibling::div[@class='product-action']/button")).click();

                // Break the loop once all items are added to the cart
                if (itemsAdded == itemsNeededList.size()) {
                    break;
                }
            }
        }
        System.out.println(itemsAdded);
    }
}
