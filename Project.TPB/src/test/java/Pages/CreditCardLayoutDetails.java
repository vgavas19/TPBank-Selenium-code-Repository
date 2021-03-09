package Pages;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.TPBExcelUtils;
import Utils.TPBExceldataprovider;
import Tests.TPBLogin;

public class CreditCardLayoutDetails{

	WebDriver driver=null;

	By cardtype=By.name("LE_PRODUCT");
	
	By branch=By.xpath("//a[@data-autoid='LE_TERRITORY_srch']");
	
	By Branchsearchgridbox=By.name("Grid_SearchTextBox");
	
	By FirstRecordOfBranchSearch=By.xpath("//div[@data-autoid='Name_0']");
	
	By amount=By.xpath("//input[@data-autoid='LE_AMOUNT_ctrl']");
	
    By type=By.name("cust_339");

	By leadsource=By.name("LE_LEADSOURCE");

	By type2=By.name("cust_338"); 

	By SOKKT=By.name("cust_891");

	By Than=By.name("cust_890");

	By Lastname=By.name("LASTNAME");

	By Mobile=By.name("LE_MOBILE");

	By email=By.name("cust_193");

	By NationalID=By.name("cust_56");

	By City=By.name("cust_567");

	By Savebutton=By.xpath("//span[contains(text(),'Save')]");

	By Custdedupetext=By.xpath("//div[@data-autoid='ded_msg']");

	By leaddedupe=By.xpath("//div[@data-autoid='ded_msg']");

	By Ignorecreate=By.xpath("//button[contains(text(),'Ignore And Create')]");

	By dedupeupdatecheckbox=By.xpath("//label[@for='checkbox0']");

	By updatebutton=By.xpath("//button[contains(text(),'Update')]");

	By new_button=By.xpath("//label[contains(text(),'New')]");
	
	By credit_card=By.xpath("//span[contains(text(),'Thẻ tín dụng')]");
	
	By profilebutton=By.name("ProfileImage_header");
	
	By logoutbutton=By.linkText("Logout");

	public CreditCardLayoutDetails(WebDriver driver) {

		this.driver=driver;
	}

	public void entercardtype(String cardt) throws Exception {

		Select card=new Select(TPBLogin.getDriver().findElement(cardtype));
		Thread.sleep(2000);

		card.selectByVisibleText(cardt);

	}

	public void enteramount(String amt) {
		
		TPBLogin.getDriver().findElement(amount).sendKeys(amt);
		
	}  
	//@Test(priority=4,dataProviderClass=TPBExceldataprovider.class,dataProvider="Test1data")
	public void enterBranch(String city1) throws InterruptedException {
	
		
		Thread.sleep(3000);
		TPBLogin.getDriver().findElement(branch).click();
		Thread.sleep(3000);
		String parentwindow=TPBLogin.getDriver().getWindowHandle();

		Set window=TPBLogin.getDriver().getWindowHandles();

		Iterator i=window.iterator();

		while(i.hasNext()) {

			String popupwindow=(String) i.next();
			TPBLogin.getDriver().switchTo().window(popupwindow);
			System.out.println("while loop");
			Thread.sleep(3000);

			TPBLogin.getDriver().findElement(Branchsearchgridbox).sendKeys(city1+Keys.ENTER);

			Thread.sleep(3000);
			TPBLogin.getDriver().findElement(FirstRecordOfBranchSearch).click();

		}
		TPBLogin.getDriver().switchTo().window(parentwindow);
		System.out.println("while loop completed");
	}



	public void entertype(String typ) throws Exception {

		Select typedd=new Select(TPBLogin.getDriver().findElement(type));

		Thread.sleep(2000);

		typedd.selectByVisibleText(typ);
	}

	public void enterleadsource(String LS) throws Exception {

		Select leads=new Select(TPBLogin.getDriver().findElement(leadsource));

		Thread.sleep(2000);

		leads.selectByVisibleText(LS);
	}

	public void entertype2(String typ2) throws Exception {

		Select tyyp2=new Select(TPBLogin.getDriver().findElement(type2));

		Thread.sleep(2000);

		tyyp2.selectByVisibleText(typ2);
	}

