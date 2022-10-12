package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	@Test
	public void testContactModification() {
	app.getContactHelper().selectFirstContact();
	app.getContactHelper().EditFirstContact();
	app.getContactHelper().fillContactForm(new ContactData("gg1","gg2","89995555566","dudka 3a","fwefwe@gmail.com"));
	app.getContactHelper().confirmModificationContact();
	app.getNavigationHelper().returnToMainPage();
	}


}
