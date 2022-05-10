package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContractPage;

public class ContractAutomations extends Base {
	public static Logger log = LogManager.getLogger(ContractAutomations.class.getName());
	private String contact = "Filip";
	
	@Test
	
	public void contractAutomations() throws InterruptedException {
		ContractPage cop = new ContractPage(driver);
		scrollIntoView(cop.billingContact());
		log.info("Before updating Billing contact is " +cop.billingContactInfo().getText()+ " and Billing address is "+cop.billingAddressInfo().getText()+ " and Billing Email is " +cop.billingEmailInfo().getText());
		log.info("NOTE: Before updating billing contact, billing address and billing email could be empty");
		cop.billingContactDropdown().click();
		cop.billingContactEdit().click();
		wait_time(1);
		scrollIntoView(cop.billingContact());
		cop.billingContact().sendKeys(contact);
		wait_time(2);
		cop.contactList().get(0).click();
		cop.saveButton().click();
		wait_time(1);
		scrollIntoView(cop.billingContact());
		log.info("After updating Billing contact is " +cop.billingContactInfo().getText()+ " and Billing address is "+cop.billingAddressInfo().getText()+ " and Billing Email is " +cop.billingEmailInfo().getText());
	
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
