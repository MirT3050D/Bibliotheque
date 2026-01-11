package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "membre")
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String numTel;
    private String adresseMail;
    private String mdp;// Mot de passe, à stocker de manière sécurisée
    @ManyToOne
    @JoinColumn(name = "id_adherent")
    private Adherent idAdherent; // Référence à l'adhérent, peut être une chaîne ou un identifiant
    @ManyToOne
    @JoinColumn(name = "idStatus")
    private StatutMembre idStatus;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public String getNumTel() {
        return numTel;
    }
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    public String getAdresseMail() {
        return adresseMail;
    }
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }
    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public Adherent getIdAdherent() {
        return idAdherent;
    }
    public void setIdAdherent(Adherent idAdherent) {
        this.idAdherent = idAdherent;
    }
    public StatutMembre getIdStatus() {
        return idStatus;
    }
    public void setIdStatus(StatutMembre idStatus) {
        this.idStatus = idStatus;
    }

    // Getters and Setters
    
}