package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractPage {
	
	public WebDriver driver;
	By newContractButton = By.cssSelector("div#brandBand_1 a > div");
	By newContractTitle = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/h2");
	By contractName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[1]/div[1]/div/div/div/input");
	By approvalStatus = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a");
	By approvalStatusList = By.cssSelector("li.uiMenuItem.uiRadioMenuItem>a");
	By contractType = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[3]/div[1]/div/div/div/div/div[1]/div");
	By contractTypeList = By.cssSelector("li.uiMenuItem.uiRadioMenuItem>a");
	By accountName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[4]/div[1]/div/div/div/div/div/div[1]/div/input");
	By accountNameList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[4]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li[1]/a");
	By cpaRegion = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[5]/div[1]/div/div/div/div/div[1]/div/div/a");
	By cpaRegionList = By.cssSelector("li.uiMenuItem.uiRadioMenuItem>a");
	By saveButton = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/button[3]");
	By label = By.cssSelector("div.forceToastManager--default.forceToastManager.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div > div > div > div > div > span"); 
	By contractLineItems = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/force-quick-link-container/article/div[2]/ul/li[1]/force-related-list-quick-link/div/div[2]/a");
	By contractNameList = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a");
	By billingContactDropdown = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/div/header/div[2]/div/div[2]/ul/li[4]/div/div[1]/div/div/a");
	By billingContactEdit = By.xpath("/html/body/div[11]/div/ul/li[3]/a");
	By billingContact = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[5]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/input");
	By contactList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[5]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li/a/div[2]");
	By billingContactInfo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div[4]/div/article/div[2]/div/div[5]/div/div/div[1]/div[1]/div/div[2]/span");
	By billingAddressInfo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div[4]/div/article/div[2]/div/div[5]/div/div/div[2]/div[1]/div/div[2]/span");
	By billingEmailInfo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div[4]/div/article/div[2]/div/div[5]/div/div/div[1]/div[2]/div/div[2]/span");
	By contractOwnerInfo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div[4]/div/article/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/span/div/div/div/a");
	By cpaDocusignEmailInfo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div[4]/div/article/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div[2]/span/a");
	
	public ContractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newContractButton() {
		return driver.findElement(newContractButton);
	}
	public WebElement newContractTitle() {
		return driver.findElement(newContractTitle);
	}
	public WebElement contractName() {
		return driver.findElement(contractName);
	}
	public WebElement approvalStatus() {
		return driver.findElement(approvalStatus);
	}
	public List<WebElement> approvalStatusList() {
		return driver.findElements(approvalStatusList);
	}
	public WebElement contractType() {
		return driver.findElement(contractType);
	}
	public List<WebElement> contractTypeList() {
		return driver.findElements(contractTypeList);
	}
	public WebElement accountName() {
		return driver.findElement(accountName);
	}
	public List<WebElement> accountNameList() {
		return driver.findElements(accountNameList);
	}
	public WebElement cpaRegion() {
		return driver.findElement(cpaRegion);
	}
	public List<WebElement> cpaRegionList() {
		return driver.findElements(cpaRegionList);
	}
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	public WebElement label() {
		return driver.findElement(label);
	}
	public WebElement contractLineItems() {
		return driver.findElement(contractLineItems);
	}
	public List<WebElement> contractNameList() {
		return driver.findElements(contractNameList);
	}
	public WebElement billingContactDropdown() {
		return driver.findElement(billingContactDropdown);
	}
	public WebElement billingContactEdit() {
		return driver.findElement(billingContactEdit);
	}
	public WebElement billingContact() {
		return driver.findElement(billingContact);
	}
	public List<WebElement> contactList() {
		return driver.findElements(contactList);
	}
	public WebElement billingContactInfo() {
		return driver.findElement(billingContactInfo);
	}
	public WebElement billingAddressInfo() {
		return driver.findElement(billingAddressInfo);
	}
	public WebElement billingEmailInfo() {
		return driver.findElement(billingEmailInfo);
	}
	public WebElement contractOwnerInfo() {
		return driver.findElement(contractOwnerInfo);
	}
	public WebElement cpaDocusignEmailInfo() {
		return driver.findElement(cpaDocusignEmailInfo);
	}
}
