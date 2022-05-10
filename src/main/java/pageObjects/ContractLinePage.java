package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractLinePage {
	
	public WebDriver driver;
	By newLineItems = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div[1]/div[1]/div[2]");
	By newContractLineItemsTitle = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[1]/div[1]/h2");
	By searchProduct = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div/label/div/div/div[1]/div/input");
	By selectProduct = By.cssSelector("th > div > label");
	By nextButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]");
	By quanity = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[3]/span/span[2]");
	By quanityField = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div/div[1]/div/div/div/input");
	By saveButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[3]");
	By label = By.cssSelector("div.forceToastManager--default.forceToastManager.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div > div > div > div > div > span");
	By contractLineItem = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a");
	By typeOfStartPayDateField = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div/article/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/span/span");
	By product = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div/article/div[2]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/span/div/a");
	By editProductButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[5]/div/div[1]/div/div[1]/div/header/div[2]/div/div[2]/ul/li[1]");
	By editProductTitle = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/h2");
	By productName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[2]/div[1]/div/div/div/input");
	By saveEditButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/button[3]");
	
	public ContractLinePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newLineItems() {
		return driver.findElement(newLineItems);
	}
	public WebElement newContractLineItemsTitle() {
		return driver.findElement(newContractLineItemsTitle);
	}
	public WebElement searchProduct() {
		return driver.findElement(searchProduct);
	}
	public WebElement selectProduct() {
		return driver.findElement(selectProduct);
	}
	public WebElement nextButton() {
		return driver.findElement(nextButton);
	}
	public WebElement quanity() {
		return driver.findElement(quanity);
	}
	public WebElement quanityField() {
		return driver.findElement(quanityField);
	}
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	public WebElement label() {
		return driver.findElement(label);
	}
	public WebElement contractLineItem() {
		return driver.findElement(contractLineItem);
	}
	public WebElement typeOfStartPayDateField() {
		return driver.findElement(typeOfStartPayDateField);
	}
	public WebElement product() {
		return driver.findElement(product);
	}
	public WebElement editProductButton() {
		return driver.findElement(editProductButton);
	}
	public WebElement editProductTitle() {
		return driver.findElement(editProductTitle);
	}
	public WebElement productName() {
		return driver.findElement(productName);
	}
	public WebElement saveEditButton() {
		return driver.findElement(saveEditButton);
	}
}
