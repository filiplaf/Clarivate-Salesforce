package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.AssetPage;
import pageObjects.HomePage;

public class CPAAssetPopulation extends Base {
	public static Logger log = LogManager.getLogger(CPAAssetPopulation.class.getName());
	private String accountName = "Filip_testAcc";
	private String assetNameList = "assetName";
	private String accountNameOnAsset = "cpa test test";
	
	@Test
	
	public void cpaAssetPopulation() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		AccountPage ap = new AccountPage(driver);
		AssetPage asp = new AssetPage(driver);
		hp.accountPage().click();
		for (int i = 0; i<ap.accountName().size(); i++) {
		String all = ap.accountName().get(i).getText();
			if(all.equals(accountName)){
				ap.accountName().get(i).click();
				break;
			}
		}
		ap.assetOption().click();
		for (int i = 0; i<ap.assetNameList().size(); i++) {
			String all = ap.assetNameList().get(i).getText();
			wait_time(1);
				if(all.equals(assetNameList)){
					ap.assetNameList().get(i).click();
					break;
				}
			}
		log.info("For Automation Account ID before change is "+asp.forAutomationAccountID().getText());
		String automationIdBefore = asp.forAutomationAccountID().getText();
		asp.editAssetButton().click();
		asp.editAccountOnAsset().click();
		asp.accountNameOnAsset().click();
		asp.accountNameOnAsset().sendKeys(accountNameOnAsset);
		wait_time(1);
		asp.newAccountName().click();
		asp.saveAssetButton().click();
		waitForElementToAppear(driver,ap.label());
		log.info(ap.label().getText());
		log.info("For Automation Account ID after change is "+asp.forAutomationAccountID().getText());
		String automationIdAfter = asp.forAutomationAccountID().getText();
		if(automationIdBefore==automationIdAfter) {
			log.error("Something went wrong");
		}
		else log.info("For Automation Account ID changed successfully");
	}	

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
