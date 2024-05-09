package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class My_profile_Page_Test extends TestBase {

	@Test
	public void Verify_My_Profile_Page() throws IOException, InterruptedException {
		login();
		myprofilepage.Edit_and_Verify_1();
		myprofilepage.Edit_and_Verify_2();
		Edit_and_Verify_3();
		Edit_and_Verify_4();
		Edit_and_Verify_5();
		Edit_and_Verify_6();
		Edit_and_Verify_7();
		Edit_and_Verify_8();
		Edit_and_Verify_9();
		Edit_and_Verify_10();
		myprofilepage.Schedule_interviews_1();
		myprofilepage.Update_Resume();
		Rate_Skills();

	}

	public void Edit_and_Verify_3() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_3();
		candidatesignuppage.Verify_Skill_Assessment_1("3", "9", "1", "8", "2", "9", "2", "9", "3", "8", "1", "10");
		System.out.println("3rd button passed");

	}

	public void Edit_and_Verify_4() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_4();
		candidatesignuppage.Verify_Skill_Assessment_1("3", "9", "1", "7", "1", "8", "1", "9", "1", "10", "1", "10");
		System.out.println("4th button passed");
	}

	public void Edit_and_Verify_5() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_5();
		candidatesignuppage.Verify_Skill_Assessment_1("1", "9", "1", "9", "1", "9", "1", "9", "1", "9", "1", "10");
		System.out.println("5th button passed");
	}

	public void Edit_and_Verify_6() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_6();
		candidatesignuppage.Verify_Skill_Assessment_1("3", "8", "1", "7", "1", "9", "1", "9", "1", "9", "2", "10");
		System.out.println("6th button passed");
	}

	public void Edit_and_Verify_7() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_7();
		candidatesignuppage.Verify_Skill_Assessment_1("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		System.out.println("7th button passed");
	}

	public void Edit_and_Verify_8() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_8();
		candidatesignuppage.Verify_Skill_Assessment_1("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		System.out.println("8th button passed");
	}

	public void Edit_and_Verify_9() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_9();
		candidatesignuppage.Verify_Skill_Assessment_1("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		System.out.println("9th button passed");
	}

	public void Edit_and_Verify_10() throws IOException, InterruptedException {
		myprofilepage.Edit_and_Verify_10();
		candidatesignuppage.Verify_Skill_Assessment_1("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		System.out.println("10th button passed");
	}

	public void Rate_Skills() throws IOException, InterruptedException {
		candidatesignuppage.Verify_Skill_Assessment_1("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_2("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_3("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_4("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_5("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_6("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_7("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_8("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_9("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_10("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");
		candidatesignuppage.Verify_Skill_Assessment_11("2", "9", "1", "9", "2", "9", "1", "9", "1", "9", "2", "10");

	}

}
