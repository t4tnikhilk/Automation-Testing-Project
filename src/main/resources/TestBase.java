package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class TestBase {

	FileInputStream file;
	Properties prop;
	WebDriver driver;
	String browsername;
	String url;
	String username;
	String password;
	LoginPage login;

	public TestBase() throws IOException {
		file = new FileInputStream("C:\\Users\\Nikhil Kolhey\\workspace\\PageObjectM\\Config\\Config.properties");
		prop = new Properties();
		prop.load(file);
	}
	
	@BeforeMethod
	public void beforemethod(){
		login.username(username);
		login.password(password);
		login.click();
	}

	@BeforeClass
	public void beforeclass() throws IOException {
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		browsername = prop.getProperty("browser");
		initializingPageObjects();
		intializingWebdriver();
		driver.get(url);
	}

	public void intializingWebdriver() {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "");
			driver = new ChromeDriver();
		}
	}

	public void initializingPageObjects() throws IOException {
		LoginPage login = new LoginPage(driver);
	}
}
