package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stockLivre")
public class StockLivre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre idLivre;
    private Integer nombreExemplaire;

    // Getters and Setters
}