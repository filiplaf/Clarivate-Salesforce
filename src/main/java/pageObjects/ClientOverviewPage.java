package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientOverviewPage {
	
	public WebDriver driver;
	By clientOverviewName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_clientoverview__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-base-input/lightning-input/div[1]/input");
	By ytdRank = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_cpa_clientoverview__c___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[2]/div/span/slot/lightning-input/div/input");
	By saveButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-related-list-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button");
	
	public ClientOverviewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement clientOverviewName() {
		return driver.findElement(clientOverviewName);
	}
	public WebElement ytdRank() {
		return driver.findElement(ytdRank);
	}
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	
}
