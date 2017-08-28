package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\TESTING CODE\\testdata.xlsx");
		FileInputStream fls = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fls);
		XSSFSheet sheet1=   wb.getSheetAt(0);
		String data0 =		sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel is  " +data0);
	
		XSSFSheet sheet2=   wb.getSheetAt(1);
		String data1 =		sheet2.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel is  " +data1);
		wb.close();
	}

}
