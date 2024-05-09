package utility;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Seleniumutility {
	WebDriver driver;
	WebDriverWait wait;

	public Seleniumutility(WebDriver driver) {
		this.driver = driver;
	}

	public void Enter_Element(By locator) {
		driver.findElement(locator);
	}

	public void iff(By locator) {
		int t = driver.findElements(locator).size();
		if (t > 0) {
			System.out.println(t);
		}
	}

	public String gett(By locator) {
		return driver.findElement(locator).getText();
	}

	public void click(By locater) {
		driver.findElement(locater).click();
	}
	
	public void clickbyaction(By locator) {
		try {
			Actions act =  new Actions(driver);
			act.moveToElement(driver.findElement(locator)).click().perform();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", locator);
		  }
	}

	public void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public void sendtext(By locater, String value) {
		driver.findElement(locater).sendKeys(value);
	}
	public void sendkeys(By locator, Keys value) {
		driver.findElement(locator).sendKeys(value);
	}

	public void selectByText(By locater, String value) {
		WebElement element = driver.findElement(locater);
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public void selectByvalue(By locator, String value) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectByIndex(By locator, int value) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByIndex(value);
	}

	public WebElement findElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public int findElements(By locator) {
		return driver.findElements(locator).size();
	}
	
	public void movetoelement(By locator) {
		JavascriptExecutor jc=((JavascriptExecutor)driver);
		jc.executeScript("arguments[0].scrollIntoView(true);", findElement(locator));
	}

	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void navigateback() {
		driver.navigate().back();
	}

	public void looping(By locator) throws IOException, InterruptedException {
		List<WebElement> liss = driver.findElements(locator);
		for (WebElement element : liss) {
			element.click();
		}

	}
	
	public void quit() {
		driver.quit();
	}

	public void waitforcondition(By locator, int a) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(a));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement waitforconditionret(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
	}

	public void verify(String value, String title) {
		Assert.assertEquals(value, title);
	}

	public void Navigate_Back() {
		driver.navigate().back();
	}

	public boolean Check_Enabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	public boolean Check_Displayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public void Wait_for_PageComplete(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public void fileupload(String file) throws IOException {
		Runtime.getRuntime().exec(file);
	}

	public void Check_Element_Enabled(By locator) {
		boolean el = driver.findElement(locator).isEnabled();
		if (el == true) {
			System.out.println(el);
		} else {
			System.out.println("Element Disabled");
		}
	}

	public void if_Element_Enabled_Then_Click(By locator) {
		boolean el = driver.findElement(locator).isEnabled();
		if (el == true) {
			System.out.println(el);
			click(locator);
		} else {
			System.out.println("false");
		}
	}

	public void cleartext(By locator) {
		driver.findElement(locator).clear();
	}

	public void Scroll_Into_View() {

	}

	public void opennewwindow(String url) {

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);

		String mainwindowhandle = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();

		for (String newwindow : allwindowhandles) {
			if ((newwindow.equals(mainwindowhandle))) {
				driver.switchTo().window(newwindow);
			}
		}

	}

}