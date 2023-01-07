package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
	@Test
	public void testContactDeletion() {
		if (! app.getContactHelper().isContactCreated()){
			app.getContactHelper().createContact (new ContactData("gg1","gg2","89995555566","dudka 3a","fwefwe@gmail.com",null));
		}
		app.getContactHelper().selectFirstContact();
		app.getContactHelper().deleteSelectedContact();
		app.getContactHelper().submitContactDeletion();
		app.getNavigationHelper().returnToMainPage();
	}
}
