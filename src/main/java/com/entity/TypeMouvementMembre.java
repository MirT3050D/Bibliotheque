package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "typeMouvementMembre")
public class TypeMouvementMembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String typeMouvement;

    // Getters and Setters
}