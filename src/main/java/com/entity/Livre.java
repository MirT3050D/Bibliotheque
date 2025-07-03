package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String auteur;
    private String editeur;
    private Integer anneePublication;
    private String ibns;
    private String langue;
    private String resume;

    // Getters and Setters
}