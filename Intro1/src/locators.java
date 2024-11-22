import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		  WebElement Username = driver.findElement(By.name("username"));
		  Username.sendKeys("Admin"); System.out.println(Username.getAttribute(""));
		  //Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"
		  ); driver.findElement(By.xpath("//button[text()= ' Login ']")).click();
			/*
			 * System.out.println(driver.findElement(By.xpath(" //button[text()= ' Login ']"
			 * )).getText());
			 * System.out.println(driver.findElement(By.xpath(" //button[text()= ' Login ']"
			 * )).getAttribute("Value"));
			 */ 
		  driver.findElement(By.tagName("svg")).isDisplayed();
		  Thread.sleep(3000); //driver.close();
		 
		
		
		/*
		 * WebElement search =
		 * driver.findElement(By.cssSelector("#search-input.ytd-searchbox-spt input "));
		 * search.sendKeys("a2d"); search.sendKeys(Keys.ENTER); //
		 * driver.findElement(By.xpath("(//div[@id='thumbnail'])[5])")).click();
		 * driver.findElement(By.tagName("yt-formatted-string")).click();
		 */
		
	}

}
