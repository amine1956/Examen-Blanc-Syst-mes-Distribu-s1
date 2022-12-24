package com.example.immatriculationservice.commadeapi.dto;

public class CreateVehiculeDTO {
    private String id;
    private String marque;
    private String modele;
    private String immatriculation;
    private String proprietaireId;

    private int puissance;

    public CreateVehiculeDTO(String id, String marque, String modele, String immatriculation, String proprietaireId, int puissance) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.proprietaireId = proprietaireId;
        this.puissance = puissance;
    }

    public String getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getProprietaireId() {
        return proprietaireId;
    }

    public int getPuissance() {
        return puissance;
    }
}

