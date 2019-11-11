package gridd;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Sample {

	public static void main(String[] args) throws Exception{
		
		URL u=new URL("http://localhost:5555/wd/hub");
		DesiredCapabilities d=new DesiredCapabilities().firefox();
		
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		
		WebDriver driver=r;
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("Kishore");
		System.out.println(driver.getTitle());
		
		
		//RemoteWebDriver r1=new RemoteWebDriver(new URL(""), new DesiredCapabilities().firefox());

	}

}
