package tests;

import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContactPage;

public class DoNotSyncToMarketo extends Base {
	public static Logger log = LogManager.getLogger(DoNotSyncToMarketo.class.getName());
	private String doNotSyncToMarketo = "doNotSyncToMarketo";
	private String marketingConsentType = "Direct Consent";
	
	@Test
	
	public void doNotSyncToMarketo() throws Exception {
		ContactPage cp = new ContactPage(driver);
		wait_time(3);
		cp.editContactButton().click();
		waitForElementToAppear(driver, cp.newContactTitle());
		log.info(cp.newContactTitle().getText() + " popup is opened");
		scrollIntoView(cp.legimateDuplicateCheckbox());
		cp.legimateDuplicateCheckbox().click();
		cp.saveButton().click();
		wait_time(2);
		log.info("Legitimate Duplicate checkbox is set as true");
		scrollIntoView(cp.doNotSyncToMarketo());
		captureElement(doNotSyncToMarketo, cp.doNotSyncToMarketoCheckbox());
		log.info("Verify screenshot to see if Do not Sync To Marketo checkbox is set to TRUE!");
	}
	
	@Test
	public void marketingConsent() {
		ContactPage cp = new ContactPage(driver);
		wait_time(1);
		cp.editContactButton().click();
		waitForElementToAppear(driver, cp.newContactTitle());
		log.info(cp.newContactTitle().getText() + " popup is opened");
		wait_time(2);
		scrollIntoView(cp.marketingConsentType());
		cp.marketingConsentType().click();
		for(int i=0;i<cp.marketingConsentTypeList().size();i++) {
			if(cp.marketingConsentTypeList().get(i).getText().equals(marketingConsentType)) {
				jsClick(cp.marketingConsentTypeList().get(i), driver);
				break;
			}
		}
		cp.saveButton().click();
		wait_time(2);
		scrollIntoView(cp.marketingConsentDateStamp());
		log.info("After setting Marketing Consent Type to " + marketingConsentType + " Marketing Consent Date stamp is changed to " +cp.marketingConsentDateStamp().getText());
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
