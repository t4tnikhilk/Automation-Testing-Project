package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class AI_Interview_Test extends TestBase{
		
	@Test
	public void Verify_Schedule_and_JoinInterview() throws IOException, InterruptedException {
		login();
		aiinterviewpage.Verify_Scedule_and_JoinInterview();
	}
	
	
	public void Verify_CancelInterview() throws IOException, InterruptedException {
		login();
		aiinterviewpage.Verify_CancelInterview();
	}
	
	
}
