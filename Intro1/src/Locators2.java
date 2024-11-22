import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators2  {

	public static void main(String[] args) throws InterruptedException {
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];



	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.
	System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

	

	// Sibling - Child to parent traverse

	//header/div/button[1]/following-sibling::button[1]

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


	//0th index - rahulshettyacademy

	//1st index - to Login.
}
}
}