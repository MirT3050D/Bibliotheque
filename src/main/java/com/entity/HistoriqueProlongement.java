package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueProlongement")
public class HistoriqueProlongement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idPret")
    private HistoriquePret idPret;
    private java.util.Date dateDebut;
    private java.util.Date dateRetour;

    // Getters and Setters
}