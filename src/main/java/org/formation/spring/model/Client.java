package org.formation.spring.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "conseiller_id")
	Conseiller conseiller;
	
	

//	@Embedded
//	private CompteCourant comptecourant;
//	
//	@Embedded
//	private CompteEpargne compteepargne;


	
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
