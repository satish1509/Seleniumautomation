package dynamictable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shadowdomelements {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://testautomationpractice.blogspot.com/");
	        // Use a page that actually has Shadow DOM
	        WebElement dr = driver.findElement(By.xpath("//input[@id='comboBox']"));
	         dr.click();
	         WebElement dr2=  driver.findElement(By.xpath("//div[@id='dropdown']"));
	        System.out.println("CSS Display: " + dr2.getCssValue("display"));
	        System.out.println("CSS Visibility: " + dr2.getCssValue("visibility"));
	        System.out.println("CSS Opacity: " + dr2.getCssValue("opacity"));

	        System.out.println(dr2.getText());
	        List<WebElement> dropdownItems = driver.findElements(By.xpath("//div[@id='dropdown']/div"));
	        System.out.println("Dropdown item count: " + dropdownItems.size());


	        // Step 1: Locate the shadow host (Update the selector accordingly)
	        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
	        SearchContext shadowRoot = shadowHost.getShadowRoot(); ///

	        // Step 2: Locate inner shadow element with input field
	        WebElement searchInput = shadowRoot.findElement(By.cssSelector("input[type='text']"));
	        searchInput.click();
	        searchInput.sendKeys("selenium");
	        driver.findElement(By.partialLinkText("Youtu")).click();
	        driver.navigate().back();
	      
	      
	        
	        }
	        // Step 4: Perform action
		 
	}


