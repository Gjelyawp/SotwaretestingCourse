package tests;

import model.ContactData;
import org.testng.annotations.*;


public class ContactCreationTests extends TestBase {
	@Test
	public void testContactCreation() throws Exception {
			app.getContactHelper().initContactCreation();
			app.getContactHelper().fillContactForm(new ContactData("FirstNameTest2", "LastNameTest2", "+79998885544", "testadress2", "testmail@mail.com"));
			app.getContactHelper().submitContactCreation();
			app.getNavigationHelper().returnToMainPage();
			app.logout();
		}

}

