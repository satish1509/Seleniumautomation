package dynamictable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmautomation {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        // 1. Launch the application
        driver.get("https://quality-matrix.us/hr/orangehrm-5.7/web/index.php/auth/login"); // Replace with your actual URL
        driver.manage().window().maximize();

        // 2. Perform login
        Orangehrmautomation obj = new Orangehrmautomation();
        obj.enterUsername("admintwo");
        obj.enterPassword("Admintwo@123");
        obj.clickLogin();

        // 3. Click on My Info tab
        driver.findElement(By.xpath("//span[text()='My Info']")).click();

        // 4. Get text from 4th input field
        String str = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).getAttribute("value");
        System.out.println("Fetched Value: " + str);
    }

    public void enterUsername(String username) {
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    public boolean isLoginPageDisplayed() {
        WebElement loginHeader = driver.findElement(By.xpath("//h5[text()='Login']"));
        return loginHeader.isDisplayed();
    }
}
