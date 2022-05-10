package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtRiskRegisterPage {
	
	public WebDriver driver;
	By arrName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-base-input/lightning-input/div[1]/input");
	By productTypeList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By productType = By.cssSelector("span.slds-media__body>span");
	By revenueAtRisk = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/records-record-layout-base-input/lightning-input/div[1]/input");
	By sourceOfRisk = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[6]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By likehood = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[3]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By issueDescription = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[3]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div[1]/textarea");
	By primaryIssue = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[4]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By requiredResolution = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[5]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div[1]/textarea");
	By progressStage = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By actionPlan = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div[1]/textarea");
	By actionLog = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item/div/span/slot/records-record-layout-text-area/lightning-textarea/div[1]/textarea");
	By saveButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button");
	By securityLevel = By.xpath("//*[contains (text(),'Very High')]");
	By primaryIssueList = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_atriskregister__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[4]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	
	public AtRiskRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement arrName() {
		return driver.findElement(arrName);
	}
	public WebElement productTypeList() {
		return driver.findElement(productTypeList);
	}
	public List<WebElement> productType() {
		return driver.findElements(productType);
	}
	public WebElement revenueAtRisk() {
		return driver.findElement(revenueAtRisk);
	}
	public WebElement sourceOfRisk() {
		return driver.findElement(sourceOfRisk);
	}
	public WebElement likehood() {
		return driver.findElement(likehood);
	}
	public WebElement issueDescription() {
		return driver.findElement(issueDescription);
	}
	public WebElement primaryIssue() {
		return driver.findElement(primaryIssue);
	}
	public List<WebElement> primaryIssueList() {
		return driver.findElements(primaryIssueList);
	}
	public WebElement requiredResolution() {
		return driver.findElement(requiredResolution);
	}
	public WebElement progressStage() {
		return driver.findElement(progressStage);
	}
	public WebElement actionPlan() {
		return driver.findElement(actionPlan);
	}
	public WebElement actionLog() {
		return driver.findElement(actionLog);
	}
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	public WebElement securityLevel() {
		return driver.findElement(securityLevel);
	}
	
}
