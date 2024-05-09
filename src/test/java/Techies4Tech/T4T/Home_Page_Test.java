package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class Home_Page_Test extends TestBase {

	@Test
	public void HomePageTest() throws IOException, InterruptedException {
		
		homepage.Get_Page_Title();
		
		homepage.Verify_About_Us_Link();
		homepage.Verify_News_Link();
		homepage.Verify_Contact_Us_Link();
		homepage.Verify_Join_Us_Link();
		
		homepage.Verify_Sign_in();
		
		homepage.Verify_Hire_Talent();
		homepage.Verify_hire_client();
		homepage.Verify_find_contract();
		homepage.Verify_find_career();
		
		homepage.Verify_News_Link();
		
		homepage.Verify_Quick_Links();
		
		homepage.Verify_Company_Links();
		
		homepage.Verify_Newletter_Mail();
		
		
		
	}
}
