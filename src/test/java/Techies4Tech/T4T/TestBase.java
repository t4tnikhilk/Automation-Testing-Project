package Techies4Tech.T4T;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	WebDriver driver;
	String Url;
	String browsername;
	File file;
	FileInputStream inputstream;
	XSSFWorkbook book_login;
	XSSFSheet sheet_login;

	// Page Objects
	LoginPage loginpage;
	HomePage homepage;
	CandidateSignUp candidatesignuppage;
	MyProfilPage myprofilepage;
	JobSearchPage jobsearchpage;
	VerifyMenuBarLinks verifymenubarlinks;
	AppliedJobPage verifyappliedjobs;
	AiInterviewPage aiinterviewpage;
	ApplyJobPage applyjobspage;

	@BeforeMethod
	public void beforemethod() {
	}

	@BeforeClass
	public void beforeclass() throws InterruptedException {
		try {
			String filepath = System.getProperty("user.dir");
			FileInputStream file = new FileInputStream(filepath+"/Repositories/login.properties");
			Properties prop = new Properties();
			prop.load(file);
			Url = prop.getProperty("url");
			browsername = prop.getProperty("browsername");

			intializingWebdriver();
			intializePageObject();
			driver.get(Url);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intializingWebdriver() {
		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			driver = new InternetExplorerDriver();
		}
	}

	public void login() throws IOException, InterruptedException {
		Excel_Load_login();

		sheet_login = book_login.getSheet("LoginPage");
		XSSFCell username = sheet_login.getRow(1).getCell(0);
		XSSFCell password = sheet_login.getRow(1).getCell(1);

		loginpage.Sign_in();
		loginpage.username_Enter(username.getStringCellValue());
		loginpage.password_Enter(password.getStringCellValue());
		Thread.sleep(2000);
		loginpage.Login_Butt_Click();

		loginpage.Login_Title();
	}

	public void Excel_Load_login() throws IOException {
		String filepath = System.getProperty("user.dir");
		inputstream = new FileInputStream(filepath+"/Data_FIle.xlsx");
		book_login = new XSSFWorkbook(inputstream);
	}

	public void intializePageObject() throws IOException {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		candidatesignuppage = new CandidateSignUp(driver);
		myprofilepage = new MyProfilPage(driver);
		jobsearchpage = new JobSearchPage(driver);
		verifymenubarlinks=new VerifyMenuBarLinks(driver);
		verifyappliedjobs=new AppliedJobPage(driver);
		aiinterviewpage=new AiInterviewPage(driver);
		applyjobspage=new ApplyJobPage(driver);
	}

}
