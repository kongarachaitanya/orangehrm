package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\TESTING CODE\\testdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s= wb.getSheetAt(0);
		
		Row r= s.getRow(0);
		
		r.createCell(3).setCellValue("RESULT1");
		
		 r= s.getRow(1);
		r.createCell(3).setCellValue("PASS1");
		
		 r= s.getRow(2);
		r.createCell(3).setCellValue("PASS2");
		
		 r= s.getRow(3);
		r.createCell(3).setCellValue("PASS3");
		
		 r= s.getRow(4);
		r.createCell(3).setCellValue("FAIL1");
		r= s.getRow(5);
		r.createCell(3).setCellValue("PASS4");
		r= s.getRow(6);
		r.createCell(3).setCellValue("FAIL1");
		r= s.getRow(7);
		r.createCell(3).setCellValue("FAIL");
		
		FileOutputStream fot= new FileOutputStream("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\TESTING CODE\\testdata.xlsx");
		wb.write(fot);
		fot.close();
		
		
	}

}
