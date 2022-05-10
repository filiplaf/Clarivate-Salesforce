package tests;

import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.HomePage;

public class CreateNewANZAccount extends Base {
	public static Logger log = LogManager.getLogger(CreateNewANZAccount.class.getName());
	private String accountName = "Filip_ANZacc";
	private String country = "Australia";
	private String state = "South Australia";
	private String streetAdress = "Visnjiceva 11";
	private String city = "Belgrade";
	private String accountStatus = "Active";
	private String industryName = "Accessories";
	private String customerType = "Competitor";
	private String cpaRegion = "ANZ";
	private String cpaRegionNew = "ANZ";
	//private String subRegion = "India";
	//private String registeredCountry = "Serbia";
	
	@Test
	
	public void createNewAccount() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		AccountPage ap = new AccountPage(driver);
		hp.accountPage().click();
		ap.newAccountButton().click();
		log.info("CPA customer is selected");
		ap.nextButton().click();
		wait_time(2);
		//Account Search
		ap.accountname().sendKeys(accountName);
		ap.countryList().click();
		for (int i = 0; i<ap.country().size(); i++) {
		String all = ap.country().get(i).getText();
		//System.out.println(all);
			if(all.equals(country)){
			jsClick(ap.country().get(i), driver);
			break;
			}
		}
		ap.stateList().click();
		for (int i = 0; i<ap.state().size(); i++) {
		String all = ap.state().get(i).getText();
		//System.out.println(all);
			if(all.equals(state)){
			jsClick(ap.state().get(i), driver);
			break;
			}
		}
		ap.streetAdress().sendKeys(streetAdress);
		ap.city().sendKeys(city);
		ap.searchButton().click();
		wait_time(15);
		System.out.println(ap.searchText().getText());
		ap.createNewButton().click();
		wait_time(2);
		ap.accountStatusList().click();
		for (int i = 0; i<ap.accountStatus().size(); i++) {
		String all = ap.accountStatus().get(i).getText();
			if(all.equals(accountStatus)){
				ap.accountStatus().get(i).click();
				break;
			}
		}
		ap.industryList().click();
		for (int i = 0; i<ap.industry().size(); i++) {
		String all = ap.industry().get(i).getText();
			if(all.equals(industryName)){
				ap.industry().get(i).click();
				break;
			}
		}
		ap.customerTypeList().click();
		for (int i = 0; i<ap.customerType().size(); i++) {
		String all = ap.customerType().get(i).getText();
			if(all.equals(customerType)){
				ap.customerType().get(i).click();
				break;
			}
		}
		ap.cpaRegionList().click();
		for (int i = 0; i<ap.cpaRegion().size(); i++) {
		String all = ap.cpaRegion().get(i).getText();
			if(all.equals(cpaRegion)){
				ap.cpaRegion().get(i).click();
				break;
			}
		}
		ap.regionNewList().click();
		for (int i = 0; i<ap.regionNew().size(); i++) {
		String all = ap.regionNew().get(i).getText();
			if(all.equals(cpaRegionNew)){
				ap.regionNew().get(i).click();
				break;
			}
		}
//		ap.subRegionList().click();
//		for (int i = 0; i<ap.subRegion().size(); i++) {
//		String all = ap.subRegion().get(i).getText();
//			if(all.equals(subRegion)){
//				ap.subRegion().get(i).click();
//				break;
//			}
//		}
//		//Adress
//		ap.registeredCountryList().click();
//		for (int i = 0; i<ap.registeredCountry().size(); i++) {
//		String all = ap.registeredCountry().get(i).getText();
//			if(all.equals(registeredCountry)){
//				ap.subRegion().get(i).click();
//			}
//		}
		ap.saveAccountButton().click();
		waitForElementToAppear(driver,ap.label());
		log.info(ap.label().getText());
	}
		

	@AfterTest(alwaysRun = true)
	public void teardown() {
//		driver.close();
//		driver.quit();
	}
}
