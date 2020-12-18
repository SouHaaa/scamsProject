package com.scams.modeles;

import java.util.Arrays;

public class Result {

	private String reference;
	private boolean scam;
	private String[] rules;

	public Result() {
		super();
	}

	public Result(String reference, boolean scam, String[] rules) {
		super();
		this.reference = reference;
		this.scam = scam;
		this.rules = rules;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public boolean getScam() {
		return scam;
	}

	public void setScam(boolean scam) {
		this.scam = scam;
	}

	public String[] getRules() {
		return rules;
	}

	public void setRules(String[] rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		return "Result [reference=" + reference + ", scam=" + scam + ", rules=" + Arrays.toString(rules) + "]";
	}
	
	

}
