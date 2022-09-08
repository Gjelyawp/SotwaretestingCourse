package address.book;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GroupCreationTests {
	private WebDriver wd;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login("admin", "secret");
	}

	private void login(String username, String password) {
		wd.get("http://localhost/addressbook/");
		wd.findElement(By.name("user")).sendKeys(username);
		wd.findElement(By.name("pass")).sendKeys(password);
		wd.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Test
	public void testGroupCreation() throws Exception {
		gotoGroupPage();
		initGroupCreation();
		fillGroupForm(new GroupData("test11", "test22", "test33"));
		submitGroupCreation();
		returnToGroupPage();
		logout();
	}

	@Test
	public void testContactCreation() throws Exception {
		initContactCreation();
		fillContactForm(new ContactData("FirstNameTest", "LastNameTest", "+79998885544", "testadress", "testmail@mail.com"));
		submitContactCreation();
		returnToMainPage();
		logout();
	}

	private void returnToMainPage() {
		wd.findElement(By.linkText("home page")).click();
	}

	private void submitContactCreation() {
		wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
	}

	private void fillContactForm(ContactData contactData) {
		wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
		wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
		wd.findElement(By.name("mobile")).sendKeys(contactData.getMobPhone());
		wd.findElement(By.name("address")).sendKeys(contactData.getAdress());
		wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
	}

	private void initContactCreation() {
		wd.findElement(By.linkText("add new")).click();
	}

	private void logout() {
		wd.findElement(By.linkText("Logout")).click();
	}

	private void returnToGroupPage() {
		wd.findElement(By.linkText("group page")).click();
	}

	private void submitGroupCreation() {
		wd.findElement(By.name("submit")).click();
	}

	private void fillGroupForm(GroupData groupData) {
		wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
		wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
		wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
	}

	private void initGroupCreation() {
		wd.findElement(By.name("new")).click();
	}

	private void gotoGroupPage() {
		wd.findElement(By.linkText("groups")).click();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		wd.quit();
	}


	private boolean isElementPresent(By by) {
		try {
			wd.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			wd.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}


}

