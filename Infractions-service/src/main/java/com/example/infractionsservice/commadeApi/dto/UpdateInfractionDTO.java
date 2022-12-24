package com.example.infractionsservice.commadeApi.dto;

public class UpdateInfractionDTO {

    private String date;
    private String numeroRadar;
    private String immatriculation;
    private double vitesse;
    private double VitesseMaxAutorise;
    private double montant;

    public UpdateInfractionDTO(String date, String numeroRadar, String immatriculation, double vitesse, double vitesseMaxAutorise, double montant) {
        this.date = date;
        this.numeroRadar = numeroRadar;
        this.immatriculation = immatriculation;
        this.vitesse = vitesse;
        VitesseMaxAutorise = vitesseMaxAutorise;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public String getNumeroRadar() {
        return numeroRadar;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public double getVitesse() {
        return vitesse;
    }

    public double getVitesseMaxAutorise() {
        return VitesseMaxAutorise;
    }

    public double getMontant() {
        return montant;
    }
}
