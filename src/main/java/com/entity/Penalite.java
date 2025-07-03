package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "penalite")
public class Penalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent idAdherent;
    private Integer jourMin;
    private Integer jourMax;
    private Integer nbJourPenalite;

    // Getters and Setters
}