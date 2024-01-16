package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileData 
{
public static String FetchDataFromExcel(int i ,int j) throws EncryptedDocumentException, IOException
{
	String data="";
String path ="src"+File.separator+"test"+File.separator+"resources"+File.separator+"TestExcel"+File.separator+"Test.xlsx";	

FileInputStream File =new FileInputStream(path);
Sheet s= WorkbookFactory.create(File).getSheet("login");

Cell c = s.getRow(i).getCell(j);
CellType type = c.getCellType();
if(type==CellType.STRING)
{
 data = c.getStringCellValue();	
}
else if (type==CellType.NUMERIC)
{
double number =c.getNumericCellValue();
data = String.valueOf(number);
}
else if(type==CellType.BLANK)
{
 data="";	
}
return data;
}
}
