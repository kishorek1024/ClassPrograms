package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement uid=driver.findElement(By.id("email"));
		a.contextClick(uid).build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		a.dragAndDrop(uid, uid).build().perform();
		
		a.clickAndHold(uid).build().perform();
		Thread.sleep(10000);
		a.release().build().perform();
		
		//WebElement login=driver.findElement(By.id("u_0_b"));
		//a.doubleClick(login).build().perform();
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		//driver.navigate().refresh();
		
		// Creating Webelement for Companies
		//WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Importing Actions Class
		
		
		// Move cursor to companies
		//a.moveToElement(companies).build().perform();
		
		// Clicking on About Companies
		//driver.findElement(By.xpath("//a[@title='About Companies']")).click();
		
		

	}

}
