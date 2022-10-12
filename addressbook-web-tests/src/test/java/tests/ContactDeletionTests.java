package tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
	@Test
	public void testContactDeletion() {
		app.getContactHelper().selectFirstContact();
		app.getContactHelper().deleteSelectedContact();
		app.getContactHelper().submitContactDeletion();
		app.getNavigationHelper().returnToMainPage();
	}
}
