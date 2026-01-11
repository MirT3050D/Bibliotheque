package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "typeMouvementMembre")
public class TypeMouvementMembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String typeMouvement;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeMouvement() {
        return typeMouvement;
    }
    public void setTypeMouvement(String typeMouvement) {
        this.typeMouvement = typeMouvement;
    }
    

    // Getters and Setters
}