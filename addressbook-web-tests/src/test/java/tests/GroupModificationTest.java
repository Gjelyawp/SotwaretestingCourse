package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{

	@Test
	public void testGroupModification()	{
		app.getNavigationHelper().gotoGroupPage();
		app.getGroupHelper().selectGroup();
		if (! app.getGroupHelper().isThereGroup()) {
			app.getGroupHelper().createGroup (new GroupData("test11", "test22", "test33"));
		}
		app.getGroupHelper().initGroupModification();
		app.getGroupHelper().fillGroupForm(new GroupData("test2","test22","test222"));
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupPage();
	}
}
