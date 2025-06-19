package dynamictable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Setup ChromeDriver (ensure chromedriver path is set)
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement alrt= driver.findElement(By.xpath("//button[@id='alertBtn']"));
            alrt.click();
        
        Alert alert=driver.switchTo().alert();
        
         alert.accept();
         
         WebElement conf= driver.findElement(By.xpath("//button[@id='confirmBtn']"));
  conf.click();
  
      alert.dismiss();
	
	
    WebElement prompt= driver.findElement(By.xpath("//button[@id='promptBtn']"));
  
    prompt.click();
    
    alert.sendKeys("srinivas");
    alert.accept();
    WebElement icon = driver.findElement(By.xpath("//img[@align='top']"));

 // Dimensions
 Dimension size = icon.getSize();
 System.out.println("Height: " + size.getHeight());
 System.out.println("Width: " + size.getWidth());

 // Alignment
 System.out.println("Alignment: " + icon.getAttribute("align"));

 // CSS alignment (optional)
 System.out.println("Float: " + icon.getCssValue("float"));

 // Color (note: may not work for images)
 System.out.println("Color: " + icon.getCssValue("color"));

	
	}
	
}
