package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "typeStatutReservation")
public class TypeStatutReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String statut;

    // Getters and Setters
}