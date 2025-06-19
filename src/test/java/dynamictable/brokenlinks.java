package dynamictable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='broken-links']/a[@class='link']"));
           System.out.println("total broken links are"+ links.size());
          
        for (int i = 0; i < links.size(); i++) {
            // Re-locate links each time to avoid stale element issue
            links = driver.findElements(By.xpath("//div[@id='broken-links']/a[@class='link']"));
        
System.out.println(links.get(i).getText());
            links.get(i).click();  // click the link
            Thread.sleep(2000);    // wait for page to load

            System.out.println("Title: " + driver.getTitle());  // print title

            driver.navigate().back();  // go back
            Thread.sleep(2000);        // wait for page to load
        }

    }

	}


