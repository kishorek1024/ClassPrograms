package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO {
	
	/*By uid=By.id("email");
	By pwd=By.id("pass");*/
	
	
	// Second Way
	
	@FindBy(id="email") WebElement uid1;
	@FindBy(id="pass") WebElement pwd1;
	
	

}
