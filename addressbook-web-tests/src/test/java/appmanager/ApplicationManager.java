package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	public WebDriver wd;
	private ContactHelper contactHelper;
	private NavigationHelper navigationHelper;
	private GroupHelper groupHelper;
	private SessionHelper sessionHelper;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {
		if (Objects.equals(browser, BrowserType.FIREFOX)) {
			wd = new FirefoxDriver();
		} else if (Objects.equals(browser, BrowserType.CHROME)) {
			wd = new ChromeDriver();
		} else if (Objects.equals(browser, BrowserType.IE)) {
			wd = new InternetExplorerDriver();
		}
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);
		contactHelper = new ContactHelper(wd);
		wd.get("http://localhost/addressbook");
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


	public ContactHelper getContactHelper() {
		return contactHelper;
	}


}
