package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomCategorie;
    private String description;

    // Getters and Setters
}