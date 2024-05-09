package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Seleniumutility;

public class MyProfilPage extends Seleniumutility {

	WebDriver driver;
	Properties prop;
	XSSFWorkbook book;
	XSSFSheet sheet;
	FileInputStream inputstream;

	public MyProfilPage(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath=System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath+"/Repositories/My_Profile_Page.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Edit_and_Verify_1() throws IOException, InterruptedException {
		Load_Prop();

		inputstream = new FileInputStream("E:\\T4TProject\\T4T\\Data_FIle.xlsx");
		book = new XSSFWorkbook(inputstream);
		sheet = book.getSheet("My Profile Page");

		By editbutton1 = By.xpath(prop.getProperty("editbutton1"));

		By designation = By.xpath(prop.getProperty("designation"));
		By employmenttype = By.xpath(prop.getProperty("employmenttype"));
		By workmodel = By.xpath(prop.getProperty("workmodel"));
		By annualsalary = By.xpath(prop.getProperty("annualsalary"));
		By timezones = By.xpath(prop.getProperty("timezones"));
		By experience = By.xpath(prop.getProperty("experience"));
		By noticeperiod = By.xpath(prop.getProperty("noticeperiod"));
		By relocation = By.xpath(prop.getProperty("relocation"));
		By visastatus = By.xpath(prop.getProperty("visastatus"));
		By saveandcontinue = By.xpath(prop.getProperty("saveandcontinue"));

		waitforcondition(editbutton1, 10);
		click(editbutton1);

		Wait_for_PageComplete(5000);
		cleartext(designation);
		waitforcondition(designation, 40);
		sendtext(designation, sheet.getRow(1).getCell(0).getStringCellValue());
		selectByText(employmenttype, sheet.getRow(1).getCell(1).getStringCellValue());
		selectByText(workmodel, sheet.getRow(1).getCell(2).getStringCellValue());
		Wait_for_PageComplete(5000);
		selectByIndex(annualsalary, 2);
		selectByText(timezones, sheet.getRow(1).getCell(4).getStringCellValue());
		selectByText(experience, sheet.getRow(1).getCell(5).getStringCellValue());
		selectByText(noticeperiod, sheet.getRow(1).getCell(6).getStringCellValue());
		selectByText(relocation, sheet.getRow(1).getCell(7).getStringCellValue());

		cleartext(visastatus);
		waitforcondition(visastatus, 10);
		sendtext(visastatus, sheet.getRow(1).getCell(8).getStringCellValue());
		System.out.println("1st button passed");

		click(saveandcontinue);

	}

	public void Edit_and_Verify_2() throws IOException, InterruptedException {
		Load_Prop();

		By editbutton2 = By.xpath(prop.getProperty("editbutton2"));
		By startrecording = By.xpath(prop.getProperty("startrecording"));

		waitforcondition(editbutton2, 40);
		click(editbutton2);

		waitforcondition(startrecording, 40);
		click(startrecording);
		Wait_for_PageComplete(10000);
		navigateback();
		System.out.println("navigated back from recording page");
		System.out.println("2nd button passed");

	}

	public void Edit_and_Verify_3() {
		try {
			By editbutton3 = By.xpath(prop.getProperty("editbutton3"));
			waitforcondition(editbutton3, 40);
			click(editbutton3);
		} catch (Exception z) {
			System.out.println("3rd button failed");
		}

	}

	public void Edit_and_Verify_4() {
		try {
			By editbutton4 = By.xpath(prop.getProperty("editbutton4"));
			waitforcondition(editbutton4, 40);
			click(editbutton4);
		} catch (Exception z) {
			System.out.println("4th button failed");
		}

	}

	public void Edit_and_Verify_5() {
		try {
			By editbutton5 = By.xpath(prop.getProperty("editbutton5"));
			waitforcondition(editbutton5, 40);
			click(editbutton5);
		} catch (Exception z) {
			System.out.println("5th button failed");
		}

	}

