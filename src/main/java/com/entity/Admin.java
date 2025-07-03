package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String mdp;
    private String numTel;
    private String mail;

    // Getters and Setters
}