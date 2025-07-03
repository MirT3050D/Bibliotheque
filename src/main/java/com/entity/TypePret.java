package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "typePret")
public class TypePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String typePret;

    // Getters and Setters
}