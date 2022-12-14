package model;

public class ContactData {
	private final String firstname;
	private final String lastname;
	private final String mobPhone;
	private final String adress;
	private final String email;
	private String group;

	public ContactData(String firstname, String lastname, String mobPhone, String adress, String email,String group) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobPhone = mobPhone;
		this.adress = adress;
		this.email = email;
		this.group = group;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobPhone() {
		return mobPhone;
	}

	public String getAdress() {
		return adress;
	}

	public String getEmail() {
		return email;
	}

	public String getGroup() {
		return group;
	}
}
