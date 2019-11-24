package testTaskWesternacher.base;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {

	private static ChromeDriverService service;
	public static WebDriver driver;
	public static WebDriverWait waitForElement;

	@BeforeClass
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder().usingDriverExecutable(new File(".//chromedriver.exe"))
				.usingAnyFreePort().build();
		service.start();
	}

	@AfterClass
	public static void stopService() {
		service.stop();
	}

	@Before
	public void createDriver() {
		driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
		driver.get("https://test.easyleave.de/login");
		driver.manage().window().maximize();
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
}
