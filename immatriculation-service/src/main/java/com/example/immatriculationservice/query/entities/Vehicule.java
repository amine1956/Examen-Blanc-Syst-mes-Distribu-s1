package com.example.immatriculationservice.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicule {
    @Id
    private String id;
    private String marque;
    private String modele;
    private String immatriculation;
    private int puissance;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    @OneToOne
    private Proprietairre proprietaire;
}
