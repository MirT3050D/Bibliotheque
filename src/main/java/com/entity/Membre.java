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
    private String idAdherent; // Référence à l'adhérent, peut être une chaîne ou un identifiant
    @ManyToOne
    @JoinColumn(name = "idStatus")
    private StatutMembre idStatus;

    // Getters and Setters
}