package Techies4Tech.T4T;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	File file;
	FileInputStream inputstream;
	XSSFWorkbook book;
	XSSFSheet sheet;
	
	
	@Test
	public void LoGTest() throws IOException, InterruptedException {
		Excel_Load();
		
		sheet=book.getSheet("LoginPage");
		XSSFCell username=sheet.getRow(1).getCell(0);
		XSSFCell password=sheet.getRow(1).getCell(1);
		
		loginpage.Sign_in();
		loginpage.username_Enter(username.getStringCellValue());
		loginpage.password_Enter(password.getStringCellValue());
		Thread.sleep(2000);
		loginpage.Login_Butt_Click();
		
		loginpage.Login_Title();
	}
	
	public void Excel_Load() throws IOException {
		String filepath=System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath+"/Data_FIle.xlsx");
		book=new XSSFWorkbook(inputstream);
	}
}