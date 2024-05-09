package Techies4Tech.T4T;

import java.io.IOException;

import org.testng.annotations.Test;

public class Verify_Menu_Bar_Links_Test extends TestBase {

	@Test
	public void Verify_MenuBar_Links() throws IOException, InterruptedException {
		login();
		verifymenubarlinks.verify_Links();
	}
}
