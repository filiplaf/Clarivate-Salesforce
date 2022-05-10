package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ContractLinePage;
import pageObjects.ContractPage;
import pageObjects.HomePage;

public class ContractLineAutomation extends Base {
	public static Logger log = LogManager.getLogger(ContractLineAutomation.class.getName());
	private String product = "Idea Portal";
	private String quantity = "1";
	private String typeOfStartPayDate = "No SPD Required";
	private String editProductName = "Idea Portal";
	
	@Test
	
	public void contractItemAutomation() throws InterruptedException {
		ContractPage cop = new ContractPage(driver);
		ContractLinePage clp = new ContractLinePage(driver);
		wait_time(1);
		cop.contractLineItems().click();
		clp.newLineItems().click();
		waitForElementToAppear(driver, clp.newContractLineItemsTitle());
		wait_time(1);
		log.info( clp.newContractLineItemsTitle().getText() + " is opened");
		clp.searchProduct().sendKeys(product);
		wait_time(1);
		clp.searchProduct().sendKeys(Keys.ENTER);
		wait_time(1);
		clp.selectProduct().click();
		clp.nextButton().click();
		wait_time(1);
		clp.quanity().click();
		clp.quanityField().sendKeys(quantity);
		clp.saveButton().click();
		waitForElementToAppear(driver,clp.label());
		log.info(clp.label().getText());
		wait_time(2);
		clp.contractLineItem().click();
		if(clp.typeOfStartPayDateField().getText().equals(typeOfStartPayDate)) {
			log.info("Type of Start Pay Date is " + clp.typeOfStartPayDateField().getText());
		}
		else {log.info("Type of Start Pay Date is wrong");}
	}
	
	@Test
	public void updateProduct() {
		ContractLinePage clp = new ContractLinePage(driver);
		HomePage hp = new HomePage(driver);
		ContractPage cp = new ContractPage(driver);
		clp.product().click();
		clp.editProductButton().click();
		wait_time(2);
		log.info(clp.editProductTitle().getText() + " popup is opened");
		clp.productName().click();
		clp.productName().clear();
		clp.productName().sendKeys(editProductName);
		clp.saveEditButton().click();
		wait_time(1);
		hp.contractPage().click();
		wait_time(2);
		cp.contractNameList().get(0).click();
		cp.contractLineItems().click();
		clp.contractLineItem().click();
		log.info("After editing product name to " +editProductName+ " on Contract line product name is " +clp.product().getText());
	}
	
	
	
	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
