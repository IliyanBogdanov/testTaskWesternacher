package testTaskWesternacher.pages;

import org.openqa.selenium.support.PageFactory;
import testTaskWesternacher.base.baseClass;
import testTaskWesternacher.pages.homePage;

public class pages {

	public static homePage homePage() {
		homePage homePage = new homePage();
		PageFactory.initElements(baseClass.driver, homePage);
		return homePage;
	}

	public static dashboardPage dashboardPage() {
		dashboardPage dashboardPage = new dashboardPage();
		PageFactory.initElements(baseClass.driver, dashboardPage);
		return dashboardPage;
	}

	public static appPersonalLeaveMenu appPersonalLeaveMenu() {
		appPersonalLeaveMenu appPersonalLeaveMenu = new appPersonalLeaveMenu();
		PageFactory.initElements(baseClass.driver, appPersonalLeaveMenu);
		return appPersonalLeaveMenu;
	}
}
