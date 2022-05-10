package resources;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	
	public WebDriver initializeDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",chrome());
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String chrome() {
		String filename ="drivers/chromedriver.exe";
		File file = new File(filename);
		String path = file.getAbsolutePath();
		return path;
	} 	
	
	public static void waitForElementToAppear(WebDriver driver,  WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver, 50, 50);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static boolean waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element) {	
		try { Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
			return true;
	}
		catch (Exception e) {
			return false;
		}
	}
	
	public static void wait_time(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		}
	}
	
	//Click on element if is not visible on page but exist in DOM
	public static void jsClick(WebElement element, WebDriver driver) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	public void captureElement(String name, WebElement element) throws Exception{
		Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, element);
		ImageIO.write(screenshot.getImage(), "PNG", new File("screenshots/" + name+".png"));
	}
	
}
 