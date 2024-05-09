package Techies4Tech.T4T;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utility.Seleniumutility;

public class CandidateSignUp extends Seleniumutility {

	Properties prop;
	XSSFWorkbook book;
	XSSFSheet sheet;
	FileInputStream inputstream;

	public CandidateSignUp(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath=System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath+"/Repositories/Candidate_Sign_Up.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Excel_Load() throws IOException {
		String filepath=System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath+"/Data_FIle.xlsx");

		sheet = book.getSheet("SignUpCandidatePage");
	}

	public void Verify_Candidate_Sign_Up_Page() throws IOException, InterruptedException {
		getTitle();

		Load_Prop();

		By joinus = By.xpath(prop.getProperty("joinus"));
		By candidate = By.xpath(prop.getProperty("candidate"));
		By upload = By.xpath(prop.getProperty("upload"));
		By nextbutton = By.xpath(prop.getProperty("nextbutton"));

		waitforcondition(joinus, 10);
		click(joinus);

		waitforcondition(candidate, 20);
		getTitle();
		click(candidate);

		waitforcondition(upload, 10);
		getTitle();
		click(upload);
		Wait_for_PageComplete(3000);

		fileupload("E:\\AutoIt Scripts\\ArunResumepdf.exe");
		Wait_for_PageComplete(25000);

		waitforcondition(nextbutton, 20);
		click(nextbutton);
		System.out.println("next button clicked");
		Wait_for_PageComplete(5000);
	}

	public void Verify_Profile_Page() throws IOException, InterruptedException {
		getTitle();

		Load_Prop();
		By password = By.xpath(prop.getProperty("setpassword"));
		By TCcheckbox = By.xpath(prop.getProperty("termsandconditioncheckbox"));
		By SignUpButton = By.xpath(prop.getProperty("signupbuttonclick"));

		waitforcondition(password, 30);
		Excel_Load();
		XSSFCell getpassworddata = sheet.getRow(1).getCell(7);
		sendtext(password, getpassworddata.getStringCellValue());

		Wait_for_PageComplete(3000);
		waitforcondition(TCcheckbox, 10);
		click(TCcheckbox);

		Wait_for_PageComplete(2000);
		waitforcondition(SignUpButton, 10);
		click(SignUpButton);
		Wait_for_PageComplete(25000);

	}

	public void Verify_Candidate_Welcome_Page() throws InterruptedException, IOException {
		getTitle();

		Load_Prop();
		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));

		Wait_for_PageComplete(2000);
		waitforcondition(NextButtonClick, 10);
		click(NextButtonClick);
		Wait_for_PageComplete(10000);
	}


	public void Verif_Skill(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j, String k, String l) throws IOException, InterruptedException {
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 10);
				waitforcondition(rateyourskills1, 10);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_1(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_2(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify2");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_3(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify3");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_4(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify4");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_5(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify5");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}


	}

	public void Verify_Skill_Assessment_6(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify6");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}


	}

	public void Verify_Skill_Assessment_7(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify7");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}


	}

	public void Verify_Skill_Assessment_8(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify8");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);
		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_9(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify9");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_10(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify10");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_11(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify11");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}
		
	}

	public void Verify_Skill_Assessment_12(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify12");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_13(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify13");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_14(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify14");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Skill_Assessment_15(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify15");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}


	}

	public void Verify_Skill_Assessment_16(String a, String b, String c, String d, String e, String f, String g,
			String h, String i, String j, String k, String l) throws IOException, InterruptedException {
		System.out.println("Verify16");
		Load_Prop();

		By NextButtonClick = By.xpath(prop.getProperty("nextbutton"));
		By expinyearsbox1 = By.xpath(prop.getProperty("expinyearsbox1"));
		By expinyearsbox2 = By.xpath(prop.getProperty("expinyearsbox2"));
		By expinyearsbox3 = By.xpath(prop.getProperty("expinyearsbox3"));
		By expinyearsbox4 = By.xpath(prop.getProperty("expinyearsbox4"));
		By expinyearsbox5 = By.xpath(prop.getProperty("expinyearsbox5"));

		By rateyourskills1 = By.xpath(prop.getProperty("rateyourskills1"));
		By rateyourskills2 = By.xpath(prop.getProperty("rateyourskills2"));
		By rateyourskills3 = By.xpath(prop.getProperty("rateyourskills3"));
		By rateyourskills4 = By.xpath(prop.getProperty("rateyourskills4"));
		By rateyourskills5 = By.xpath(prop.getProperty("rateyourskills5"));

		Wait_for_PageComplete(6000);

		try {
			if ((waitforconditionret(expinyearsbox1).isDisplayed() && waitforconditionret(expinyearsbox1).isEnabled())
					&& (findElements(expinyearsbox1) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox1) && Check_Enabled(expinyearsbox1)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox1)) == true)) {
				waitforcondition(expinyearsbox1, 15);
				waitforcondition(rateyourskills1, 15);
				cleartext(expinyearsbox1);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox1, a);
				cleartext(rateyourskills1);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills1, b);
			}
		} catch (Exception z) {
			System.out.println("1st box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox2).isDisplayed() && waitforconditionret(expinyearsbox2).isEnabled())
					&& (findElements(expinyearsbox2) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox2)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox2)) == true)) {
				waitforcondition(expinyearsbox2, 3);
				waitforcondition(rateyourskills2, 3);
				cleartext(expinyearsbox2);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox2, c);
				cleartext(rateyourskills2);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills2, d);
			}
		} catch (Exception z) {
			System.out.println("2nd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox3).isDisplayed() && waitforconditionret(expinyearsbox3).isEnabled())
					&& (findElements(expinyearsbox3) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox3)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox3)) == true)) {
				waitforcondition(expinyearsbox3, 3);
				waitforcondition(rateyourskills3, 3);
				cleartext(expinyearsbox3);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox3, e);
				cleartext(rateyourskills3);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills3, f);
			}
		} catch (Exception z) {
			System.out.println("3rd box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox4).isDisplayed() && waitforconditionret(expinyearsbox4).isEnabled())
					&& (findElements(expinyearsbox4) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox2) && Check_Enabled(expinyearsbox4)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox4)) == true)) {
				waitforcondition(expinyearsbox4, 3);
				waitforcondition(rateyourskills4, 3);
				cleartext(expinyearsbox4);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox4, g);
				cleartext(rateyourskills4);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills4, h);
			}
		} catch (Exception z) {
			System.out.println("4th box not enabled");
		}

		try {
			if ((waitforconditionret(expinyearsbox5).isDisplayed() && waitforconditionret(expinyearsbox5).isEnabled())
					&& (findElements(expinyearsbox5) > 0) && (findElements(NextButtonClick) > 0)
					&& ((Check_Displayed(expinyearsbox5) && Check_Enabled(expinyearsbox5)) == true)
					&& ((Check_Displayed(NextButtonClick) && Check_Enabled(NextButtonClick)
							&& Check_Enabled(expinyearsbox5)) == true)) {
				waitforcondition(expinyearsbox5, 3);
				waitforcondition(rateyourskills5, 3);
				cleartext(expinyearsbox5);
				Wait_for_PageComplete(1000);
				sendtext(expinyearsbox5, i);
				cleartext(rateyourskills5);
				Wait_for_PageComplete(1000);
				sendtext(rateyourskills5, j);
			}
		} catch (Exception z) {
			System.out.println("5th box not enabled");
		}

		try {
			waitforcondition(NextButtonClick, 20);
			click(NextButtonClick);
			Wait_for_PageComplete(3000);
		}
		catch(Exception z) {
			
		}

	}

	public void Verify_Employment_and_Role_Preferences_Page() throws InterruptedException, IOException {
		inputstream = new FileInputStream("E:\\T4TProject\\T4T\\Data_FIle.xlsx");
		book = new XSSFWorkbook(inputstream);

		sheet = book.getSheet("Employment and Role Page");

		By designation = By.xpath(prop.getProperty("designation"));
		By employmenttype = By.xpath(prop.getProperty("employmenttype"));
		By workmodel = By.xpath(prop.getProperty("workmodel"));
		By destination=By.xpath(prop.getProperty("destination"));
		By annualsalary = By.xpath(prop.getProperty("annualsalary"));
		By timezones = By.xpath(prop.getProperty("timezones"));
		By experience = By.xpath(prop.getProperty("experience"));
		By noticeperiod = By.xpath(prop.getProperty("noticeperiod"));
		By relocation = By.xpath(prop.getProperty("relocation"));
		By visastatus = By.xpath(prop.getProperty("visastatus"));
		By saveandcontinue = By.xpath(prop.getProperty("saveandcontinue"));

		Wait_for_PageComplete(2000);
		waitforcondition(designation, 10);
		sendtext(designation, sheet.getRow(3).getCell(0).getStringCellValue());
		selectByText(employmenttype, sheet.getRow(3).getCell(1).getStringCellValue());
		selectByText(workmodel, sheet.getRow(3).getCell(2).getStringCellValue());
		Wait_for_PageComplete(2000);
		waitforcondition(destination, 20);
		sendtext(destination,sheet.getRow(3).getCell(4).getStringCellValue());
		sendkeys(destination,Keys.ESCAPE);
		Wait_for_PageComplete(5000);
		selectByIndex(annualsalary, 4);
		selectByText(timezones, sheet.getRow(3).getCell(5).getStringCellValue());
		selectByText(experience, sheet.getRow(3).getCell(6).getStringCellValue());
		selectByText(noticeperiod, sheet.getRow(3).getCell(7).getStringCellValue());
		selectByText(relocation, sheet.getRow(3).getCell(8).getStringCellValue());

		waitforcondition(designation, 10);
		sendtext(visastatus, sheet.getRow(3).getCell(9).getStringCellValue());

		click(saveandcontinue);
	}

	public void Review_Your_Profile() throws IOException, InterruptedException {
		Load_Prop();

		By saveandnextbutton = By.xpath(prop.getProperty("saveandnextbutton"));
		By verifyroledisplay = By.xpath(prop.getProperty("verifyroledisplay"));
		By verifydesignationdisplay = By.xpath(prop.getProperty("verifydesignationdisplay"));
		By verifyprimaryskilldisplay = By.xpath(prop.getProperty("verifyprimaryskilldisplay"));
		By role = By.xpath(prop.getProperty("role"));

		try {
			System.out.println(findElement(verifyroledisplay).getSize());
			System.out.println(findElement(verifydesignationdisplay).getSize());
			System.out.println(findElement(verifyprimaryskilldisplay).getSize());

			System.out.println(findElements(verifyroledisplay));
			System.out.println(findElements(verifydesignationdisplay));
			System.out.println(findElements(verifyprimaryskilldisplay));

			if (waitforconditionret(verifyroledisplay).isEnabled()
					&& waitforconditionret(verifyroledisplay).isDisplayed()) {

				waitforcondition(role, 60);
				System.out.println(findElement(role).isDisplayed());

				waitforcondition(verifyroledisplay, 90);
				waitforcondition(verifydesignationdisplay, 60);
				waitforcondition(verifyroledisplay, 60);

				assertEquals(gett(verifyroledisplay), "Junior Full-stack Developer");
				assertEquals(gett(verifydesignationdisplay), "Developer");
				assertEquals(gett(verifyprimaryskilldisplay), "Python");
				System.out.println("Element is false");
			}
		} catch (Exception e) {
			System.out.println("Reviw your profile page not working");
		}
		Wait_for_PageComplete(3000);
		waitforcondition(saveandnextbutton, 10);
		click(saveandnextbutton);
	}

	public void Verify_Upload_Profile_Photo() throws IOException, InterruptedException {
		By clickuploadprofilephotolink = By.xpath(prop.getProperty("uploadprofilephoto"));
//		By clickupload = By.xpath(prop.getProperty("clickupload"));
//		By saveandcontinue = By.xpath(prop.getProperty("saveandcontinue"));
		By scheduleinterview = By.xpath(prop.getProperty("scheduleinterview"));
//		By registerforcontracting = By.xpath(prop.getProperty("registerforcontracting"));
		By gotomyprofile = By.xpath(prop.getProperty("gotomyprofile"));

		Wait_for_PageComplete(5000);
		waitforcondition(clickuploadprofilephotolink, 20);
		click(clickuploadprofilephotolink);
//		click(clickupload);
//		fileupload("E:\\AutoIt Scripts\\Profile_Photo_Upload.exe");
//		click(saveandcontinue);
		Wait_for_PageComplete(4000);
		navigateback();
		Wait_for_PageComplete(4000);

		click(scheduleinterview);
		Wait_for_PageComplete(4000);
		navigateback();
		Wait_for_PageComplete(4000);

//		click(registerforcontracting);
//		Wait_for_PageComplete(4000);
//		navigateback();
//		Wait_for_PageComplete(4000);

		click(gotomyprofile);
		Wait_for_PageComplete(4000);

	}

}
