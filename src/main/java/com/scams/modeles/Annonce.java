package com.scams.modeles;

import java.util.Arrays;
import java.util.Date;

public class Annonce {

	private Contact contact;
	private Date creationDate;
	private int price;
	private String[] publicationOptions;
	private String reference;
	private Vehicule vehicule;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getPublicationOptions() {
		return publicationOptions;
	}

	public void setPublicationOptions(String[] publicationOptions) {
		this.publicationOptions = publicationOptions;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Annonce() {
	}



	public Annonce(Contact contact, Date creationDate, int price, String[] publicationOptions, String reference,
			Vehicule vehicule) {
		this.contact = contact;
		this.creationDate = creationDate;
		this.price = price;
		this.publicationOptions = publicationOptions;
		this.reference = reference;
		this.vehicule = vehicule;
	}

	@Override
	public String toString() {
		return " {\n contact=" + contact + ", \n creationDate=" + creationDate + ", \n price=" + price
				+ ", \n publicationOptions=" + Arrays.toString(publicationOptions) + ", \n reference=" + reference
				+ ", \n vehicule=" + vehicule + "\n }";
	}



}
