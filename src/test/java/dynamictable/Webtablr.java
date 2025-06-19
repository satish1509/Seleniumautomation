package dynamictable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablr {

    public static void main(String[] args) {

        // Setup ChromeDriver (ensure chromedriver path is set)
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table[@id='taskTable']"));

        // Get the header row (optional use)
        List<WebElement> headers = table.findElements(By.xpath(".//thead/tr/th"));

        // Print headers
        System.out.println("Headers:");
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();

        // Get all data rows
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        // Print each row data
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int i = 0; i < cells.size(); i++) {
                System.out.print(cells.get(i).getText()+ "\t");
            }
            System.out.println(); // Move to next line after each row
        }

        // Close browser
        driver.quit();
    }
}
