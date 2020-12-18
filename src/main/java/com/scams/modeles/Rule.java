package com.scams.modeles;

public class Rule {

	private String nom;
	private boolean valeur;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isValeur() {
		return valeur;
	}

	public void setValeur(boolean valeur) {
		this.valeur = valeur;
	}

	public Rule() {
	}

	public Rule(String nom, boolean valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Rule [nom=" + nom + ", valeur=" + valeur + "]";
	}

}