	public void enterSOKKT(String SOKK) {

		TPBLogin.getDriver().findElement(SOKKT).sendKeys(SOKK);
	}

	public void enterthan(String tan) throws Exception {

		Select thann=new Select(TPBLogin.getDriver().findElement(Than));

		Thread.sleep(2000);

		thann.selectByVisibleText(tan);
	}

	public void enterlastname(String lname) {

		TPBLogin.getDriver().findElement(Lastname).sendKeys(lname);
	}

	public void entermobile(String mob) {

		TPBLogin.getDriver().findElement(Mobile).sendKeys(mob);
	}

	public void enteremail(String mail) {

		TPBLogin.getDriver().findElement(email).sendKeys(mail);
	}

	public void enternationalID(String natID) {

		TPBLogin.getDriver().findElement(NationalID).sendKeys(natID);
	}

	public void entercity(String thin) throws Exception {
		Select thinn=new Select(TPBLogin.getDriver().findElement(City));

		Thread.sleep(2000);

		thinn.selectByVisibleText(thin);
	}
	
	public void clicksavebutton() {
		
		TPBLogin.getDriver().findElement(Savebutton).click();
	}
	
	public void dedupepopup_ignorecreate() throws Exception {

		try
		{
		String parentwindow=TPBLogin.getDriver().getWindowHandle();

		Set window=TPBLogin.getDriver().getWindowHandles();

		Iterator i=window.iterator();

		while(i.hasNext()) {

			String popupwindow=(String) i.next();
			TPBLogin.getDriver().switchTo().window(popupwindow);
			System.out.println("while loop");
			Thread.sleep(3000);

		}
		Thread.sleep(5000);
	
		WebElement element1=TPBLogin.getDriver().findElement(leaddedupe);
		WebElement element= TPBLogin.getDriver().findElement(Custdedupetext);


		if (element1.equals(element)) {
			System.out.println("Inside If");
			TPBLogin.getDriver().findElement(Ignorecreate).click();

		} else {
			System.out.println("Inside else");
			TPBLogin.getDriver().findElement(Ignorecreate).click();
		}
		TPBLogin.getDriver().switchTo().window(parentwindow);

		System.out.println("while loop completed");
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			
			System.out.println(exp.getStackTrace());
	
		}

	}	
	public void updatelead() throws Exception {
		
		try {
		
		String parentwindow=TPBLogin.getDriver().getWindowHandle();

		Set window=TPBLogin.getDriver().getWindowHandles();

		Iterator i=window.iterator();

		while(i.hasNext()) {

			String popupwindow=(String) i.next();
			TPBLogin.getDriver().switchTo().window(popupwindow);
			System.out.println("while loop");
			Thread.sleep(3000);

		}
		Thread.sleep(5000);
	
		WebElement element1=TPBLogin.getDriver().findElement(leaddedupe);
		WebElement element= TPBLogin.getDriver().findElement(Custdedupetext);

		Thread.sleep(2000);
		
		if (element1.equals(element)) {
			System.out.println("Inside If");
			TPBLogin.getDriver().findElement(dedupeupdatecheckbox).click();
			Thread.sleep(2000);
			
			TPBLogin.getDriver().findElement(updatebutton).click();;

		} else {
			System.out.println("Inside else");
			TPBLogin.getDriver().findElement(dedupeupdatecheckbox).click();
			Thread.sleep(2000);
			
			TPBLogin.getDriver().findElement(updatebutton).click();;
		}
		TPBLogin.getDriver().switchTo().window(parentwindow);

		System.out.println("while loop completed");
		    Thread.sleep(2000);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());

			System.out.println(exp.getStackTrace());
		}
	}

   
    public void NewButton() throws InterruptedException {
    	Thread.sleep(4000);
    	
    	TPBLogin.getDriver().findElement(new_button).click();;

    	Thread.sleep(2000);
    	
    	TPBLogin.getDriver().findElement(credit_card).click();;
	}
    
}
