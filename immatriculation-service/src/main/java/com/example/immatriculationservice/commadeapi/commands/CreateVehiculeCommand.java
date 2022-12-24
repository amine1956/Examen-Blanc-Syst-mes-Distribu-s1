package com.example.immatriculationservice.commadeapi.commands;

public class CreateVehiculeCommand extends BaseVehicule<String>{
    private String marque;
    private String modele;
    private String immatriculation;

    private int puissance;

    private String idProprietaire;

    public CreateVehiculeCommand(String id, String marque, String modele, String immatriculation, int puissance, String idProprietaire) {
        super(id);
        this.marque = marque;
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.puissance = puissance;
        this.idProprietaire = idProprietaire;
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

    public int getPuissance() {
        return puissance;
    }

    public String getIdProprietaire() {
        return idProprietaire;
    }
}
