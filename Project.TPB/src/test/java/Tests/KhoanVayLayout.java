package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Pages.Browserclose;
import Pages.khoanVoyLayoutDetails;
import Utils.TPBExceldataprovider;

public class KhoanVayLayout {

	WebDriver driver=null;
	

	
	@Test(priority=3,dataProviderClass=TPBExceldataprovider.class,dataProvider="Test2data")
	public void enterKhoanVayLayoutDetails(String cardt,String LS,String city1,String StatusCode,String lname,String mob,String mail,String natID, String city2) throws Exception {

		khoanVoyLayoutDetails khld=new khoanVoyLayoutDetails(driver);

		khld.entercardtype(cardt);

		khld.enterleadsource(LS);

		khld.enterBranch(city1);

		khld.enterstatuscode(StatusCode);

		khld.enterlastname(lname);

		khld.entermobile(mob);

		khld.enteremail(mail);

		khld.enternationalID(natID);

		khld.entercity(city2);

		khld.clicksavebutton();

		khld.updatelead();

		khld.takeScreenshot();
		
		khld.NewButton();
		
		
		
	}
	
    @Test(priority=4)
    public void closebrowser() throws Exception {
    	
    	Browserclose bc=new Browserclose(driver);
    	
    	bc.logout();
    	
    	bc.teardown();
    }
}
