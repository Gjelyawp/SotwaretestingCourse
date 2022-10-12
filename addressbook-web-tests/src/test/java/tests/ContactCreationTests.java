package tests;

import model.ContactData;
import org.testng.annotations.*;


public class ContactCreationTests extends TestBase {
	@Test
	public void testContactCreation() throws Exception {
			app.getContactHelper().initContactCreation();
			app.getContactHelper().fillContactForm(new ContactData("FirstNameTest", "LastNameTest", "+79998885544", "testadress", "testmail@mail.com"));
			app.getContactHelper().submitContactCreation();
			app.getNavigationHelper().returnToMainPage();
			app.logout();
		}

}

