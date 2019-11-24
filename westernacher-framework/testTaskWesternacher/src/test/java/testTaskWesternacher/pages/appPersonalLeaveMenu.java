package testTaskWesternacher.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testTaskWesternacher.base.baseClass;

public class appPersonalLeaveMenu {

	@FindBy(css = "body > app-root > app-home > div > app-leaves > button")
	private WebElement addButton;
	@FindBy(css = "#mat-dialog-0 > ng-component > mat-dialog-actions > button.btn.btn-primary.ng-star-inserted")
	private WebElement addButtonMenu;
	@FindBy(css = "body > app-root > app-home > div > div > div > div")
	private WebElement notificationBarSuccess;
	@FindBy(xpath = "//*[text()='Request']")
	private WebElement requestButton;
	@FindBy(xpath = "//*[text()='Delete']")
	private WebElement deleteButton;
	@FindBy(xpath = "//*[text()='Yes']")
	private WebElement yesButton;

	WebDriverWait myWaitVar = new WebDriverWait(baseClass.driver, 10);

	public void createNewEntry() throws Exception {

		myWaitVar.until(ExpectedConditions.elementToBeClickable(addButton));
		addButton.click();
		myWaitVar.until(ExpectedConditions.elementToBeClickable(addButtonMenu));
		addButtonMenu.sendKeys(Keys.SPACE);

	}

	public void verifyThatNewEntryCreated() {

		myWaitVar.until(ExpectedConditions.visibilityOf(notificationBarSuccess));
	}

	public void requestPersonalLeave() throws Exception {

		myWaitVar.until(ExpectedConditions.elementToBeClickable(requestButton));
		requestButton.click();

	}

	public void verifyThatNewEntryRequested() {

		myWaitVar.until(ExpectedConditions.visibilityOf(notificationBarSuccess));
	}

	public void deletePersonalLeave() throws Exception {

		myWaitVar.until(ExpectedConditions.elementToBeClickable(deleteButton));
		deleteButton.click();
		myWaitVar.until(ExpectedConditions.elementToBeClickable(yesButton));
		yesButton.click();

	}

	public void verifyThatNewEntryDeleted() {

		myWaitVar.until(ExpectedConditions.visibilityOf(notificationBarSuccess));
	}

}
