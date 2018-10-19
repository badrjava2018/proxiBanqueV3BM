package org.formation.spring.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class CompteCourant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int numéroCompte;
	private double soldeCompte;
	private int decouvert = 1000;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "client_id")
	
	Client client;

	public CompteCourant(int numéroCompte, double soldeCompte, int decouvert, Client client) {
		super();
		this.numéroCompte = numéroCompte;
		this.soldeCompte = soldeCompte;
		this.decouvert = decouvert;
		this.client = client;
	}

	public CompteCourant(int numéroCompte, double soldeCompte, int decouvert) {
		super();
		this.numéroCompte = numéroCompte;
		this.soldeCompte = soldeCompte;
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlTransient
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