	public void Edit_and_Verify_6() {
		By scrollintoview1 = By.xpath(prop.getProperty("scrollintoview1"));
		waitforcondition(scrollintoview1, 40);
		movetoelement(scrollintoview1);
		try {
			By editbutton6 = By.xpath(prop.getProperty("editbutton6"));
			waitforcondition(editbutton6, 40);
			click(editbutton6);
		} catch (Exception z) {
			System.out.println("6th button failed");
		}
	}

	public void Edit_and_Verify_7() {
		By scrollintoview2 = By.xpath(prop.getProperty("scrollintoview2"));
		waitforcondition(scrollintoview2, 60);
		movetoelement(scrollintoview2);
		try {
			By editbutton7 = By.xpath(prop.getProperty("editbutton7"));
			waitforcondition(editbutton7, 40);
			click(editbutton7);
		} catch (Exception z) {
			System.out.println("7th button failed");
		}

	}

	public void Edit_and_Verify_8() {
		By scrollintoview1 = By.xpath(prop.getProperty("scrollintoview1"));
		By scrollintoview2 = By.xpath(prop.getProperty("scrollintoview2"));
		By scrollintoview3 = By.xpath(prop.getProperty("scrollintoview3"));
		waitforcondition(scrollintoview1, 60);
		movetoelement(scrollintoview1);
		waitforcondition(scrollintoview2, 20);
		movetoelement(scrollintoview2);
		waitforcondition(scrollintoview3, 40);
		movetoelement(scrollintoview3);
		try {
			By editbutton8 = By.xpath(prop.getProperty("editbutton8"));
			waitforcondition(editbutton8, 40);
			click(editbutton8);
		} catch (Exception z) {
			System.out.println("8th button failed");
		}

	}

	public void Edit_and_Verify_9() {
		By scrollintoview1 = By.xpath(prop.getProperty("scrollintoview1"));
		By scrollintoview2 = By.xpath(prop.getProperty("scrollintoview2"));
		By scrollintoview3 = By.xpath(prop.getProperty("scrollintoview3"));
		By scrollintoview4 = By.xpath(prop.getProperty("scrollintoview3"));

		waitforcondition(scrollintoview1, 60);
		movetoelement(scrollintoview1);
		waitforcondition(scrollintoview2, 60);
		movetoelement(scrollintoview2);
		waitforcondition(scrollintoview3, 40);
		movetoelement(scrollintoview3);
		waitforcondition(scrollintoview4, 40);
		movetoelement(scrollintoview4);
		try {
			By editbutton9 = By.xpath(prop.getProperty("editbutton9"));
			waitforcondition(editbutton9, 40);
			click(editbutton9);
		} catch (Exception z) {
			System.out.println("9th button failed");
		}

	}

	public void Edit_and_Verify_10() {
		By scrollintoview0 = By.xpath(prop.getProperty("scrollintoview0"));
		By scrollintoview1 = By.xpath(prop.getProperty("scrollintoview1"));
		By scrollintoview2 = By.xpath(prop.getProperty("scrollintoview2"));
		By scrollintoview3 = By.xpath(prop.getProperty("scrollintoview3"));
		By scrollintoview4 = By.xpath(prop.getProperty("scrollintoview4"));

		waitforcondition(scrollintoview0, 60);
		movetoelement(scrollintoview0);
		waitforcondition(scrollintoview1, 60);
		movetoelement(scrollintoview1);
		waitforcondition(scrollintoview2, 60);
		movetoelement(scrollintoview2);
		waitforcondition(scrollintoview3, 60);
		movetoelement(scrollintoview3);
		waitforcondition(scrollintoview4, 60);
		movetoelement(scrollintoview4);

		try {
			By editbutton10 = By.xpath(prop.getProperty("editbutton10"));
			waitforcondition(editbutton10, 40);
			click(editbutton10);
		} catch (Exception z) {
			System.out.println("10th button failed");
		}

	}

