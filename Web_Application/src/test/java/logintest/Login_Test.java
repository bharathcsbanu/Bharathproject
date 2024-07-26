package logintest;

import org.testng.annotations.Test;

public class Login_Test {
	@Test
	public void logintest() {

		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String EMAILID = System.getProperty("EmailId");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(EMAILID);
		System.out.println(PASSWORD);
	}

	@Test
	public void modifiy_Test() {
		System.out.println("Execute modifiyTest");
	}
}
