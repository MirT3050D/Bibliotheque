package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "statutMembre")
public class StatutMembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statut;
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

    
    // Getters and Setters
}