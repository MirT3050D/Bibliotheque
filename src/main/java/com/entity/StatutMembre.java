package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "statutMembre")
public class StatutMembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statut;

    // Getters and Setters
}