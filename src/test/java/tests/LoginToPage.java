package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.HomePage;

public class LoginToPage extends Base {
	public static Logger log = LogManager.getLogger(LoginToPage.class.getName());
	private String username = "filip.jakovlevski@sfcpasandbox.clarivate.com";
	private String password = "1MSisK5hG1Q0%";
	
	@Test
	
	public void login() throws InterruptedException {
		driver = initializeDriver();
		driver.get("https://cpa-global--cifulluat.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fcpa-global--cifulluat.lightning.force.com%252Flightning%252Fpage%252Fhome");
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.loginButton().click();
		waitForTextToAppear(driver, "Sales", hp.salesTitle());
		log.info("User successfully logged in and "+ hp.salesTitle().getText() + " homepage is displayed");
	}
		

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
