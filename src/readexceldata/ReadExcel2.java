package readexceldata;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fls = new FileInputStream("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\TESTING CODE\\testdata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fls);
	
		XSSFSheet sheet1=   wb.getSheetAt(0);
		int rowcount=  sheet1.getLastRowNum();
		int r= rowcount +1;
		System.out.println("total rows in sheet1 "+r);
		
		for (int i = 0; i < rowcount; i++) {
		String data0 =	sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("data from row "+i+" is "+data0);

		}

		XSSFSheet sheet2=   wb.getSheetAt(1);
		
		int rowcount1=  sheet2.getLastRowNum();
		int r1= rowcount1 +1;
		System.out.println("total rows in sheet2 "+r1);
		
		for (int i = 0; i < rowcount1; i++) {
		String data1 =	sheet2.getRow(i).getCell(0).getStringCellValue();
		System.out.println("data from row "+i+" is "+data1);

		}
		

		wb.close();
	}

}
