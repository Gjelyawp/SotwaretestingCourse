package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
	protected WebDriver wd;

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
}
