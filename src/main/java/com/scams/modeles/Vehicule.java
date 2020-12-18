package com.scams.modeles;

public class Vehicule {
	private String make;
	private String model;
	private String version;
	private String category;
	private String registerNumber;
	private int mileage;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Vehicule() {
	}

	public Vehicule(String make, String model, String version, String category, String registerNumber, int mileage) {
		this.make = make;
		this.model = model;
		this.version = version;
		this.category = category;
		this.registerNumber = registerNumber;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "  { \n make=" + make + ", \n model=" + model + ", \n version=" + version + ", \n category=" + category
				+ ", \n registerNumber=" + registerNumber + ", \n mileage=" + mileage + "\n }";
	}

}
