import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintro1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\aksha\\Documents\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		  driver.findElement(By.id("inputUsername")).sendKeys("akshay");
		  driver.findElement(By.name("inputPassword")).sendKeys("akshay");
		  driver.findElement(By.className("signInBtn")).click();
		  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
		  "akshay");
		  driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(
		  "akshay");
		 		
	
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("akshay@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("987654321");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.id("inputUsername")).sendKeys("akshay");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
	}

}
