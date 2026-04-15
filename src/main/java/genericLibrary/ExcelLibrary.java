package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary implements FrameworkConstant{

	public FileInputStream fis;
	public FileOutputStream fos;
	public Workbook book;

	public String readSingleData(String sheetname, int rownum, int columnnum) {
		
		try {
			fis = new FileInputStream(excelpath);
		} 
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		try {
			book = WorkbookFactory.create(fis);
		}
		catch(EncryptedDocumentException|IOException e) {
			e.printStackTrace();
		}
		
		return book.getSheet(sheetname).getRow(rownum).getCell(columnnum).getStringCellValue();
	}
	
}

