package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	By salesTitle = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/span/span");
	By accountPage = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]");
	By contactPage = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[4]");
	By contractPage = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement salesTitle() {
		return driver.findElement(salesTitle);
	}
	public WebElement accountPage() {
		return driver.findElement(accountPage);
	}
	public WebElement contactPage() {
		return driver.findElement(contactPage);
	}
	public WebElement contractPage() {
		return driver.findElement(contractPage);
	}
	
}
