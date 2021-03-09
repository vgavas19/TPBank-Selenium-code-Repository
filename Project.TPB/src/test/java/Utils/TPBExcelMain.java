package Utils;

public class TPBExcelMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		TPBExcelUtils excel=new TPBExcelUtils(projectpath+"/Excel/Data.xlsx", "Sheet1");
		
		excel.getrowcount();
		excel.getcelldataString(0, 0);
		excel.getcelldataNumber(1, 1);

	}

}
