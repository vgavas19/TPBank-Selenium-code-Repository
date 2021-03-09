package Tests;

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

import Pages.Browserclose;
import Pages.CreditCardLayoutDetails;
import Utils.TPBExcelUtils;
import Utils.TPBExceldataprovider;
import Tests.TPBLogin;

public class CreditCardLayout{

	WebDriver driver=null;

    @Test(priority=2,dataProviderClass=TPBExceldataprovider.class,dataProvider="Test1data")
    public void enterdetails(String cardt,String city1, String amt, String typ, String LS,String typ2,String SOKK, String tan, String lname,String mob,String mail,String natID,String thin) throws Exception {
    CreditCardLayoutDetails ccld=new CreditCardLayoutDetails(driver);

       ccld.entercardtype(cardt);
       
       ccld.enterBranch(city1);
       
       ccld.enteramount(amt);
       
       ccld.entertype(typ);
       
       ccld.enterleadsource(LS);
       
       ccld.entertype2(typ2);
       
       ccld.enterSOKKT(SOKK);
       
       ccld.enterthan(tan);
       
       ccld.enterlastname(lname);
       
       ccld.entermobile(mob);
       
       ccld.enteremail(mail);
       
       ccld.enternationalID(natID);
       
       ccld.entercity(thin);
       
       ccld.clicksavebutton();
       
       ccld.updatelead();
       
       ccld.NewButton();
    
    }
    
    @Test(priority=4)
    public void closebrowser() throws Exception {
    	
    	Browserclose bc=new Browserclose(driver);
    	
    	bc.logout();
    	
    	bc.teardown();
    }
}
