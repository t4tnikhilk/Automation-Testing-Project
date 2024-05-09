package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Apply_Jobs_Test extends TestBase {

	XSSFWorkbook book;
	XSSFSheet sheet;
	FileInputStream inputstream;

	public void Excel_Load() throws IOException {
		String filepath=System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath+"/Data_FIle.xlsx");
		book = new XSSFWorkbook(inputstream);

		sheet = book.getSheet("Job Search Page and Apply Job P");
	}

	//Apply job as Developer
	@Test(priority = 1)
	public void Verify_Apply_Jobs_with_AIcoveringletter() throws IOException, InterruptedException {

		login();
		Excel_Load();
		applyjobspage.Verify_Apply_Job_with_AIcoveringletter(sheet.getRow(1).getCell(0).getStringCellValue());

	}

	//Apply job as Software Engineer
	@Test(priority = 2)
	public void Verify_Apply_Jobs_without_AIcoveringletter() throws IOException, InterruptedException {

		login();
		Excel_Load();
		applyjobspage.Verify_Apply_Job_without_AIcoveringletter(sheet.getRow(2).getCell(0).getStringCellValue());

	}
	
	//Apply job as Tester
	@Test(priority = 3)
	public void Verify_Apply_Jobs_with_AIcoveringletter3() throws IOException, InterruptedException {

		login();
		Excel_Load();
		applyjobspage.Verify_Apply_Job_with_AIcoveringletter(sheet.getRow(3).getCell(0).getStringCellValue());

	}

}
