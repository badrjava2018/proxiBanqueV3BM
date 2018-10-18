package org.formation.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;



//@XmlRootElement
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	
//	@Embedded
//	private CompteCourant comptecourant;
//	
//	@Embedded
//	private CompteEpargne compteepargne;
	
	
	
	
//
//	
//	public Client(String nom, String prenom, String adresse, CompteCourant comptecourant, CompteEpargne compteepargne) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresse = adresse;
//		this.comptecourant = comptecourant;
//		this.compteepargne = compteepargne;
//	}
//





	public Client() {
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
