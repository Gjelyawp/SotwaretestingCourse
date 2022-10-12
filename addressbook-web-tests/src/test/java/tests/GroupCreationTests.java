package tests;

import model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

	@Test
	public void testGroupCreation(){
		app.gotoGroupPage();
		app.initGroupCreation();
		app.fillGroupForm(new GroupData("test11", "test22", "test33"));
		app.submitGroupCreation();
		app.returnToGroupPage();
		app.logout();
	}

}

