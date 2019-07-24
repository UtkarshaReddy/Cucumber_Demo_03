package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingData 
{
  @Test
  public void readExcelData() throws IOException 
  {
	  File src = new File("C:\\Users\\training_d2.03.07\\Desktop\\input.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  int rowCount = sheet1.getLastRowNum();
	  System.out.println("Total no.of rows is :" +rowCount);
	  for(int i=0;i<=rowCount;i++)
	  {
		  String Data = sheet1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("Test data from excel sheet is :" +Data);
		  
		  String Data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("Test data from excel sheet is :" +Data1);
	  }
	  wb.close();
  }
}
