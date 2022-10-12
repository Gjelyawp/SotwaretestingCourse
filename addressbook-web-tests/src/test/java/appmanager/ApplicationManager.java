package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

	private NavigationHelper navigationHelper;
	private GroupHelper groupHelper;
	private SessionHelper sessionHelper;
	private WebDriver wd;
	public void init() {
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);
		wd.get("http://localhost/addressbook/");
		sessionHelper.login("admin", "secret");
	}


	public void logout() {
		wd.findElement(By.linkText("Logout")).click();
	}

	public void stop() {
		wd.quit();
	}

	public GroupHelper getGroupHelper() {
		return groupHelper;
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}
}
