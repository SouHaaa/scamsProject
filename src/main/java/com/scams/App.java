package com.scams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scams.modeles.Annonce;
import com.scams.modeles.Contact;
import com.scams.modeles.Phone;
import com.scams.modeles.Result;
import com.scams.modeles.Rule;
import com.scams.modeles.Vehicule;
import com.scams.services.RulesAnnonceService;

/**
 * 
 * @author souha
 * 
 * this is the Main Class of the Application We have a methode named
 * initAnnonce in wich we initialize the annonce Object
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		boolean scam = true;
		RulesAnnonceService rulesService = new RulesAnnonceService();

		// 1- init Annonce
		Annonce annonce = initAnnonce();
		// 2- checl all rules
		List<Rule> listeRegles = checkRules(annonce, rulesService);
		// 3- filter scam rules and get an array which contains the name of rules
		String[] theRules = listeRegles.stream().filter(r -> r.isValeur() == false).map(rr -> rr.getNom())
				.toArray(String[]::new);
		// 4- if the array is empty then there is no scam ! PAS D'ARNAQUE
		if (theRules.length == 0) {
			scam = false;
		}
		// 5- set result and log it as JSON
		Result result = new Result(annonce.getReference(), scam, theRules);
		String jsonString = generateJson(result);
		System.out.println(jsonString);

	}

	/**
	 * this method initialize the announce object
	 * 
	 * @return the Annonce Object
	 */
	private static Annonce initAnnonce() {
		Phone phone1 = new Phone("0607080901");
		Contact contact = new Contact("Christophe", "Dupont", "testDepot95@yopmail.fr", phone1);
		Vehicule vehicule = new Vehicule("HONDA", "CR-V", "IV (2) 1.6 I-DTEC 160 4WD EXCLUSIVE NAVI AT",
				"SUV_4X4_CROSSOVER", "AA123AA", 100000);
		String[] publicationOptions = { "STRENGTHS", "BOOST_VO" };
		Annonce annonce = new Annonce(contact, new Date(), 19000, publicationOptions, "B300053623", vehicule);
		return annonce;
	}

	/**
	 * 
	 * @param annonce
	 * @param rules
	 * @return
	 */
	private static List<Rule> checkRules(Annonce annonce, RulesAnnonceService rulesService) {

		List<Rule> rules = new ArrayList<Rule>();
		rules.add(rulesService.checkLastNameRule(annonce));
		rules.add(rulesService.checkfirstNameRule(annonce));
		rules.add(rulesService.checkAlphaNumRateRule(annonce));
		rules.add(rulesService.checlNumberRateRule(annonce));
		rules.add(rulesService.checkQuotationRateRule(annonce));
		rules.add(rulesService.checkRegisterNumberRule(annonce));
		return rules;
	}

	/**
	 * this method generates a JSON that return the result of the announce declared
	 * in main
	 * 
	 * @param scam
	 * @param theRules
	 * @return a String JSON
	 */
	private static String generateJson(Result result) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";

		try {
			jsonString = mapper.writeValueAsString(result);
		} catch (JsonProcessingException e) {
			System.out.println("error while parsing object");
		}
		return jsonString;
	}
}
