package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.HomePage;

public class CreateNewAssetOnExistingAccount extends Base {
	public static Logger log = LogManager.getLogger(CreateNewAssetOnExistingAccount.class.getName());
	private String accountName = "Filip_testAcc";
	private String assetName = "test";
	private String product = "Trademark";

	
	@Test
	
	public void createNewAssetOnExistingAccount() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		AccountPage ap = new AccountPage(driver);
		hp.accountPage().click();
		for (int i = 0; i<ap.accountName().size(); i++) {
		String all = ap.accountName().get(i).getText();
			if(all.equals(accountName)){
				ap.accountName().get(i).click();
				break;
			}
		}
		ap.assetOption().click();
		ap.newAssetButton().click();
		ap.nextAssetButton().click();
		ap.assetName().sendKeys(assetName);
		ap.product().click();
		wait_time(1);
		ap.product().sendKeys(product);
		wait_time(1);
		ap.productList().click();
		ap.saveAssetButton().click();	
		waitForElementToAppear(driver,ap.label());
		log.info(ap.label().getText());
	}

		

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
