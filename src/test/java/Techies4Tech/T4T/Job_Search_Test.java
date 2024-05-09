package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class Job_Search_Test extends TestBase {

	@Test
	public void Verify_Job_Search() throws IOException, InterruptedException {
		login();
		jobsearchpage.Verify_Job_Search();

	}
}
