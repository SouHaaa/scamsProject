package com.scams.modeles;

public class Phone {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Phone() {

	}

	public Phone(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return " { \n value=" + value + "\n }";
	}

}
