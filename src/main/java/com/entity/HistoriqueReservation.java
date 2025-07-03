package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueReservation")
public class HistoriqueReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent idAdherent;
    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre idLivre;
    private Integer nombreExemplaire;
    private java.util.Date dateReservation;

    // Getters and Setters
}