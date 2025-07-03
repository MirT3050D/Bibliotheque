package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mouvementMembre")
public class MouvementMembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idMembre")
    private Membre idMembre;
    @ManyToOne
    @JoinColumn(name = "idTypeMouvement")
    private TypeMouvementMembre idTypeMouvement;

    // Getters and Setters
}