package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TPBLoginObjects {

	WebDriver driver=null;
	
	By username=By.name("UserName");
	
	By password=By.name("SecureTextBox.Text");
	
	public TPBLoginObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void username(String uname) {
	
		driver.findElement(username).sendKeys(uname);
	}
	
	public void password(String pwd) {
		
		driver.findElement(password).sendKeys(pwd+Keys.ENTER);
	}
}
