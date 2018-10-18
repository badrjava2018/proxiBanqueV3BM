package org.formation.spring.model;

import javax.persistence.Embeddable;

@Embeddable
public class CompteEpargne  {

	private int numéroCompte;
	private double soldeCompte;
	private double txRem = 0.03;

	public CompteEpargne(int numéroCompte, double soldeCompte, double txRem) {
		super();
		this.numéroCompte = numéroCompte;
		this.soldeCompte = soldeCompte;
		this.txRem = txRem;
	}

	public CompteEpargne() {
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

	public double getTxRem() {
		return txRem;
	}

	public void setTxRem(double txRem) {
		this.txRem = txRem;
	}

}
