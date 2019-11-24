package testTaskWesternacher;

import org.junit.Test;
import testTaskWesternacher.base.baseClass;
import testTaskWesternacher.pages.pages;

public class LibraryTest extends baseClass {

	@Test
	public void logInEasyLeave() throws Exception {

		pages.homePage().userlogin();
		pages.dashboardPage().verifyButtonsAreFunctional();
		pages.dashboardPage().logout();
		pages.dashboardPage().verifyThatUserHasBeenLoggedOut();

	}

	@Test
	public void createPersonalLeave() throws Exception {

		pages.homePage().userlogin();
		pages.appPersonalLeaveMenu().createNewEntry();
		pages.appPersonalLeaveMenu().verifyThatNewEntryCreated();

	}

	@Test
	public void requestPersonalLeave() throws Exception {

		pages.homePage().userlogin();
		pages.appPersonalLeaveMenu().requestPersonalLeave();
		pages.appPersonalLeaveMenu().verifyThatNewEntryRequested();

	}

	@Test
	public void deletePersonalLeave() throws Exception {

		pages.homePage().userlogin();
		pages.appPersonalLeaveMenu().deletePersonalLeave();
		pages.appPersonalLeaveMenu().verifyThatNewEntryDeleted();

	}
}
