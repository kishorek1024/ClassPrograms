package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		int i; int j;
		
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("-----------------------------");
			driver.switchTo().parentFrame();
			
		}
		
		
		//System.out.println(frames.size());
		
		/*// Create Webelement for Frame
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		
		driver.switchTo().parentFrame();
		
		// Creating WebElement for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
*/
	}

}
