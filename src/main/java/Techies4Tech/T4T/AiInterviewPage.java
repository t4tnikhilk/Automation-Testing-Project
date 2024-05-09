package Techies4Tech.T4T;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutility;

public class AiInterviewPage extends Seleniumutility {

	Properties prop;

	public AiInterviewPage(WebDriver driver) {
		super(driver);
	}

	public void Load_Prop() throws IOException {
		String filepath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(filepath + "/Repositories/AI_Interview_Page.properties");
		prop = new Properties();
		prop.load(file);

	}

	public void Verify_Scedule_and_JoinInterview() throws IOException, InterruptedException {
		Load_Prop();
		By menubar = By.xpath(prop.getProperty("menubar"));
		By aiinterview = By.xpath(prop.getProperty("aiinterview"));
		By okay = By.xpath(prop.getProperty("okay"));
		By scedule1 = By.xpath(prop.getProperty("scedule1"));
		By redrightbutton = By.xpath(prop.getProperty("redrightbutton"));
		By joininterview1 = By.xpath(prop.getProperty("joininterview1"));
		By joininterview = By.xpath(prop.getProperty("joininterview"));
		By cancelinterview = By.xpath(prop.getProperty("cancelinterview"));
		By dashboard = By.xpath(prop.getProperty("dashboard"));
		
		By reshedule1=By.xpath(prop.getProperty("reshedule1"));
		By reshedule2=By.xpath(prop.getProperty("reshedule2"));
		By reshedule3=By.xpath(prop.getProperty("reshedule3"));
		By reshedule4=By.xpath(prop.getProperty("reshedule4"));
		By reshedule5=By.xpath(prop.getProperty("reshedule5"));
		By reshedule6=By.xpath(prop.getProperty("reshedule6"));
		By reshedule7=By.xpath(prop.getProperty("reshedule7"));
//		By reshedule8=By.xpath(prop.getProperty("reshedule8"));
//		By reshedule9=By.xpath(prop.getProperty("reshedule9"));
//		By reshedule10=By.xpath(prop.getProperty("reshedule10"));
//		By reshedule11=By.xpath(prop.getProperty("reshedule11"));

		By saveandcontinuebutton = By.xpath(prop.getProperty("saveandcontinuebutton"));

		By scedulebutton = By.xpath(prop.getProperty("scedulebutton"));

		By selectdate1 = By.xpath(prop.getProperty("selectdate1"));
		By selecthour1 = By.xpath(prop.getProperty("selecthour1"));
		By selectminute1 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm1 = By.xpath(prop.getProperty("selectampm1"));

		By selectdate2 = By.xpath(prop.getProperty("selectdate2"));
		By selecthour2 = By.xpath(prop.getProperty("selecthour2"));
		By selectminute2 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm2 = By.xpath(prop.getProperty("selectampm2"));
		By joininterview2 = By.xpath(prop.getProperty("joininterview2"));

		By selectdate3 = By.xpath(prop.getProperty("selectdate3"));
		By selecthour3 = By.xpath(prop.getProperty("selecthour3"));
		By selectminute3 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm3 = By.xpath(prop.getProperty("selectampm3"));
		By joininterview3 = By.xpath(prop.getProperty("joininterview3"));

		By selectdate4 = By.xpath(prop.getProperty("selectdate4"));
		By selecthour4 = By.xpath(prop.getProperty("selecthour4"));
		By selectminute4 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm4 = By.xpath(prop.getProperty("selectampm4"));
		By joininterview4 = By.xpath(prop.getProperty("joininterview4"));

		By selectdate5 = By.xpath(prop.getProperty("selectdate5"));
		By selecthour5 = By.xpath(prop.getProperty("selecthour5"));
		By selectminute5 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm5 = By.xpath(prop.getProperty("selectampm5"));
		By joininterview5 = By.xpath(prop.getProperty("joininterview5"));

		By selectdate6 = By.xpath(prop.getProperty("selectdate6"));
		By selecthour6 = By.xpath(prop.getProperty("selecthour6"));
		By selectminute6 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm6 = By.xpath(prop.getProperty("selectampm6"));
		By joininterview6 = By.xpath(prop.getProperty("joininterview6"));

		By selectdate7 = By.xpath(prop.getProperty("selectdate7"));
		By selecthour7 = By.xpath(prop.getProperty("selecthour7"));
		By selectminute7 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm7 = By.xpath(prop.getProperty("selectampm7"));
		By joininterview7 = By.xpath(prop.getProperty("joininterview7"));

		Wait_for_PageComplete(4000);
		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(aiinterview, 20);
		click(aiinterview);

		waitforcondition(okay, 20);
		click(okay);
		Wait_for_PageComplete(5000);

		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);

