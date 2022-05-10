package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.AtRiskRegisterPage;
import pageObjects.HomePage;

public class AutoCalculateSeverityLevel extends Base {
	public static Logger log = LogManager.getLogger(AutoCalculateSeverityLevel.class.getName());
	private String accountName = "Filip_testAcc";
	private String arrName = "calculateSeverity";
	private String revenueAtRisk = "1000000";
	private String issueDescription = "test";
	private String requredResolution = "test";
	private String actionPlan = "test";
	private String actionLog = "test";
	private String primaryIssue = "CPA Pricing Issue";
	
	@Test
	
	public void cpaAssetPopulation() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		AccountPage ap = new AccountPage(driver);
		AtRiskRegisterPage arr = new AtRiskRegisterPage(driver);
		hp.accountPage().click();
		for (int i = 0; i<ap.accountName().size(); i++) {
		String all = ap.accountName().get(i).getText();
			if(all.equals(accountName)){
				ap.accountName().get(i).click();
				break;
			}
		}
		ap.atRiskRegisterOption().click();
		ap.newAtRiskRegisterButton().click();
		arr.arrName().sendKeys(arrName);
		arr.productTypeList().click();
		arr.productTypeList().click();
		arr.productTypeList().sendKeys(Keys.ARROW_DOWN);
		arr.productTypeList().sendKeys(Keys.ENTER);
		arr.revenueAtRisk().sendKeys(revenueAtRisk);
		arr.sourceOfRisk().click();
		arr.sourceOfRisk().click();
		arr.sourceOfRisk().sendKeys(Keys.ARROW_DOWN);
		arr.sourceOfRisk().sendKeys(Keys.ENTER);
		arr.likehood().click();
		arr.likehood().sendKeys(Keys.ARROW_DOWN);
		arr.likehood().sendKeys(Keys.ENTER);
		arr.issueDescription().sendKeys(issueDescription);
		jsClick(arr.primaryIssue(), driver);
		wait_time(1);
		for (int i = 0; i<arr.primaryIssueList().size(); i++) {
			//System.out.println(arr.primaryIssueList().size());
			String all = arr.primaryIssueList().get(i).getText();
			//System.out.println(all);
				if(all.equals(primaryIssue)){
					jsClick(arr.primaryIssueList().get(i), driver);
					break;
				}
		}
		wait_time(5);
		arr.requiredResolution().sendKeys(requredResolution);
		jsClick(arr.progressStage(), driver);
		arr.progressStage().sendKeys(Keys.ARROW_DOWN);
		arr.progressStage().sendKeys(Keys.ENTER);
		arr.actionPlan().sendKeys(actionPlan);
		arr.actionLog().sendKeys(actionLog);
		arr.saveButton().click();
		waitForElementToAppear(driver,ap.label());
		log.info(ap.label().getText());
		wait_time(5);
		for (int i = 0; i<ap.atRiskRegisterName().size(); i++) {
			String all = ap.atRiskRegisterName().get(i).getText();
				if(all.equals(arrName)){
					ap.atRiskRegisterName().get(i).click();
					break;
				}
	}
		wait_time(3);
		String securityLevel = arr.securityLevel().getText();
		log.info(securityLevel);
		if(securityLevel.equals(securityLevel)){
		log.info("When Revenue At Risk is " +revenueAtRisk+ " then security level is " +securityLevel);}
		else {log.error("Something went wrong");}
	}

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
