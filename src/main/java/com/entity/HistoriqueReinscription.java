package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueReinscription")
public class HistoriqueReinscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idMembre")
    private HistoriqueInscription idMembre;
    private java.util.Date dateReinscription;
    private java.util.Date dateFinReinscription;

    // Getters and Setters
}