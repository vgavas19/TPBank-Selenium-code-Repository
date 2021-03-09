package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.TPBLeadsObject;
import Pages.TPBLoginObjects;
import Utils.TPBExcelUtils;
import Utils.TPBExceldataprovider;
import Tests.CreditCardLayout;

public class TPBLogin {

	public static WebDriver driver=null;
	
    public static WebDriver getDriver() {
        return driver;
    }
	
    
	@BeforeTest
	public void setuptest()
	{
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test(priority=0,dataProviderClass=TPBExceldataprovider.class,dataProvider="Testlogindata")
 public void loginpage(String uname,String pwd) {
	    
	    driver.manage().window().maximize();
	    	    
	    TPBLoginObjects login=new TPBLoginObjects(driver);
	    
	    driver.get("http://tpbnk.crmnext.com/g7/app/CRMNextObject/Home/Lead");
	    
	    login.username(uname);
	    
	    login.password(pwd);
 }
 
	@Test(priority=1,dataProviderClass=TPBExceldataprovider.class,dataProvider="Testlayoutdata")
 public void Newlayout(String layoutName) throws InterruptedException{
	 
     TPBLeadsObject newlay=new TPBLeadsObject(driver);
	 
	 newlay.select_layout(layoutName);
 }

}
