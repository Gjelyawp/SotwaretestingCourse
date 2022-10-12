package tests;

import model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

	@Test
	public void testGroupCreation(){
		app.getNavigationHelper().gotoGroupPage();
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(new GroupData("test11", "test22", "test33"));
		app.getGroupHelper().submitGroupCreation();
		app.getGroupHelper().returnToGroupPage();
		app.logout();
	}

}

