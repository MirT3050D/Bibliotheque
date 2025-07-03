package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueInscription")
public class HistoriqueInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String numTel;
    private String adresseMail;
    private java.util.Date dateInscription;
    private java.util.Date dateFinInscription;

    // Getters and Setters
}