package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorieLivre")
public class CategorieLivre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre idLivre;
    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie idCategorie;

    // Getters and Setters
}