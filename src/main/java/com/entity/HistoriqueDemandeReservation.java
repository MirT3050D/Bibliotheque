package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiqueDemandeReservation")
public class HistoriqueDemandeReservation {
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
    private java.util.Date dateDemande;
    @ManyToOne
    @JoinColumn(name = "idStatut")
    private TypeStatutReservation idStatut;

    // Getters and Setters
}