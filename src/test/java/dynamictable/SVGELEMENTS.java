package dynamictable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGELEMENTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
	
        WebElement greenRect = driver.findElement(
                By.xpath("//*[local-name()='svg']//*[local-name()='rect' and @fill='green']")
            );

            // Interact with the SVG element
            Actions actions = new Actions(driver);
            actions.moveToElement(greenRect).click().perform();

            // Optional: print attributes
            System.out.println("X: " + greenRect.getAttribute("x"));
            System.out.println("Y: " + greenRect.getAttribute("y"));
            System.out.println("Width: " + greenRect.getAttribute("width"));
            System.out.println("Height: " + greenRect.getAttribute("height"));
	}

}
