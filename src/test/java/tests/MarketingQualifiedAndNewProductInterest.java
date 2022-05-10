package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContactPage;

public class MarketingQualifiedAndNewProductInterest extends Base {
	public static Logger log = LogManager.getLogger(MarketingQualifiedAndNewProductInterest.class.getName());
	private String contactLifecycleStatusList = "Marketing Qualified";
	private String lastProductInterest = "Forecast";

	@Test
	
	public void marketingQualifiedAndNewProductInterest() throws InterruptedException {
		ContactPage cp = new ContactPage(driver);
		wait_time(3);
		cp.editContactButton().click();
		waitForElementToAppear(driver, cp.newContactTitle());
		log.info(cp.newContactTitle().getText() + " popup is opened");
		cp.contactLifecycleStatus().click();
		for(int i=0;i<cp.contactLifecycleStatusList().size();i++) {
			if(cp.contactLifecycleStatusList().get(i).getText().equals(contactLifecycleStatusList)) {
				cp.contactLifecycleStatusList().get(i).click();
				break;
			}
		}
		cp.saveButton().click();
		wait_time(2);
		log.info("After changing Contact Lifecycle Status to " +contactLifecycleStatusList);
		log.info(cp.mqcTask().getText()+ " task is created with " + cp.mqcTime().getText() + " time");
		wait_time(3);
		cp.editContactButton().click();
		wait_time(3);
		waitForElementToAppear(driver, cp.newContactTitle());
		log.info(cp.newContactTitle().getText() + " popup is opened");
		cp.lastProductInterest().click();
		for(int i=0;i<cp.lastProductInterestList().size();i++) {
			if(cp.lastProductInterestList().get(i).getText().equals(lastProductInterest)) {
				cp.lastProductInterestList().get(i).click();
				break;
			}
		}
		cp.saveButton().click();
		wait_time(2);
		log.info("After changing Last Product Interest to " +lastProductInterest);
		log.info(cp.cpiTask().getText()+ " task is created with " + cp.cpiTime().getText() + " time");
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
