package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\chaitanya\\Desktop\\DESKTOP\\TESTING CODE\\testdata.xlsx");
		//XSSFWorkbook 
		Workbook wb = WorkbookFactory.create(fis);
		
		int st = wb.getSheetIndex("sheet1");
		
		Sheet s = wb.getSheetAt(st);
		
		int rowcount = s.getLastRowNum();
		
		for(int i=1;i<rowcount+1;i++)
		{
			Row r = s.getRow(i);
			
			int cellcount = r.getLastCellNum();
			
			for(int j=0;j<cellcount;j++)
			{
				Cell c = r.getCell(j);
				
				if(c.getCellType()==c.CELL_TYPE_STRING)
				{
				String	s1 = c.getStringCellValue();
					
					System.out.println(s1);
				}
				else if (c.getCellType()==c.CELL_TYPE_NUMERIC) {
					
					String	s1 = String.valueOf(c.getNumericCellValue());
					
					System.out.println(s1);
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
