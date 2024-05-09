package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class Applied_Job_Test extends TestBase {
	
	
	@Test
	public void VerifyAppliedJobs() throws IOException, InterruptedException {
		login();
		verifyappliedjobs.Verify_AppliedJob();
	}
}
