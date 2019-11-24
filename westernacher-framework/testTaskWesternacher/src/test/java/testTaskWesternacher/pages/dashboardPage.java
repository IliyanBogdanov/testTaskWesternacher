package testTaskWesternacher.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testTaskWesternacher.base.baseClass;

public class dashboardPage {

	@FindBy(xpath = "//*[text()=' Previous ']")
	private WebElement previousButton;
	@FindBy(xpath = "//*[text()=' Today ']")
	private WebElement todayButton;
	@FindBy(xpath = "//*[text()=' Next ']")
	private WebElement nextButton;
	@FindBy(className = "mat-checkbox-label")
	private WebElement showArchivedCheckbox;
	@FindBy(xpath = "//*[text()=' Month ']")
	private WebElement monthButton;
	@FindBy(xpath = "//*[text()=' Week ']")
	private WebElement weekButton;
	@FindBy(id = "accountMenu")
	private WebElement accountDropdown;
	@FindBy(linkText = "Logout")
	private WebElement logoutButton;
	@FindBy(id = "loginAlert")
	private WebElement logoutMessage;

	WebDriverWait myWaitVar = new WebDriverWait(baseClass.driver, 10);

	public void verifyButtonsAreFunctional() throws Exception {

		myWaitVar.until(ExpectedConditions.elementToBeClickable(previousButton));
		previousButton.click();
		todayButton.click();
		nextButton.click();
		showArchivedCheckbox.click();
		weekButton.click();
		accountDropdown.click();

	}

	public void logout() throws Exception {

		logoutButton.click();

	}

	public void verifyThatUserHasBeenLoggedOut() throws Exception {

		myWaitVar.until(ExpectedConditions.visibilityOf(logoutMessage));
		String logoutMessage = baseClass.driver.findElement(By.id("loginAlert")).getText();
		Assert.assertEquals("You have logged out successfully.", logoutMessage);

	}

}
