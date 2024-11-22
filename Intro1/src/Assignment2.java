import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"))
				.sendKeys("Akshay");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Akshay123@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Akshay@123");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement Sdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropdown = new Select(Sdropdown);
		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.name("bday")).sendKeys("19-04-1999");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
