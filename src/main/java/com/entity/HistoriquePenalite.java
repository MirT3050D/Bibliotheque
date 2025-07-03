package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiquePenalite")
public class HistoriquePenalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idHistoriquePret")
    private HistoriquePret idHistoriquePret;
    @ManyToOne
    @JoinColumn(name = "idPenalite")
    private Penalite idPenalite;
    private java.util.Date date;

    // Getters and Setters
}