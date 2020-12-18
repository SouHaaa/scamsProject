package com.scams.services;

import com.scams.modeles.Annonce;
import com.scams.modeles.Rule;
import com.scams.modeles.Vehicule;

/**
 * this class contains all rules to check wether the annouce is a scam or not
 * 
 * @author sahso
 *
 */
public class RulesAnnonceService {

	public Rule checkfirstNameRule(Annonce annonce) {
		String firstname = annonce.getContact().getFirstname();
		return new Rule("rule::firstname::length", (firstname.length() > 2));
	}

	public Rule checkLastNameRule(Annonce annonce) {
		String lastname = annonce.getContact().getLastname();
		return new Rule("rule::lastname::length", (lastname.length() > 2));
	}

	public Rule checkAlphaNumRateRule(Annonce annonce) {
		String email = annonce.getContact().getEmail();
		int pos = email.indexOf("@");
		String chaine = email.substring(0, pos);
		double nbAlphNum = countAlphabetic(chaine) + countNumeric(chaine);
		double pourcentage = nbAlphNum / chaine.length();
		return new Rule("rule:✉:alpha_rate", (pourcentage > 0.7));
	}

	public Rule checlNumberRateRule(Annonce annonce) {
		String email = annonce.getContact().getEmail();
		int pos = email.indexOf("@");
		String chaine = email.substring(0, pos);
		double nbNum = countNumeric(chaine);
		double pourcentage = nbNum / chaine.length();

		return new Rule("rule:✉:number_rate", (pourcentage < 0.3));
	}

	public Rule checkQuotationRateRule(Annonce annonce) {
		Vehicule vehicule = annonce.getVehicule();
		int price = annonce.getPrice();
		QuotationService service = new QuotationService();
		double quote = service.getQuotation(vehicule);		
		return new Rule("rule::price::quotation_rate", ((price <= quote * 1.2) && (price >= quote * 0.8)));
	}

	public Rule checkRegisterNumberRule(Annonce annonce) {
		String registerNumber = annonce.getVehicule().getRegisterNumber();
		BlackListedService service = new BlackListedService();
		return new Rule("rule::registernumber::blacklist", (!service.isBlackListed(registerNumber)));
	}

	/**
	 * this method calculates the number of alphanumerics characters present in a
	 * str string
	 * 
	 * @param str
	 * @return the number of alphanumerics characters in a String str
	 */

	private int countAlphabetic(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				count++;
			}
		}

		return count;
	}

	/**
	 * this method calculates the number of numeric characters present in a str
	 * string
	 * 
	 * @param str
	 * @return the number of alphanumerics characters in a String str
	 */

	private int countNumeric(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
			}
		}

		return count;
	}

}
