import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		// implicit wait - 2 seconds time out

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		int i = 1;
		Thread.sleep(2000);
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int j = 1; j < 4; j++) {
			driver.findElement(By.id("hrefIncChd")).click();

		}
		System.out.println(driver.findElement(By.id("hrefIncChd")).getText());
		//
		driver.findElement(By.id("hrefIncInf")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
