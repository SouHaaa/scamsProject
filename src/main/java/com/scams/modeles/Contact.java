package com.scams.modeles;

public class Contact {
	private String firstname;
	private String lastname;
	private String email;
	private Phone phone1;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone1() {
		return phone1;
	}

	public void setPhone1(Phone phone1) {
		this.phone1 = phone1;
	}

	public Contact(String firstname, String lastname, String email, Phone phone1) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone1 = phone1;
	}

	public Contact() {
	}

	@Override
	public String toString() {
		return " { \n firstname=" + firstname + ", \n lastname=" + lastname + ", \n email=" + email + ", \n phone1=" + phone1
				+ "\n }";
	}

}
