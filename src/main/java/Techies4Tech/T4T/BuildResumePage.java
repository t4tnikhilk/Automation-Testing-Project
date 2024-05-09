package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class BuildResumePage extends Seleniumutility {

	public BuildResumePage(WebDriver driver) {
		super(driver);
	}
	
	XSSFWorkbook book;
	XSSFSheet sheet;
	FileInputStream inputstream;

	public void Excel_Load() throws IOException {
		String filepath=System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath+"/Data_FIle.xlsx");
		book = new XSSFWorkbook(inputstream);
		sheet = book.getSheet("Build Resume Page");
	}
	
	public void Verify_Build_Resume() {
		
	}
	
	
	
	

}
