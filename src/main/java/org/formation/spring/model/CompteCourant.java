package org.formation.spring.model;

import javax.persistence.Embeddable;

@Embeddable
public class CompteCourant {
	
	private int numéroCompte;
	private double soldeCompte;
	private int decouvert = 1000;
	


	public CompteCourant(int numéroCompte, double soldeCompte, int decouvert) {
		super();
		this.numéroCompte = numéroCompte;
		this.soldeCompte = soldeCompte;
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}

	public int getNuméroCompte() {
		return numéroCompte;
	}

	public void setNuméroCompte(int numéroCompte) {
		this.numéroCompte = numéroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	

	

}
