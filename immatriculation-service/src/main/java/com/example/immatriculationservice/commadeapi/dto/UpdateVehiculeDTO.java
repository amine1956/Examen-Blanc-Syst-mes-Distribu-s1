package com.example.immatriculationservice.commadeapi.dto;

public class UpdateVehiculeDTO {
    private String id;
    private String marque;
    private String modele;
    private String immatriculation;
    private String proprietaireId;

    public UpdateVehiculeDTO(String id, String marque, String modele, String immatriculation, String proprietaireId) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.proprietaireId = proprietaireId;
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
}
