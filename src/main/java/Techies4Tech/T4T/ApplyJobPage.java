package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class ApplyJobPage extends Seleniumutility {
	public ApplyJobPage(WebDriver driver) {
		super(driver);
	}

	Properties prop;

	public void Load_Prop() throws IOException {
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(
				filepath + "/Repositories/Job_Search_Page and Apply_Job_Page.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Verify_Apply_Job_with_AIcoveringletter(String value) throws IOException, InterruptedException {
		Load_Prop();

		By menubar = By.xpath(prop.getProperty("menubar"));
		By jobsearchclick = By.xpath(prop.getProperty("jobsearchclick"));
		By cleartext1 = By.xpath(prop.getProperty("cleartext1"));
		By cleartext2 = By.xpath(prop.getProperty("cleartext2"));
		By cleartext3 = By.xpath(prop.getProperty("cleartext3"));
		By search = By.xpath(prop.getProperty("search"));
		By markfavourite = By.xpath(prop.getProperty("markfavourite"));
		By scrollview = By.xpath(prop.getProperty("scrollview"));
		By view2 = By.xpath(prop.getProperty("view2"));
		By applynow = By.xpath(prop.getProperty("applynow"));
		By selectaicreator = By.xpath(prop.getProperty("selectaicreator"));
		By jobsapplied = By.xpath(prop.getProperty("jobsapplied"));

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
		sendtext(cleartext3, value);

		waitforcondition(search, 10);
		click(search);

		waitforcondition(markfavourite, 10);
		click(markfavourite);

		waitforcondition(view2, 10);
		click(view2);

		waitforcondition(applynow, 10);
		click(applynow);

		waitforcondition(selectaicreator, 10);
		click(selectaicreator);
		Wait_for_PageComplete(40000);

		Wait_for_PageComplete(3000);
		waitforcondition(scrollview, 25);
		movetoelement(scrollview);

		Wait_for_PageComplete(20000);
		click(applynow);

		waitforcondition(jobsapplied, 10);
		click(jobsapplied);
		Wait_for_PageComplete(3000);

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

		quit();
	}

	public void Verify_Apply_Job_without_AIcoveringletter(String value) throws IOException, InterruptedException {
		Load_Prop();

		By menubar = By.xpath(prop.getProperty("menubar"));
		By jobsearchclick = By.xpath(prop.getProperty("jobsearchclick"));
		By cleartext1 = By.xpath(prop.getProperty("cleartext1"));
		By cleartext2 = By.xpath(prop.getProperty("cleartext2"));
		By cleartext3 = By.xpath(prop.getProperty("cleartext3"));
		By search = By.xpath(prop.getProperty("search"));
		By markfavourite = By.xpath(prop.getProperty("markfavourite"));
		By view2 = By.xpath(prop.getProperty("view2"));
		By applynow = By.xpath(prop.getProperty("applynow"));
		By withoutaicreator = By.xpath(prop.getProperty("withoutaicreator"));

		Wait_for_PageComplete(6000);

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
		sendtext(cleartext3, value);

		waitforcondition(search, 10);
		click(search);

		waitforcondition(markfavourite, 10);
		click(markfavourite);

		waitforcondition(view2, 10);
		click(view2);

		waitforcondition(applynow, 10);
		click(applynow);

		Wait_for_PageComplete(3000);

		waitforcondition(withoutaicreator, 30);
		click(withoutaicreator);

		Wait_for_PageComplete(10000);
		click(applynow);
		
		quit();

	}
}
