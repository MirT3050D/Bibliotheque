package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiquePret")
public class HistoriquePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre idLivre;
    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent idAdherent;
    private java.util.Date dateEmprunt;
    private java.util.Date dateRetour;
    private Integer nombreExemplaire;

    // Getters and Setters
}