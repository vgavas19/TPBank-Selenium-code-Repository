package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TPBExcelUtils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public TPBExcelUtils(String excelpath, String sheetname) {
		try {
		
		
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		//getrowcount();
		getcelldataString(0,0);
		getcelldataNumber(1,1);
	}

	public static int getrowcount() {
		int rowcount=0;
		
		try {
			

		rowcount=sheet.getPhysicalNumberOfRows();
		
		
		System.out.println("No of Rows:"+rowcount);
		
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowcount;
	}
	
	public static int getcolcount() {
         int colcount=0;
		try {


			colcount=sheet.getRow(0).getPhysicalNumberOfCells();


			System.out.println("No of columns:"+colcount);

		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colcount;
	}

	public static String getcelldataString(int rowNum, int columnNum) {
        String celldata=null;
		try {
		
		DataFormatter formatter = new DataFormatter();
		celldata = formatter.formatCellValue(sheet.getRow(rowNum).getCell(columnNum));
		celldata=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		
		System.out.println(celldata);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
		return celldata;
	}
	
	public static int getcelldataNumber(int rowNum,int colNum) {
		int celldata1 = 0;
		try {

			celldata1=(int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(celldata1);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
		return celldata1;
	}
	    
}
