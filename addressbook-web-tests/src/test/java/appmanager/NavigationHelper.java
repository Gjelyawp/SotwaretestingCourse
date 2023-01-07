package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

	public NavigationHelper(WebDriver wd) {
		super(wd);
	}

	public void gotoGroupPage() {
		if ( isElementPresent(By.tagName("h1"))
				&& wd.findElement(By.tagName("h1")).getText().equals("Groups")
				&& isElementPresent(By.name("New"))) {
			return;
		} else {
			click(By.linkText("groups"));
		}
	}

	public void returnToMainPage() {
		if (isElementPresent(By.id("maintable"))){
			return;
		} else {
			wd.findElement(By.linkText("home page")).click();
		}
	}
}