	public void Checkbox() throws IOException, InterruptedException {
		By scrollintoview0 = By.xpath(prop.getProperty("scrollintoview0"));
		By scrollintoview1 = By.xpath(prop.getProperty("scrollintoview1"));
		By scrollintoview2 = By.xpath(prop.getProperty("scrollintoview2"));
		By scrollintoview3 = By.xpath(prop.getProperty("scrollintoview3"));
		By scrollintoview4 = By.xpath(prop.getProperty("scrollintoview4"));
		By jobfrequencycheckbox = By.xpath("jobfrequencycheckbox");

		waitforcondition(scrollintoview0, 60);
		movetoelement(scrollintoview0);
		waitforcondition(scrollintoview1, 60);
		movetoelement(scrollintoview1);
		waitforcondition(scrollintoview2, 60);
		movetoelement(scrollintoview2);
		waitforcondition(scrollintoview3, 60);
		movetoelement(scrollintoview3);
		waitforcondition(scrollintoview4, 60);
		movetoelement(scrollintoview4);

		waitforcondition(jobfrequencycheckbox, 60);
		movetoelement(jobfrequencycheckbox);

		waitforcondition(jobfrequencycheckbox, 60);
		click(jobfrequencycheckbox);

	}

	public void Schedule_interviews_1() {
		By sceduleinterview = By.xpath(prop.getProperty("sceduleinterview"));
		By redrightbutton = By.xpath(prop.getProperty("redrightbutton"));
		By selectdate = By.xpath(prop.getProperty("selectdate"));
		By selecthour = By.xpath(prop.getProperty("selecthour"));
		By selectminute = By.xpath(prop.getProperty("selectminute"));
		By selectampm = By.xpath(prop.getProperty("selectampm"));
		By scedulebutton = By.xpath(prop.getProperty("scedulebutton"));
		By reshedule = By.xpath(prop.getProperty("reshedule"));
		By cancelinterview = By.xpath(prop.getProperty("cancelinterview"));

		waitforcondition(sceduleinterview, 20);
		click(sceduleinterview);

		waitforcondition(redrightbutton, 20);
		click(redrightbutton);

		waitforcondition(selectdate, 20);
		click(selectdate);

		selectByIndex(selecthour, 5);
		selectByIndex(selectminute, 46);
		selectByIndex(selectampm, 2);

		try {
			waitforcondition(scedulebutton, 20);
			click(scedulebutton);
		} catch (Exception e) {
			waitforcondition(reshedule, 20);
			click(reshedule);
		}

		waitforcondition(cancelinterview, 20);
		click(cancelinterview);
	}
	
	public void Schedule_interviews_2() {
		
	}

	public void Update_Resume() throws IOException, InterruptedException {
		By menubar=By.xpath(prop.getProperty("menubar"));
		By myprofileclickfrommenubar=By.xpath(prop.getProperty("myprofileclickfrommenubar"));
		By editbutton11 = By.xpath(prop.getProperty("editbutton11"));
		By updateresume = By.xpath(prop.getProperty("updateresume"));
		By chosefile = By.xpath(prop.getProperty("chosefile"));
		By uploadresume = By.xpath(prop.getProperty("uploadresume"));
		By proceed=By.xpath(prop.getProperty("proceed"));
		By checkelementbeforenextbutton=By.xpath(prop.getProperty("checkelementbeforenextbutton"));
		By nextbutton=By.xpath(prop.getProperty("nextbutton"));
		
		waitforcondition(menubar, 40);
		click(menubar);
		
		waitforcondition(myprofileclickfrommenubar, 40);
		click(myprofileclickfrommenubar);
		

		waitforcondition(editbutton11, 40);
		click(editbutton11);

		waitforcondition(updateresume, 20);
		clickbyaction(updateresume);

		waitforcondition(chosefile, 20);
		clickbyaction(chosefile);
		Wait_for_PageComplete(3000);

		fileupload("E:\\AutoIt Scripts\\ArunResumepdf.exe");
		Wait_for_PageComplete(18000);

		waitforcondition(uploadresume, 60);
		click(uploadresume);
		
		waitforcondition(proceed, 60);
		click(proceed);
		
		waitforcondition(checkelementbeforenextbutton, 60);
		findElement(checkelementbeforenextbutton).isDisplayed();
		
		waitforcondition(nextbutton, 60);
		click(nextbutton);
		
		
	}

}
