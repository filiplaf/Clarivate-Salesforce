package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContractPage;
import pageObjects.HomePage;

public class CreateNewAPACContract extends Base {
	public static Logger log = LogManager.getLogger(CreateNewAPACContract.class.getName());
	private String contractName = "Filip";
	private String approvalStatus = "Generate Contract";
	private String accountName = "cpa test test";
	private String contractType = "--None--";
	private String cpaRegion = "APAC";
	
	@Test
	
	public void createNewAPACContract() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		ContractPage cop = new ContractPage(driver);
		hp.contractPage().click();
		cop.newContractButton().click();
		waitForElementToAppear(driver, cop.newContractTitle());
		wait_time(2);
		log.info(cop.newContractTitle().getText() + " is opened");
		cop.contractName().sendKeys(contractName);
		cop.approvalStatus().click();
		for(int i=0;i<cop.approvalStatusList().size();i++) {
			if(cop.approvalStatusList().get(i).getText().equals(approvalStatus)) {
				cop.contractTypeList().get(i).click();
				break;
			}
		}
		cop.contractType().click();
		wait_time(2);
		for(int i=0;i<cop.contractTypeList().size();i++) {
			if(cop.contractTypeList().get(i).getText().equals(contractType)) {
				cop.contractTypeList().get(i).click();
				break;
			}
		}
		cop.accountName().sendKeys(accountName);
		wait_time(2);
		cop.accountNameList().get(0).click();
		cop.cpaRegion().click();
		for(int i=0;i<cop.cpaRegionList().size();i++) {
			if(cop.cpaRegionList().get(i).getText().equals(cpaRegion)) {
				cop.cpaRegionList().get(i).click();
				break;
			}
		}
		cop.saveButton().click();
		waitForElementToAppear(driver,cop.label());
		log.info("EMEA " +cop.label().getText());
		log.info("After creating APAC contract with Generate Contract approval status, contract owner is " +cop.contractOwnerInfo().getText()+ " and CPA docusign email is " +cop.cpaDocusignEmailInfo().getText());
	}
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
