import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {
	
		
	@Test
	public static void TestGoogle() throws Exception {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Searchhh";
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		Thread.sleep(5000);
		driver.quit();
	}
	
}
