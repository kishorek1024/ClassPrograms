package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr"));
		List<WebElement> col=table.findElements(By.tagName("th"));
		System.out.println(col.size());
		
		int i;
		
		for(i=1; i<=col.size(); i++){
			//System.out.println(table.findElement(By.xpath("tr[1]/th[" + i + "]")).getText());
			
			System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr/th[" + i + "]")).getText());
			
		}
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[3]/td[3]")).getText());
		
		/*List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> r=table.findElements(By.tagName("tr"));
		System.out.println(r.size());
		
		String xpath1="tr[";
		String xpath2="]/td[1]/a";
		int i;
		
		for(i=1; i<=r.size(); i++){
			//System.out.println(table.findElement(By.xpath("tr[" + i + "]/td[1]/a")).getText());
			System.out.println(table.findElement(By.xpath(xpath1+i+xpath2)).getText());
		}*/
		
		//driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody")).findElements(By.tagName("tr"))
		
	}

}
