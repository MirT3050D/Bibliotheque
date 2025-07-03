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

    // Getters and Setters
}