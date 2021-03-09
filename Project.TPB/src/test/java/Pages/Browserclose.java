package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Tests.TPBLogin;

public class Browserclose {
	
	WebDriver driver=null;
	
	By profilebutton=By.name("ProfileImage_header");
	
	By logoutbutton=By.linkText("Logout");

	public Browserclose(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void logout() throws InterruptedException {
		
		TPBLogin.getDriver().findElement(profilebutton).click();
		
		Thread.sleep(2000);
		
		TPBLogin.getDriver().findElement(logoutbutton).click();;
	}
	
	public void teardown() {
		
		TPBLogin.getDriver().close();
		
		TPBLogin.getDriver().quit();
	}
}
