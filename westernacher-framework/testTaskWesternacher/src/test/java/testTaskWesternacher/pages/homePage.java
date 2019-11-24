package testTaskWesternacher.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

	@FindBy(id = "emailAddress")
	private WebElement emailAddressInput;

	@FindBy(id = "mat-input-1")
	private WebElement passwordInput;

	@FindBy(id = "logButton")
	private WebElement loginButton;

	public void userlogin() throws Exception {

		emailAddressInput.sendKeys("Iliyan.Bogdanov@westernacher.com");
		passwordInput.sendKeys("123456");
		loginButton.click();

	}
}
