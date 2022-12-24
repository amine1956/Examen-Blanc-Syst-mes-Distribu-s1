package com.example.immatriculationservice.commadeapi.event;

public class UpdatedVehiculeEvent extends BaseVehiculeEvent<String> {
    private String immatriculation;
    private String marque;
    private String modele;
    private String proprietaireId;

    private int puissance;

    public UpdatedVehiculeEvent(String id, String immatriculation, String marque, String modele, String proprietaireId, int puissance) {
        super(id);
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.proprietaireId = proprietaireId;
        this.puissance = puissance;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getProprietaireId() {
        return proprietaireId;
    }

    public int getPuissance() {
        return puissance;
    }
}
