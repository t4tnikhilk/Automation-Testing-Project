package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class JobSearchPage extends Seleniumutility {

	Properties prop;
	XSSFWorkbook book;
	XSSFSheet sheet;
	FileInputStream inputstream;

	public JobSearchPage(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(
				filepath + "/Repositories/Job_Search_Page and Apply_Job_Page.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Excel_Load() throws IOException {

		String filepath = System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath + "/Data_FIle.xlsx");
		sheet = book.getSheet("SignUpCandidatePage");
	}

	public void Verify_Job_Search() throws IOException, InterruptedException {
		Load_Prop();

		By menubar = By.xpath(prop.getProperty("menubar"));
		By jobsearchclick = By.xpath(prop.getProperty("jobsearchclick"));
		By cleartext1 = By.xpath(prop.getProperty("cleartext1"));
		By cleartext2 = By.xpath(prop.getProperty("cleartext2"));
		By cleartext3 = By.xpath(prop.getProperty("cleartext3"));
		By search = By.xpath(prop.getProperty("search"));

		Wait_for_PageComplete(3000);

		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(jobsearchclick, 20);
		click(jobsearchclick);

		waitforcondition(cleartext1, 20);

		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}

		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}

		waitforcondition(cleartext2, 10);
		click(cleartext2);

		waitforcondition(cleartext3, 10);
		sendtext(cleartext3, "software engineer");

		waitforcondition(search, 10);
		click(search);

		Wait_for_PageComplete(5000);

		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}

		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}

		waitforcondition(cleartext2, 10);
		click(cleartext2);

		waitforcondition(cleartext3, 10);
		sendtext(cleartext3, "developer");

		waitforcondition(search, 10);
		click(search);

		Wait_for_PageComplete(5000);

		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}
		if (findElement(cleartext1).isDisplayed() == true) {
			findElement(cleartext1).click();
		}

		waitforcondition(cleartext2, 10);
		click(cleartext2);

		waitforcondition(cleartext3, 10);
		sendtext(cleartext3, "tester");

		waitforcondition(search, 10);
		click(search);

		Wait_for_PageComplete(5000);

	}

}