			if (findElements(dashboard) > 0) {

				waitforcondition(redrightbutton, 20);
				click(redrightbutton);

				waitforcondition(selectdate1, 20);
				click(selectdate1);

				Wait_for_PageComplete(2000);
				waitforcondition(selecthour1, 20);
				selectByText(selecthour1, "8");

				Wait_for_PageComplete(2000);
				waitforcondition(selectminute1, 20);
				selectByText(selectminute1, "30");

				Wait_for_PageComplete(2000);
				waitforcondition(selectampm1, 20);
				selectByText(selectampm1, "PM");

				Wait_for_PageComplete(2000);
				waitforcondition(scedulebutton, 20);
				click(scedulebutton);

				System.out.println("1st Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}
		
		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);
		
		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule1, 20);
		waitforcondition(joininterview1, 20);
		
		if(findElements(reshedule1)>0) {
			Wait_for_PageComplete(8000);
			waitforcondition(joininterview1, 20);
			click(joininterview1);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		waitforcondition(scedule1, 20);
		
		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);
			waitforcondition(dashboard, 20);

			if (findElements(dashboard) > 0) {

				waitforcondition(redrightbutton, 20);
				click(redrightbutton);

				waitforcondition(selectdate2, 20);
				click(selectdate2);

				Wait_for_PageComplete(2000);
				waitforcondition(selecthour2, 20);
				selectByText(selecthour2, "6");

				Wait_for_PageComplete(2000);
				waitforcondition(selectminute2, 20);
				selectByText(selectminute2, "30");

				Wait_for_PageComplete(2000);
				waitforcondition(selectampm1, 20);
				selectByText(selectampm2, "PM");

				Wait_for_PageComplete(2000);
				waitforcondition(scedulebutton, 20);
				click(scedulebutton);

				System.out.println("2nd Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}

		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);
		
		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}
		waitforcondition(reshedule2, 20);

		if(findElements(reshedule2)>0) {
			Wait_for_PageComplete(5000);
			waitforcondition(joininterview2, 20);
			click(joininterview2);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		waitforcondition(scedule1, 20);
		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);

			if (findElements(dashboard) > 0) {

				Wait_for_PageComplete(3000);
				waitforcondition(redrightbutton, 20);
				click(redrightbutton);

				Wait_for_PageComplete(3000);
				waitforcondition(selectdate3, 20);
				click(selectdate3);

				Wait_for_PageComplete(3000);
				waitforcondition(selecthour3, 20);
				selectByText(selecthour3, "7");

				Wait_for_PageComplete(2000);
				waitforcondition(selectminute3, 20);
				selectByText(selectminute3, "30");

				Wait_for_PageComplete(3000);
				waitforcondition(selectampm3, 20);
				selectByText(selectampm3, "PM");

				Wait_for_PageComplete(3000);
				waitforcondition(scedulebutton, 20);
				click(scedulebutton);

				System.out.println("3rd Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}

		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);
		
		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule3, 20);
		
		if(findElements(reshedule3)>0) {
			Wait_for_PageComplete(5000);
			waitforcondition(joininterview3, 20);
			click(joininterview3);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		waitforcondition(scedule1, 20);
		
		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);

