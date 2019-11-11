package packone;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) throws Exception{
		
		MethodsScreens m=new MethodsScreens();
		m.launchApp("http://yahoomail.com", "C:\\Users\\DELL\\Desktop\\WD8PM\\yahoo.png");
		m.launchApp("http://rediff.com", "C:\\Users\\DELL\\Desktop\\WD8PM\\rediff.png");
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WD8PM\\fb.png"));*/
		
		/*PO p=new PO();
		driver.findElement(p.uid).sendKeys("Kishore");
		driver.findElement(p.pwd).sendKeys("abcdefgh");
		
		PO p=PageFactory.initElements(driver, PO.class);
		p.uid1.sendKeys("Kishore");
		p.pwd1.sendKeys("abcdefgh");*/
		
		
		
		

	}

}
