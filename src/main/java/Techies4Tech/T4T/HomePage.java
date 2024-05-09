package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Seleniumutility;

public class HomePage extends Seleniumutility {

	WebDriver driver;
	Properties prop;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath=System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath+"/Repositories/HomePage.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Get_Page_Title() {
		getTitle();
	}

	public void Verify_About_Us_Link() throws IOException, InterruptedException {
		Load_Prop();

		By aboutuslink = By.xpath(prop.getProperty("aboutus"));
		waitforcondition(aboutuslink,30);
		click(aboutuslink);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_News_Link() throws IOException, InterruptedException {
		Load_Prop();

		By newslink = By.xpath(prop.getProperty("news"));
		waitforcondition(newslink,30);
		click(newslink);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_Contact_Us_Link() throws IOException, InterruptedException {
		Load_Prop();

		By contactuslink = By.xpath(prop.getProperty("contactus"));
		waitforcondition(contactuslink,30);
		click(contactuslink);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_Join_Us_Link() throws IOException, InterruptedException {
		Load_Prop();

		By joinus = By.xpath(prop.getProperty("joinus"));
		By candidate = By.xpath(prop.getProperty("candidate"));
		By client = By.xpath(prop.getProperty("client"));

		waitforcondition(joinus,30);
		click(joinus);
		waitforcondition(candidate,30);
		click(candidate);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();

		waitforcondition(joinus,30);
		click(joinus);
		waitforcondition(client,30);
		click(client);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_Sign_in() throws IOException, InterruptedException {
		Load_Prop();

		By signin = By.xpath(prop.getProperty("signin"));
		click(signin);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_Hire_Talent() throws IOException, InterruptedException {
		Load_Prop();

		By hiretalent = By.xpath(prop.getProperty("hiretalent"));
		waitforcondition(hiretalent,30);
		click(hiretalent);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_hire_client() throws IOException, InterruptedException {
		Load_Prop();

		By hireclient = By.xpath(prop.getProperty("hireclient"));
		waitforcondition(hireclient,30);
		click(hireclient);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_find_contract() throws IOException, InterruptedException {
		Load_Prop();

		By findcontract = By.xpath(prop.getProperty("findcontract"));
		waitforcondition(findcontract,30);
		click(findcontract);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void Verify_find_career() throws IOException, InterruptedException {
		Load_Prop();

		By findcareer = By.xpath(prop.getProperty("findcareer"));
		waitforcondition(findcareer,30);
		click(findcareer);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}

	public void verify_News_Section() throws IOException, InterruptedException {
		Load_Prop();

		By newsdetail1 = By.xpath(prop.getProperty("newsdetail1"));
		By newsdetail2 = By.xpath(prop.getProperty("newsdetail2"));
		By newsdetail3 = By.xpath(prop.getProperty("newsdetail3"));

		waitforcondition(newsdetail1,30);
		click(newsdetail1);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();

		waitforcondition(newsdetail2,30);
		click(newsdetail2);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();

		waitforcondition(newsdetail3,30);
		click(newsdetail3);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}
	
	public void Verify_Quick_Links() throws IOException, InterruptedException {
		Load_Prop();
		
		By termsofservice=By.xpath(prop.getProperty("termsofservice"));
		By privacypolicy=By.xpath(prop.getProperty("privacypolicy"));
		By security_compliance=By.xpath(prop.getProperty("security&compliance"));
		
		waitforcondition(termsofservice,30);
		click(termsofservice);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
		
		waitforcondition(privacypolicy,30);
		click(privacypolicy);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
		
		waitforcondition(security_compliance,30);
		click(security_compliance);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
	}
	
	public void Verify_Company_Links() throws IOException, InterruptedException {
		Load_Prop();
		
		By aboutus=By.xpath(prop.getProperty("aboutus2"));
		By contactus=By.xpath(prop.getProperty("contactus2"));
		
		waitforcondition(aboutus,30);
		click(aboutus);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
		
		waitforcondition(contactus,30);
		click(contactus);
		Wait_for_PageComplete(3000);
		Get_Page_Title();
		Navigate_Back();
		Wait_for_PageComplete(3000);
	}
	
	public void Verify_Newletter_Mail() throws IOException {
		Load_Prop();
		
		By mailvalidation=By.xpath(prop.getProperty("mailvalidation"));
		
		waitforcondition(mailvalidation,30);
		sendtext(mailvalidation,"nikhil.k@techies4tech.ai");
	}

}
