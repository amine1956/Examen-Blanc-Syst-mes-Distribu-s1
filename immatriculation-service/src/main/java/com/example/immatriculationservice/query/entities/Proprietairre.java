package com.example.immatriculationservice.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
// Chaque véhicule appartient à un seul propriétaire.
public class Proprietairre {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    // relation avec véhicule
    @OneToOne(mappedBy = "proprietaire")
    private Vehicule vehicule;



}

