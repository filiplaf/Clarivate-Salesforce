package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
	public WebDriver driver;
	By newContactButton = By.cssSelector("div#brandBand_1 li:nth-child(1) > a");
	By newContactTitle = By.xpath("//records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/div/h2");
	By salutation = By.xpath("//div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-input-name/lightning-input-name/fieldset/div/div/div[1]/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]"); 
	By salutationList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-input-name/lightning-input-name/fieldset/div/div/div[1]/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span");
	By firstName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-input-name/lightning-input-name/fieldset/div/div/div[2]/lightning-input/div/input");
	By lastName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-input-name/lightning-input-name/fieldset/div/div/div[4]/lightning-input/div[1]/input");
	By email = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[1]/div/span/slot/lightning-input/div[1]/input");
	By contactStatus = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By contactStatusList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span");
	By accountName = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-lookup/lightning-lookup/lightning-lookup-desktop/lightning-grouped-combobox/div[1]/div/lightning-base-combobox/div/div[1]/input");
	By accountNameList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-lookup/lightning-lookup/lightning-lookup-desktop/lightning-grouped-combobox/div[1]/div/lightning-base-combobox/div/div[2]/ul/li");
	By jobTitle = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[1]/button");
	By jobTitleList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div[1]/lightning-base-combobox/div/div[2]/lightning-base-combobox-item");
	By firstProductInterest = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]");
	By firstProductInterestList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[4]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item");
	By saveButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-form-footer/div/div/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot[1]/slot/lightning-button/button");
	By label = By.cssSelector("div.forceToastManager--default.forceToastManager.navexDesktopLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div > div > div > div > div > span");
	By contactLifeCycleStatus = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[2]/div/div/div[2]/span/slot[1]/lightning-formatted-text");
	By rejectOrReturnToMarketing = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2[1]/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_contact___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button");
	By rejectOrRecycledReason = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/section/div/section/div/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/a");
	By rejectOrRecycledReasonList = By.xpath("/html/body/div[11]/div/ul/li/a");
	By saveReasonButton = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/footer/button[2]");
	By editContactButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2[1]/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_contact___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[1]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-page-reference/slot/slot/lightning-button/button");
	By contactLifecycleStatus = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	By contactLifecycleStatusList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	By mqcTask = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/flexipage-component2[3]/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/flexipage-aura-wrapper/div/div/div[2]/div[1]/div[4]/div/div/div/ul/li/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/a");
	By mqcTime = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/flexipage-component2[3]/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/flexipage-aura-wrapper/div/div/div[2]/div[1]/div[4]/div/div/div/ul/li/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]");
	By lastProductInterest = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[5]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	By lastProductInterestList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[5]/slot/records-record-layout-item[2]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	By cpiTask = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/flexipage-component2[3]/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/flexipage-aura-wrapper/div/div/div[2]/div[1]/div[4]/div/div/div[1]/ul/li[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/a");
	By cpiTime = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/flexipage-component2[3]/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/flexipage-aura-wrapper/div/div/div[2]/div[1]/div[4]/div/div/div[1]/ul/li[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]");
	By legimateDuplicateCheckbox = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[7]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-checkbox/lightning-input/div/span/input");
	By doNotSyncToMarketo = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[7]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/div/div[1]/span");
	By doNotSyncToMarketoCheckbox = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[7]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/div/div[2]/span/slot[1]/lightning-input/div/span/label/span[1]");
	By marketingConsentType = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	By marketingConsentTypeList = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___edit___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[2]/lightning-base-combobox-item/span/span");
	By marketingConsentDateStamp = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[6]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[2]/div/div/div[2]/span/slot[1]/lightning-formatted-text");
	By genderField = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-c-p-a_-lead-remediation-project-contacts___-contact___-v-i-e-w/forcegenerated-flexipage_cpa_leadremediationprojectcontacts_contact__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_contact___012000000000000aaa___full___view___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item[2]/div/div/div[2]/span/slot[1]/lightning-formatted-text");
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement newAccountButton() {
		return driver.findElement(newContactButton);
	}
	public WebElement newContactTitle() {
		return driver.findElement(newContactTitle);
	}
	public WebElement salutation() {
		return driver.findElement(salutation);
	}
	public List<WebElement> salutationList() {
		return driver.findElements(salutationList);
	}
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement contactStatus() {
		return driver.findElement(contactStatus);
	}
	public List<WebElement> contactStatusList() {
		return driver.findElements(contactStatusList);
	}
	public WebElement accountName() {
		return driver.findElement(accountName);
	}
	public List<WebElement> accountNameList() {
		return driver.findElements(accountNameList);
	}
	public WebElement jobTitle() {
		return driver.findElement(jobTitle);
	}
	public List<WebElement> jobTitleList() {
		return driver.findElements(jobTitleList);
	}
	public WebElement firstProductInterest() {
		return driver.findElement(firstProductInterest);
	}
	public List<WebElement> firstProductInterestList() {
		return driver.findElements(firstProductInterestList);
	}
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	public WebElement label() {
		return driver.findElement(label);
	}
	public WebElement contactLifeCycleStatus() {
		return driver.findElement(contactLifeCycleStatus);
	}
	public WebElement rejectOrReturnToMarketing() {
		return driver.findElement(rejectOrReturnToMarketing);
	}
	public WebElement rejectOrRecycledReason() {
		return driver.findElement(rejectOrRecycledReason);
	}
	public List<WebElement> rejectOrRecycledReasonList() {
		return driver.findElements(rejectOrRecycledReasonList);
	}
	public WebElement saveReasonButton() {
		return driver.findElement(saveReasonButton);
	}
	public WebElement editContactButton() {
		return driver.findElement(editContactButton);
	}
	public WebElement contactLifecycleStatus() {
		return driver.findElement(contactLifecycleStatus);
	}
	public List<WebElement> contactLifecycleStatusList() {
		return driver.findElements(contactLifecycleStatusList);
	}
	public WebElement mqcTask() {
		return driver.findElement(mqcTask);
	}
	public WebElement mqcTime() {
		return driver.findElement(mqcTime);
	}
	public WebElement lastProductInterest() {
		return driver.findElement(lastProductInterest);
	}
	public List<WebElement> lastProductInterestList() {
		return driver.findElements(lastProductInterestList);
	}
	public WebElement cpiTask() {
		return driver.findElement(cpiTask);
	}
	public WebElement cpiTime() {
		return driver.findElement(cpiTime);
	}
	public WebElement legimateDuplicateCheckbox() {
		return driver.findElement(legimateDuplicateCheckbox);
	}
	public WebElement doNotSyncToMarketo() {
		return driver.findElement(doNotSyncToMarketo);
	}
	public WebElement doNotSyncToMarketoCheckbox() {
		return driver.findElement(doNotSyncToMarketoCheckbox);
	}
	public WebElement marketingConsentType() {
		return driver.findElement(marketingConsentType);
	}
	public List<WebElement> marketingConsentTypeList() {
		return driver.findElements(marketingConsentTypeList);
	}
	public WebElement marketingConsentDateStamp() {
		return driver.findElement(marketingConsentDateStamp);
	}
	public WebElement genderField() {
		return driver.findElement(genderField);
	}
}
