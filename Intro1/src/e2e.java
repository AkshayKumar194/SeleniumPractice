import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		int i = 1;
		Thread.sleep(2000);
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		for (int j = 1; j < 4; j++) {
			driver.findElement(By.id("hrefIncChd")).click();

		}
		driver.findElement(By.id("hrefIncInf")).click();

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select Sdropdown = new Select(dropdown);
		Sdropdown.selectByValue("INR");

		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		System.out.println("done");
		// driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		// driver.findElement(By.)

		// ****Handling java alert using selenium***
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("name")).sendKeys(text);
		 * driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 * driver.findElement(By.id("confirmbtn")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().dismiss();
		 */
	}

}
