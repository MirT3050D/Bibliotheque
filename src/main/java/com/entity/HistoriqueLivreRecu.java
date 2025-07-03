package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueLivreRecu")
public class HistoriqueLivreRecu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idPret")
    private HistoriquePret idPret;
    private java.util.Date dateReception;

    // Getters and Setters
}