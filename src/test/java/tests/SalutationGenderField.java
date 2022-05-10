package tests;

import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContactPage;

public class SalutationGenderField extends Base {
	public static Logger log = LogManager.getLogger(SalutationGenderField.class.getName());
	
	@Test
	
	public void salutationGenderField() throws Exception {
		ContactPage cp = new ContactPage(driver);
		wait_time(1);
		scrollIntoView(cp.genderField());
		log.info("After creating new contact with salutation MR. gender is set to " + cp.genderField().getText());
		
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
