package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueDemandeProlongement")
public class HistoriqueDemandeProlongement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idPret")
    private HistoriquePret idPret;
    private java.util.Date dateDemande;
    private java.util.Date dateRetour;
    @ManyToOne
    @JoinColumn(name = "idStatut")
    private StatutDemandeProlongement idStatut;

    // Getters and Setters
}