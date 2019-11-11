package testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_App {
	
	@Test
	public void Test1(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Kishore");		
		SoftAssert s=new SoftAssert();		
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		s.assertEquals(a, false);
		//Assert.assertEquals(a, false);
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		s.assertEquals(b, false);
		//Assert.assertEquals(b, true);
		System.out.println(driver.getTitle());
		driver.close();
		s.assertAll();
		
		
	}

}
