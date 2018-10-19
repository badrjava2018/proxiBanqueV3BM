package org.formation.spring.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.ALL })
	
	Set<Client> clients = new HashSet<>();

	public Conseiller() {
		super();
	}

	public Conseiller(int id, String nom, String prenom, String adresse) {
		super();
		this.id = id;
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

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public void addClient(Client c) {

		clients.add(c);
		c.setConseiller(this);

	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", clients="
				+ clients + "]";
	}

}
