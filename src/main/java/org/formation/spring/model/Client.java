package org.formation.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;

//	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@ManyToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name = "conseiller_id")
	
	Conseiller conseiller;

	@OneToMany(mappedBy = "client", cascade = { CascadeType.ALL })
	Set<CompteCourant> comptecourant = new HashSet<>();

	public Client() {
		super();
	}

	public Client(int id, String nom, String prenom, String adresse, Conseiller conseiller) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.conseiller = conseiller;
	}

	public Client(String nom, String prenom, String adresse) {
		super();

		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
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

	@XmlTransient
	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public void addCompteCourant(CompteCourant compte) {

		comptecourant.add(compte);
		compte.setClient(this);

	}

	public Set<CompteCourant> getComptecourant() {
		return comptecourant;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", conseiller="
				+ conseiller + ", comptecourant=" + comptecourant + "]";
	}

}
