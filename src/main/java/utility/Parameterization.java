package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Parameterization {
		
		
	public static String getExcelData(int raw, int cell, String SheetName) throws EncryptedDocumentException, IOException {
				
			FileInputStream FIS=new FileInputStream("E:\\eclipse_workspace\\Facebook\\src\\test\\resources\\TestData.xlsx");
				
			String Value=	WorkbookFactory.create(FIS).getSheet(SheetName).getRow(raw).getCell(cell).getStringCellValue();
				
				return Value;			
	}
}
