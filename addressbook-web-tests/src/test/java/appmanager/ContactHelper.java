package appmanager;

import model.ContactData;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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

	public void fillContactFormWithCheckGroup(ContactData contactData, boolean creation) {
		type(By.name("firstname"), contactData.getFirstname());
		type(By.name("lastname"), contactData.getLastname());
		type(By.name("mobile"), contactData.getMobPhone());
		type(By.name("address"), contactData.getAdress());
		type(By.name("email"), contactData.getEmail());
		if (creation){
			new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
		} else {
			Assert.assertFalse(isElementPresent(By.name("new_group")));
		}

	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void selectFirstContact() {
		click(By.xpath("//input[@type='checkbox']"));
	}

	public void selectAllContacts() {
		click(By.xpath("//input[@type='checkbox'and @id='MassCB']"));
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

	public void submitContactDeletion() {
		assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
	}


	public void EditFirstContact() {
		click(By.xpath("//img[@alt='Edit']"));
	}

	public void confirmModificationContact() {
		click(By.name("update"));
	}

	private void returnToMainPage() {
		click(By.linkText("home page"));

	}
	public void fillContactForm(ContactData contactData) {
		type(By.name("firstname"), contactData.getFirstname());
		type(By.name("lastname"), contactData.getLastname());
		type(By.name("mobile"), contactData.getMobPhone());
		type(By.name("address"), contactData.getAdress());
		type(By.name("email"), contactData.getEmail());
	}

	public void createContact(ContactData contactDat) {
		initContactCreation();
		fillContactForm(contactDat);
		submitContactCreation();
		returnToMainPage();

	}


	public boolean isContactCreated() {
		return isElementPresent(By.name("selected[]"));
	}
}
