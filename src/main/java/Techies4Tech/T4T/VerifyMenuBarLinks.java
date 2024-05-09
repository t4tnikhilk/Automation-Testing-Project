package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class VerifyMenuBarLinks extends Seleniumutility {

	Properties prop;

	public VerifyMenuBarLinks(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath + "/Repositories/Verify_MenuBar_Links.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void verify_Links() throws IOException, InterruptedException {
		Load_Prop();

		By menubar = By.xpath(prop.getProperty("menubar"));
		By mydahsboard = By.xpath(prop.getProperty("mydahsboard"));
		By myprofile = By.xpath(prop.getProperty("myprofile"));
		By airecommendedjobs = By.xpath(prop.getProperty("airecommendedjobs"));
		By jobsearch = By.xpath(prop.getProperty("jobsearch"));
		By applyjob = By.xpath(prop.getProperty("applyjob"));
		By appliedjobs = By.xpath(prop.getProperty("appliedjobs"));
		By myskills = By.xpath(prop.getProperty("myskills"));
		By aiinterview = By.xpath(prop.getProperty("aiinterview"));
		By buildresume = By.xpath(prop.getProperty("buildresume"));
		By skilldevelopment = By.xpath(prop.getProperty("skilldevelopment"));
		By logout = By.xpath(prop.getProperty("logout"));
		By okay = By.xpath(prop.getProperty("okay"));

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(mydahsboard, 20);
		click(mydahsboard);
		Wait_for_PageComplete(5000);

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(myprofile, 20);
		click(myprofile);
		Wait_for_PageComplete(5000);

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(airecommendedjobs, 20);
		click(airecommendedjobs);
		Wait_for_PageComplete(5000);

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(jobsearch, 20);
		click(jobsearch);
		Wait_for_PageComplete(5000);

		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(applyjob, 20);
		click(applyjob);

		waitforcondition(appliedjobs, 20);
		click(appliedjobs);
		Wait_for_PageComplete(5000);

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(myskills, 20);
		click(myskills);
		Wait_for_PageComplete(8000);
		navigateback();

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(aiinterview, 20);
		click(aiinterview);
		Wait_for_PageComplete(5000);
		click(okay);

		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(buildresume, 20);
		click(buildresume);
		if (findElement(menubar).isDisplayed()) {
			System.out.println("build resume link works");
		}

		Wait_for_PageComplete(3000);
		waitforcondition(menubar, 20);
		click(menubar);
		waitforcondition(skilldevelopment, 20);
		click(skilldevelopment);
		Wait_for_PageComplete(5000);
		click(okay);

		Wait_for_PageComplete(3000);
		waitforcondition(logout, 20);
		click(logout);

	}
}
