package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContactPage;
import pageObjects.HomePage;

public class CreateNewContact extends Base {
	public static Logger log = LogManager.getLogger(CreateNewContact.class.getName());
	private String salutation = "Mr.";
	private String firstName = "Filip";
	private String lastName = "Jakovlevski";
	private String email ="filip.jakovlevski@clarivate.com";
	private String contactStatus = "Active";
	private String accountName = "cpa test test";
	private String jobTitle = "Associate";
	private String firstProductInterest = "Docketing";
	
	@Test
	
	public void crateNewContact() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		ContactPage cp = new ContactPage(driver);
		hp.contactPage().click();
		cp.newAccountButton().click();
		waitForElementToAppear(driver, cp.newContactTitle());
		log.info(cp.newContactTitle().getText() + " is opened");
		//Create new Contact
				cp.salutation().click();
				for(int i=0;i<cp.salutationList().size();i++) {
					if(cp.salutationList().get(i).getText().equals(salutation)) {
						cp.salutationList().get(i).click();
						break;
					}
				}
				cp.firstName().sendKeys(firstName);
				cp.lastName().sendKeys(lastName);
				cp.email().sendKeys(email);
				cp.contactStatus().click();
				for(int i=0;i<cp.contactStatusList().size();i++) {
					if(cp.contactStatusList().get(i).getText().equals(contactStatus)) {
						cp.contactStatusList().get(i).click();
						break;
					}
				}
				cp.accountName().click();
				cp.accountName().sendKeys(accountName);
				wait_time(2);
				cp.accountNameList().get(0).click();
				cp.jobTitle().click();
				for(int i=0;i<cp.jobTitleList().size();i++) {
					if(cp.jobTitleList().get(i).getText().equals(jobTitle)) {
						cp.jobTitleList().get(i).click();
						break;
					}
				}
				cp.firstProductInterest().click();
				for(int i=0;i<cp.firstProductInterestList().size();i++) {
					if(cp.firstProductInterestList().get(i).getText().equals(firstProductInterest)) {
						cp.firstProductInterestList().get(i).click();
						break;
					}
				}
				cp.saveButton().click();
				waitForElementToAppear(driver,cp.label());
				log.info(cp.label().getText());
	}
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
