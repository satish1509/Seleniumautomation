package dynamictable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
    public static void main(String[] args) {
        // Set the path to your chromedriver executable

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();

       
            // Open the desired webpage
            driver.get("https://testautomationpractice.blogspot.com/");  // replace with your URL

            // Find all elements with tag name 'a' (all links)
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

            // Print the total number of links found
            System.out.println("Total links found: " + allLinks.size());

            // Iterate through all links and print their text and href attribute
            for (WebElement link : allLinks) {
            
                String text = link.getText().trim();
                if (!text.isEmpty() && text.contains("blog")) {
                    System.out.println("Link Text: " + text);
                    System.out.println("Link URL: " + link.getAttribute("href"));
                } else {
                    System.out.println("Not found or no visible text");
                    break;
                }
            }
            // Close the browser
        }
    }

