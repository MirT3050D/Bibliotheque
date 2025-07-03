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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Membre getIdMembre() {
        return idMembre;
    }
    public void setIdMembre(Membre idMembre) {
        this.idMembre = idMembre;
    }
    public TypeMouvementMembre getIdTypeMouvement() {
        return idTypeMouvement;
    }
    public void setIdTypeMouvement(TypeMouvementMembre idTypeMouvement) {
        this.idTypeMouvement = idTypeMouvement;
    }
    

    // Getters and Setters
}