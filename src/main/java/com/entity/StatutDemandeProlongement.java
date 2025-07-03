package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "statutDemandeProlongement")
public class StatutDemandeProlongement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statut;

    // Getters and Setters
}