			if (findElements(dashboard) > 0) {
				Wait_for_PageComplete(3000);
				waitforcondition(redrightbutton, 20);
				click(redrightbutton);

				Wait_for_PageComplete(3000);
				waitforcondition(selectdate4, 20);
				click(selectdate4);

				Wait_for_PageComplete(3000);
				waitforcondition(selecthour4, 20);
				selectByText(selecthour4, "9");

				Wait_for_PageComplete(3000);
				waitforcondition(selectminute4, 20);
				selectByText(selectminute4, "30");

				Wait_for_PageComplete(3000);
				waitforcondition(selectampm4, 20);
				selectByText(selectampm4, "PM");

				Wait_for_PageComplete(3000);
				waitforcondition(scedulebutton, 20);
				click(scedulebutton);

				System.out.println("4th Interview Sceduled");

			}

		} else {
			System.out.println("other interview scheduled at the time");
		}
		
		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);

		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule4, 20);
		
		if(findElements(reshedule4)>0) {
			Wait_for_PageComplete(5000);
			waitforcondition(joininterview4, 20);
			click(joininterview4);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		waitforcondition(scedule1, 20);
		
		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);
			
			if (findElements(dashboard) > 0) {

			Wait_for_PageComplete(3000);
			waitforcondition(redrightbutton, 20);
			click(redrightbutton);

			Wait_for_PageComplete(3000);
			waitforcondition(selectdate5, 20);
			click(selectdate5);

			Wait_for_PageComplete(3000);
			waitforcondition(selecthour5, 20);
			selectByText(selecthour5, "10");

			Wait_for_PageComplete(3000);
			waitforcondition(selectminute5, 20);
			selectByText(selectminute5, "30");

			Wait_for_PageComplete(3000);
			waitforcondition(selectampm5, 20);
			selectByText(selectampm5, "PM");

			Wait_for_PageComplete(3000);
			waitforcondition(scedulebutton, 20);
			click(scedulebutton);

			System.out.println("5th Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}
		
		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);

		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule5, 20);
		
		if(findElements(reshedule5)>0) {
			Wait_for_PageComplete(5000);
			waitforcondition(joininterview5, 20);
			click(joininterview5);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 
		
		waitforcondition(scedule1, 20);

		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);
			
			if (findElements(dashboard) > 0) {

			Wait_for_PageComplete(3000);
			waitforcondition(redrightbutton, 20);
			click(redrightbutton);

			Wait_for_PageComplete(3000);
			waitforcondition(selectdate6, 20);
			click(selectdate6);

			Wait_for_PageComplete(3000);
			waitforcondition(selecthour6, 20);
			selectByText(selecthour6, "10");

			Wait_for_PageComplete(3000);
			waitforcondition(selectminute6, 20);
			selectByText(selectminute6, "30");

			Wait_for_PageComplete(3000);
			waitforcondition(selectampm6, 20);
			selectByText(selectampm6, "PM");

			Wait_for_PageComplete(3000);
			waitforcondition(scedulebutton, 20);
			click(scedulebutton);

			System.out.println("6th Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}
		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);

		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule6, 20);
		
		if(findElements(reshedule6)>0) {
			Wait_for_PageComplete(5000);
			waitforcondition(joininterview6, 20);
			click(joininterview6);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		waitforcondition(scedule1, 20);
		
		if (findElements(scedule1) > 0) {

			waitforcondition(scedule1, 20);
			click(scedule1);

			waitforcondition(dashboard, 20);
			
			if (findElements(dashboard) > 0) {

			Wait_for_PageComplete(3000);
			waitforcondition(redrightbutton, 20);
			click(redrightbutton);

			Wait_for_PageComplete(3000);
			waitforcondition(selectdate7, 20);
			click(selectdate7);

			Wait_for_PageComplete(3000);
			waitforcondition(selecthour7, 20);
			selectByText(selecthour7, "10");

			Wait_for_PageComplete(3000);
			waitforcondition(selectminute7, 20);
			selectByText(selectminute7, "30");

			Wait_for_PageComplete(3000);
			waitforcondition(selectampm7, 20);
			selectByText(selectampm7, "PM");

			Wait_for_PageComplete(3000);
			waitforcondition(scedulebutton, 20);
			click(scedulebutton);

			System.out.println("7th Interview Sceduled");
			}

		} else {
			System.out.println("other interview scheduled at the time");
		}

		waitforcondition(joininterview, 20);
		waitforcondition(cancelinterview, 20);
		
		if (findElements(joininterview) > 0 && findElements(cancelinterview) > 0) {
			Wait_for_PageComplete(8000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		}

		waitforcondition(reshedule7, 20);
		
		if(findElements(reshedule7)>0) {

			Wait_for_PageComplete(5000);
			waitforcondition(joininterview7, 20);
			click(joininterview7);
			Wait_for_PageComplete(5000);
			navigateback();
			
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);
		} 

		Wait_for_PageComplete(5000);
		waitforcondition(saveandcontinuebutton, 20);
		click(saveandcontinuebutton);

	}

	public void Verify_ResheduleInterview() throws InterruptedException {
		By menubar = By.xpath(prop.getProperty("menubar"));
		By aiinterview = By.xpath(prop.getProperty("aiinterview"));
		By okay = By.xpath(prop.getProperty("okay"));
		By reshedule1 = By.xpath(prop.getProperty("reshedule1"));
		By redrightbutton = By.xpath(prop.getProperty("redrightbutton"));

		By selectdate1 = By.xpath(prop.getProperty("selectdate1"));
		By selecthour1 = By.xpath(prop.getProperty("selecthour1"));
		By selectminute1 = By.xpath(prop.getProperty("selectminute1"));
		By selectampm1 = By.xpath(prop.getProperty("selectampm1"));

//		By selectdate2 = By.xpath(prop.getProperty("selectdate2"));
//		By selecthour2 = By.xpath(prop.getProperty("selecthour2"));
//		By selectminute2 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm2 = By.xpath(prop.getProperty("selectampm2"));
//
//		By selectdate3 = By.xpath(prop.getProperty("selectdate3"));
//		By selecthour3 = By.xpath(prop.getProperty("selecthour3"));
//		By selectminute3 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm3 = By.xpath(prop.getProperty("selectampm3"));
//
//		By selectdate4 = By.xpath(prop.getProperty("selectdate4"));
//		By selecthour4 = By.xpath(prop.getProperty("selecthour4"));
//		By selectminute4 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm4 = By.xpath(prop.getProperty("selectampm4"));
//
//		By selectdate5 = By.xpath(prop.getProperty("selectdate5"));
//		By selecthour5 = By.xpath(prop.getProperty("selecthour5"));
//		By selectminute5 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm5 = By.xpath(prop.getProperty("selectampm5"));
//
//		By selectdate6 = By.xpath(prop.getProperty("selectdate6"));
//		By selecthour6 = By.xpath(prop.getProperty("selecthour6"));
//		By selectminute6 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm6 = By.xpath(prop.getProperty("selectampm6"));
//
//		By selectdate7 = By.xpath(prop.getProperty("selectdate7"));
//		By selecthour7 = By.xpath(prop.getProperty("selecthour7"));
//		By selectminute7 = By.xpath(prop.getProperty("selectminute1"));
//		By selectampm7 = By.xpath(prop.getProperty("selectampm7"));

		Wait_for_PageComplete(4000);
		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(aiinterview, 20);
		click(aiinterview);

		try {
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(5000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(redrightbutton, 20);
			click(redrightbutton);

			waitforcondition(selectdate1, 20);
			click(selectdate1);

			Wait_for_PageComplete(2000);
			waitforcondition(selecthour1, 20);
			selectByText(selecthour1, "8");

			Wait_for_PageComplete(2000);
			waitforcondition(selectminute1, 20);
			selectByText(selectminute1, "35");

			Wait_for_PageComplete(2000);
			waitforcondition(selectampm1, 20);
			selectByText(selectampm1, "PM");

			Wait_for_PageComplete(2000);
			waitforcondition(reshedule1, 20);
			click(reshedule1);

			System.out.println("1st Interview Sceduled");

		} catch (Exception e) {
			System.out.println("other interview scheduled at the time");
		}
	}

	public void Verify_CancelInterview() throws InterruptedException, IOException {
		Load_Prop();
		
		By menubar = By.xpath(prop.getProperty("menubar"));
		By aiinterview = By.xpath(prop.getProperty("aiinterview"));
		By okay = By.xpath(prop.getProperty("okay"));
		By reshedule1 = By.xpath(prop.getProperty("reshedule1"));
		By cancelinterview = By.xpath(prop.getProperty("cancelinterview"));

		Wait_for_PageComplete(4000);
		waitforcondition(menubar, 20);
		click(menubar);

		waitforcondition(aiinterview, 20);
		click(aiinterview);

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

		try {
			Wait_for_PageComplete(2000);
			waitforcondition(okay, 20);
			click(okay);
			Wait_for_PageComplete(3000);

			waitforcondition(reshedule1, 20);
			click(reshedule1);

			waitforcondition(cancelinterview, 20);
			click(cancelinterview);

			Wait_for_PageComplete(3000);
			navigateback();
			Wait_for_PageComplete(3000);

		} catch (ElementNotInteractableException e) {

		}

	}

}
