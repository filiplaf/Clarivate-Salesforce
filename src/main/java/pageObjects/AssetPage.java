package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssetPage {
	
	public WebDriver driver;
	By forAutomationAccountID = By.cssSelector("div#brandBand_2 div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > article > div.test-id__record-layout-container.riseTransitionEnabled > div > div:nth-child(4) > div > div > div:nth-child(9) > div:nth-child(1) > div > div.slds-form-element__control.slds-grid.itemBody");
	By editAssetButton = By.cssSelector("div#brandBand_2 div.slds-col.slds-no-flex.slds-grid.slds-grid_vertical-align-center.actionsContainer > ul > li:nth-child(1) > a > div");
	By editAccountOnAsset = By.cssSelector("div.test-id__record-layout-container.riseTransitionEnabled > div > div:nth-child(1) > div > div > div:nth-child(4) > div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.pageBlockItemEditWithTooltip.full.forcePageBlockItem.forcePageBlockItemEdit > div > div > div > div > div > div.pillContainerWrapper.singlePill.noSeparator > div > ul > li:nth-child(1) > a > a > span.deleteIcon");
	By accountNameOnAsset = By.cssSelector("div.test-id__record-layout-container.riseTransitionEnabled > div > div:nth-child(1) > div > div > div:nth-child(4) > div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.pageBlockItemEditWithTooltip.full.forcePageBlockItem.forcePageBlockItemEdit > div > div > div > div > div > div.inputWrapper.slds-grid.slds-grid_vertical-align-center.slds-p-right_x-small > div > input");
	By newAccountName = By.cssSelector(".data-match");
	By saveAssetButton = By.cssSelector("div.button-container-inner.slds-float_right > button[type=\"button\"].slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton");
	
	public AssetPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement forAutomationAccountID() {
		return driver.findElement(forAutomationAccountID);
	}
	public WebElement editAssetButton() {
		return driver.findElement(editAssetButton);
	}
	public WebElement editAccountOnAsset() {
		return driver.findElement(editAccountOnAsset);
	}
	public WebElement accountNameOnAsset() {
		return driver.findElement(accountNameOnAsset);
	}
	public WebElement newAccountName() {
		return driver.findElement(newAccountName);
	}
	public WebElement saveAssetButton() {
		return driver.findElement(saveAssetButton);
	}
}
