package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TPBExceldataprovider {
	
	WebDriver driver=null;
	
	
/*	@BeforeTest
	public void setuptest()
	{
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
	}*/
	
	//@Test(dataProvider="Test1data")
	public void test1(String Product,String territory) {
		System.out.println(Product+ "|" +territory);
		
	}	
	
	@DataProvider(name = "Testlogindata")
	public Object[][] getlogindata() {
		
		String projectpath=System.getProperty("user.dir");
		Object data[][]=testdata(projectpath+"/Excel/Data.xlsx", "Sheet2");
		return data;
	}
	
	@DataProvider(name = "Testlayoutdata")
	public Object[][] getlayout() {
		
		String projectpath=System.getProperty("user.dir");
		Object data[][]=testdata(projectpath+"/Excel/Data.xlsx", "Sheet3");
		return data;
	}
	
	@DataProvider(name = "Test2data")
	public Object[][] getKhoanVaydata() {
		
		String projectpath=System.getProperty("user.dir");
		Object data[][]=testdata(projectpath+"/Excel/Data.xlsx", "Sheet4");
		return data;
	}
	
	@DataProvider(name = "Test1data")
	public Object[][] getdata() {
		
		String projectpath=System.getProperty("user.dir");
		Object data[][]=testdata(projectpath+"/Excel/Data.xlsx", "Sheet1");
		return data;
	}
	
	
	public Object[][] testdata(String excelpath, String sheetname) {
		
		TPBExcelUtils excel=new TPBExcelUtils(excelpath, sheetname);
		
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		Object data[][]=new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for (int j = 0; j < colcount; j++) {
				
				String celldata=excel.getcelldataString(i, j);
				System.out.println("This is String:"+celldata);
				data[i-1][j]=celldata;

/*				double celldata1=excel.getcelldataNumber(i, j);
				System.out.println("This is integer:"+celldata1);
				data[i-1][j]=celldata1;*/

			}
		}
		
		return data;
	}
}
