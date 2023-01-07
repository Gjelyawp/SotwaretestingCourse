package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	@Test
	public void testContactModification() {
		if (! app.getContactHelper().isContactCreated()){
			app.getContactHelper().createContact (new ContactData("gg1","gg2","89995555566","dudka 3a","fwefwe@gmail.com",null));
		}
	app.getContactHelper().selectFirstContact();
	app.getContactHelper().EditFirstContact();
	app.getContactHelper().fillContactFormWithCheckGroup(new ContactData("gg1","gg2","89995555566","564654","fwefwe@gmail.com",null),false );
	app.getContactHelper().confirmModificationContact();
	app.getNavigationHelper().returnToMainPage();
	}
}
