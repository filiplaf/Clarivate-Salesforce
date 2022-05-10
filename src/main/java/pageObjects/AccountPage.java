package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	public WebDriver driver;
	By newAccountButton = By.cssSelector("div#brandBand_1 li:nth-child(1) > a > div");
	By nextButton = By.cssSelector("div > button[type=\"button\"].slds-button.slds-button--neutral.slds-button_brand.uiButton");
	By accountname = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-input[1]/div/input");
	By countryList = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-combobox[1]/div[1]/lightning-base-combobox/div/div[1]/button");
	By country = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-combobox[1]/div[1]/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	By stateList = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-combobox[2]/div[1]/lightning-base-combobox/div/div[1]");
	By state = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-combobox[2]/div[1]/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	By streetAdress = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-input[2]/div[1]/input");
	By city = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/lightning-input[5]/div[1]/input");
	By searchButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/div/lightning-button[1]/button");
	By searchText = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[1]/slot/div[2]/div[2]/div/p");
	By createNewButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/c-c-a_-account-new/lightning-card/article/div[2]/slot/c-c-a-_-account-search/lightning-layout/slot/lightning-layout-item[2]/slot/div[6]/lightning-button/button");
	By accountStatusList = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(2) > div:nth-child(1) > div > div > div > div > div > div > div > a");
	By accountStatus = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By industryList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[4]/div[2]/div/div/div/div/div[1]/div/div/a");
	By industry = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a"); 
	By customerTypeList = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a");
	By customerType = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By cpaRegionList = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/a");
	By cpaRegion = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By regionNewList = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div/div/a");
	By regionNew = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By subRegionList = By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div/div/div/div[1]/div/div/a");
	By subRegion = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By registeredCountryList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[6]/div/div/div[1]/div[1]/div/div/fieldset/div/div[2]/div/div/div/div/div/div/a");
	By registeredCountry = By.cssSelector("div.select-options.popupTargetContainer.uiPopupTarget.uiMenuList.uiMenuList--default.uiMenuList--left.uiMenuList--short>div.select-options>ul>li>a");
	By saveAccountButton = By.cssSelector("div.button-container-inner.slds-float_right > button[type=\"button\"].slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton > span");
	By accountName = By.cssSelector("div#brandBand_1 tr>th>span>a");
	By assetOption = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_cpa_account_record_page_account__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2[2]/slot/lst-related-list-quick-links-container/article/laf-progressive-container/slot/lst-related-list-quick-links-grid/div/div/ul/li[11]/lst-related-list-quick-link/div/div/records-hoverable-link/div/a/slot/span");
	By newAssetButton = By.cssSelector("div#brandBand_2 div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-page-header--object-home.slds-page-header_joined.slds-page-header_bleed.slds-page-header.slds-shrink-none.test-headerRegion.forceListViewManagerHeader > div:nth-child(1) > div.slds-col.slds-no-flex.slds-grid.slds-align-top.slds-p-bottom--xx-small.test-lvmForceActionsContainer > ul > li > a > div");
	By nextAssetButton = By.cssSelector("button[type=\"button\"].slds-button.slds-button--neutral.slds-button_brand.uiButton > span");
	By assetName = By.cssSelector("div:nth-child(1) > div > div > div:nth-child(1) > div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.full.forcePageBlockItem.forcePageBlockItemEdit > div > div > div > input");
	By product = By.cssSelector("div:nth-child(7) > div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.full.forcePageBlockItem.forcePageBlockItemEdit > div > div > div > div > div > div.inputWrapper.slds-grid.slds-grid_vertical-align-center.slds-p-right_x-small > div > input");
	By productList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[7]/div[1]/div/div/div/div/div/div[1]/div/div/div[2]/ul/li[2]/a/div[2]");
	By saveAssetButton = By.cssSelector("div.button-container-inner.slds-float_right > button[type=\"button\"].slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton");
	By label = By.cssSelector("div.forceToastManager--default.forceToastManager.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div > div > div > div > div > span");
	By assetNameList = By.cssSelector("span.slds-grid.slds-grid--align-spread>a");
	By atRiskRegisterOption = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_cpa_account_record_page_account__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2[2]/slot/lst-related-list-quick-links-container/article/laf-progressive-container/slot/lst-related-list-quick-links-grid/div/div/ul/li[6]/lst-related-list-quick-link/div/div/records-hoverable-link/div/a"); 
	By newAtRiskRegisterButton = By.cssSelector("#brandBand_2 > div > div > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-page-header--object-home.slds-page-header_joined.slds-page-header_bleed.slds-page-header.slds-shrink-none.test-headerRegion.forceListViewManagerHeader > div:nth-child(1) > div.slds-col.slds-no-flex.slds-grid.slds-align-top.slds-p-bottom--xx-small.test-lvmForceActionsContainer > ul > li:nth-child(1)");
	By atRiskRegisterName = By.cssSelector("span.slds-grid.slds-grid--align-spread>a");
	By clientOverviewOption = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_cpa_account_record_page_account__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2[2]/slot/lst-related-list-quick-links-container/article/laf-progressive-container/slot/lst-related-list-quick-links-grid/div/div/ul/li[2]/lst-related-list-quick-link/div/div/records-hoverable-link/div/a/slot/span");
	By newClientOverviewButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[3]/div/div/div[1]/div[1]/div[2]/ul/li/a");
	By ytdRank = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-account_-record_-page___-account___-v-i-e-w/forcegenerated-flexipage_cpa_account_record_page_account__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2[2]/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_account___0124j000000gyf4qaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[4]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[1]/div/div/div[2]/span/slot[1]/lightning-formatted-number");
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newAccountButton() {
		return driver.findElement(newAccountButton);
	}
	public WebElement nextButton() {
		return driver.findElement(nextButton);
	}
	public WebElement accountname() {
		return driver.findElement(accountname);
	}
	public List<WebElement> country() {
		return driver.findElements(country);
	}
	public WebElement countryList() {
		return driver.findElement(countryList);
	}
	public List<WebElement> state() {
		return driver.findElements(state);
	}
	public WebElement stateList() {
		return driver.findElement(stateList);
	}
	public WebElement streetAdress() {
		return driver.findElement(streetAdress);
	}
	public WebElement city() {
		return driver.findElement(city);
	}
	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
	public WebElement searchText() {
		return driver.findElement(searchText);
	}
	public WebElement createNewButton() {
		return driver.findElement(createNewButton);
	}
	public WebElement accountStatusList() {
		return driver.findElement(accountStatusList);
	}
	public List<WebElement> accountStatus() {
		return driver.findElements(accountStatus);
	}
	public WebElement industryList() {
		return driver.findElement(industryList);
	}
	public List<WebElement> industry() {
		return driver.findElements(industry);
	}
	public WebElement customerTypeList() {
		return driver.findElement(customerTypeList);
	}
	public List<WebElement> customerType() {
		return driver.findElements(customerType);
	}
	public WebElement cpaRegionList() {
		return driver.findElement(cpaRegionList);
	}
	public List<WebElement> cpaRegion() {
		return driver.findElements(cpaRegion);
	}
	public WebElement regionNewList() {
		return driver.findElement(regionNewList);
	}
	public List<WebElement> regionNew() {
		return driver.findElements(regionNew);
	}
	public WebElement subRegionList() {
		return driver.findElement(subRegionList);
	}
	public List<WebElement> subRegion() {
		return driver.findElements(subRegion);
	}
	public WebElement registeredCountryList() {
		return driver.findElement(registeredCountryList);
	}
	public List<WebElement> registeredCountry() {
		return driver.findElements(registeredCountry);
	}
	public WebElement saveAccountButton() {
		return driver.findElement(saveAccountButton);
	}
	public List<WebElement> accountName() {
		return driver.findElements(accountName);
	}
	public WebElement assetOption() {
		return driver.findElement(assetOption);
	}
	public WebElement newAssetButton() {
		return driver.findElement(newAssetButton);
	}
	public WebElement nextAssetButton() {
		return driver.findElement(nextAssetButton);
	}
	public WebElement assetName() {
		return driver.findElement(assetName);
	}
	public WebElement product() {
		return driver.findElement(product);
	}
	public WebElement productList() {
		return driver.findElement(productList);
	}
	public WebElement saveAssetButton() {
		return driver.findElement(saveAssetButton);
	}
	public WebElement label() {
		return driver.findElement(label);
	}
	public List<WebElement> assetNameList() {
		return driver.findElements(assetNameList);
	}
	public WebElement atRiskRegisterOption() {
		return driver.findElement(atRiskRegisterOption);
	}
	public WebElement newAtRiskRegisterButton() {
		return driver.findElement(newAtRiskRegisterButton);
	}
	public List<WebElement> atRiskRegisterName() {
		return driver.findElements(atRiskRegisterName);
	}
	public WebElement clientOverviewOption() {
		return driver.findElement(clientOverviewOption);
	}
	public WebElement newClientOverviewButton() {
		return driver.findElement(newClientOverviewButton);
	}
	public WebElement ytdRank() {
		return driver.findElement(ytdRank);
	}
}
