package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelements {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		driver.findElement(By.id("email")).clear();
		
		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("kishore");
		uid.clear();
		uid.sendKeys("fghj");
		uid.clear();
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("dfghj");
		
		

	}

}
