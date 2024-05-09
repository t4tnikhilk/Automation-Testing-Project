package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Seleniumutility;

public class LoginPage extends Seleniumutility {

	WebDriverWait wait;
	Properties prop;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void Load_prop() throws IOException {
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath + "/Repositories/login.properties");
		prop = new Properties();
		prop.load(file);
	}

	public void Sign_in() throws IOException, InterruptedException {
		Load_prop();

		By signin = By.xpath(prop.getProperty("signin"));
		waitforcondition(signin, 30);
		click(signin);
		Wait_for_PageComplete(3000);
	}

	public void username_Enter(String value) throws IOException {
		Load_prop();

		By username = By.xpath(prop.getProperty("username"));
		waitforcondition(username, 30);
		sendtext(username, value);
	}

	public void password_Enter(String value) throws IOException {
		Load_prop();

		By password = By.id(prop.getProperty("password"));
		waitforcondition(password, 30);
		sendtext(password, value);
	}

	public void Login_Butt_Click() throws IOException {
		Load_prop();

		By loginbuttonclick = By.xpath(prop.getProperty("LoginButtonClick"));
		waitforcondition(loginbuttonclick, 30);
		click(loginbuttonclick);
	}

	public void Login_Title() {
		getTitle();
	}

}
