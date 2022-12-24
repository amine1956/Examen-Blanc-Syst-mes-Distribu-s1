package com.example.infractionsservice.commadeApi.commandes;

import java.util.Date;

public class UpdateIndractionCommand extends BaseInfraction<String>{
    private Date date;
    private String numeroRadar;
    private String immatriculation;
    private double vitesse;
    private double VitesseMaxAutorise;
    private double montant;


    public UpdateIndractionCommand(String id, Date date, String numeroRadar, String immatriculation, double vitesse, double vitesseMaxAutorise, double montant) {
        super(id);
        this.date = date;
        this.numeroRadar = numeroRadar;
        this.immatriculation = immatriculation;
        this.vitesse = vitesse;
        VitesseMaxAutorise = vitesseMaxAutorise;
        this.montant = montant;
    }
}
