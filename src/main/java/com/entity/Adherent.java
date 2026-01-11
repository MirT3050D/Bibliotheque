package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "adherent")
public class Adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statut;
    private String prixAdhesion;
    private Integer nombreLivrePret;
    private String duree;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public String getPrixAdhesion() {
        return prixAdhesion;
    }
    public void setPrixAdhesion(String prixAdhesion) {
        this.prixAdhesion = prixAdhesion;
    }
    public Integer getNombreLivrePret() {
        return nombreLivrePret;
    }
    public void setNombreLivrePret(Integer nombreLivrePret) {
        this.nombreLivrePret = nombreLivrePret;
    }
    public String getDuree() {
        return duree;
    }
    public void setDuree(String duree) {
        this.duree = duree;
    }
    

    // Getters and Setters
}