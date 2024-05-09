package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class AppliedJobPage extends Seleniumutility {

	Properties prop;

	public AppliedJobPage(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath=System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath+"/Repositories/AppliedJob.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Verify_AppliedJob() throws IOException, InterruptedException {
		Load_Prop();

		By menubar = By.xpath(prop.getProperty("menubar"));
		By appliedjobs = By.xpath(prop.getProperty("appliedjobs"));
		By view = By.xpath(prop.getProperty("view"));
		By withdraw = By.xpath(prop.getProperty("withdraw"));

		Wait_for_PageComplete(3000);
		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(appliedjobs, 20);
		click(appliedjobs);

		waitforcondition(view, 20);

		if (findElement(view).isDisplayed()) {
			click(view);

			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}


		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}
		
		if (findElement(view).isDisplayed()) {
			click(view);
			Wait_for_PageComplete(5000);
			navigateback();
			Wait_for_PageComplete(5000);
			waitforcondition(withdraw, 20);
			click(withdraw);
			Wait_for_PageComplete(3000);
		}

	}

}
