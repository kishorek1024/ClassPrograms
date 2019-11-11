package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String a=driver.findElement(By.id("email")).getAttribute("class");
		System.out.println(a);
		
		System.out.println(driver.findElement(By.id("email")).getTagName());
		System.out.println(driver.findElement(By.id("email")).getSize());
		System.out.println(driver.findElement(By.id("email")).getLocation());
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.id("email")).sendKeys("Kishore");
		/*boolean a=driver.findElement(By.id("email")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
*/
	}

}
