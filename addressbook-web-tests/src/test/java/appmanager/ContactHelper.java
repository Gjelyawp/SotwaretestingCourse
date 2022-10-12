package appmanager;

import model.ContactData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase {
	protected WebDriver wd;
	public boolean acceptNextAlert = true;

	public ContactHelper(WebDriver wd) {
		super(wd);
	}
	public void submitContactCreation() {
		click(By.xpath("//div[@id='content']/form/input[21]"));
	}

	public void fillContactForm(ContactData contactData) {
		type(By.name("firstname"),contactData.getFirstname());
		type(By.name("lastname"),contactData.getLastname());
		type(By.name("mobile"),contactData.getMobPhone());
		type(By.name("address"),contactData.getAdress());
		type(By.name("email"),contactData.getEmail());
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void selectFirstContact() {
		click(By.id("1"));
	}

	public void deleteSelectedContact() {
	click(By.xpath("//input[@value='Delete']"));
	}


	private String closeAlertAndGetItsText() {
		try {
			Alert alert = wd.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
	public void submitContactDeletion()  {
		assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
	}


	public void EditFirstContact() {
		click(By.xpath("//img[@alt='Edit']"));
	}

	public void confirmModificationContact() {
		click(By.name("update"));
	}
}
