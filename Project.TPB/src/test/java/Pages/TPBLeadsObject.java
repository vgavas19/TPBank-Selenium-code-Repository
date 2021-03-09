package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TPBLeadsObject{
	
	WebDriver driver=null;

	By new_button=By.xpath("//label[contains(text(),'New')]");
	
	public TPBLeadsObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void select_layout(String layoutName) throws InterruptedException {
		
		By selectLayout=By.xpath("//span[contains(text(),'"+layoutName+"')]");
		
		driver.findElement(new_button).click();;
		
		Thread.sleep(2000);
		
		driver.findElement(selectLayout).click();;
	}
}
