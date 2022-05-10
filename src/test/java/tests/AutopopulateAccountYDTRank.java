package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.ClientOverviewPage;
import pageObjects.HomePage;

public class AutopopulateAccountYDTRank extends Base {
	public static Logger log = LogManager.getLogger(AutopopulateAccountYDTRank.class.getName());
	private String accountName = "Filip_testAcc";
	private String clientOverviewName = "clientOverview";
	private String ytdRank = "123";
	
	@Test
	
	public void autopopulateAccountYDTRank() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		AccountPage ap = new AccountPage(driver);
		ClientOverviewPage cop = new ClientOverviewPage(driver);
		hp.accountPage().click();
		for (int i = 0; i<ap.accountName().size(); i++) {
		String all = ap.accountName().get(i).getText();
			if(all.equals(accountName)){
				ap.accountName().get(i).click();
				break;
			}
		}
		ap.clientOverviewOption().click();
		ap.newClientOverviewButton().click();
		cop.clientOverviewName().sendKeys(clientOverviewName);
		cop.ytdRank().sendKeys(ytdRank);
		cop.saveButton().click();
		waitForElementToAppear(driver,ap.label());
		log.info(ap.label().getText());
		hp.accountPage().click();
		wait_time(1);
		for (int i = 0; i<ap.accountName().size(); i++) {
			String all = ap.accountName().get(i).getText();
				if(all.equals(accountName)){
					ap.accountName().get(i).click();
					break;
				}
			}
		scrollIntoView(ap.ytdRank());
		if(ap.ytdRank().getText().equals(ytdRank)) {
			log.info("YTD Rank updated successfully");
		}
		else log.info("Something went wrong");
	}

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
