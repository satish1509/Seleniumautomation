package dynamictable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;
import java.util.*;

public class Brokenlink {
    public static void main(String[] args) throws Exception {

	 WebDriver driver = new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     for (WebElement link : driver.findElements(By.tagName("a"))) {
         String url = link.getAttribute("href");
         if (url == null || url.isEmpty()) continue;

         try {
             HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
             conn.setConnectTimeout(3000);
             conn.connect();
             int code = conn.getResponseCode();
             if (code >= 400) {
                 System.out.println("Broken: " + url + " -> " + code + " " + conn.getResponseMessage());
             }
             conn.disconnect();
         } catch (Exception e) {
             System.out.println("Error: " + url + " -> " + e.getMessage());
             break;
         }
     }

         }
}




