package dynamictable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceautomation {
	public static void main(String[] args) {

	   WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();
       driver.get("https://testautomationpractice.blogspot.com/");
      WebElement input= driver.findElement(By.xpath("//input[@id='name']"));

   // Get size
   Dimension size = input.getSize();
   System.out.println("Width: " + size.getWidth());
   System.out.println("Height: " + size.getHeight());

   // Get styles
   System.out.println("Font Size: " + input.getCssValue("font-size"));
   System.out.println("Font Family: " + input.getCssValue("font-family"));
   System.out.println("Background Color: " + input.getCssValue("background-color"));
   System.out.println("Text Color: " + input.getCssValue("color"));

}
}