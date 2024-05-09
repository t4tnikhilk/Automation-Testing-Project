package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class Candidate_Sign_Up_Test extends TestBase {

	@Test
	public void candidatesignup() throws IOException, InterruptedException {

		candidatesignuppage.Verify_Candidate_Sign_Up_Page();

		candidatesignuppage.Verify_Profile_Page();

		candidatesignuppage.Verify_Candidate_Welcome_Page();
		
		candidatesignuppage.Verify_Skill_Assessment_1("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_2("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_3("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_4("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_5("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_6("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_7("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_8("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_9("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_10("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_11("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_12("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_13("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_14("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_15("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");
		
		candidatesignuppage.Verify_Skill_Assessment_16("5", "10", "1", "9", "2", "8", "3", "10", "1", "9", "2", "7");


		candidatesignuppage.Verify_Employment_and_Role_Preferences_Page();

		candidatesignuppage.Review_Your_Profile();

		candidatesignuppage.Verify_Upload_Profile_Photo();
	}

}
