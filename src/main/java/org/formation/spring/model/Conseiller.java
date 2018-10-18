package org.formation.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;

//	private List<Client> listClient = new ArrayList<>();
//	private static int NbrMax = 10;

	
//
//	public Conseiller(String nom, String prenom, String adresse, List<Client> listClient) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresse = adresse;
//		this.listClient = listClient;
//	}

//	public List<Client> getListClient() {
//		return listClient;
//	}
//
//	public void setListClient(List<Client> listClient) {
//		this.listClient = listClient;
//	}
//
//	public static int getNbrMax() {
//		return NbrMax;
//	}

	public Conseiller() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
