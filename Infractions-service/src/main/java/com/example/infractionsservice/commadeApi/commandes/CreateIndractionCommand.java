package com.example.infractionsservice.commadeApi.commandes;

import lombok.Getter;

import java.util.Date;

public class CreateIndractionCommand extends BaseInfraction<String>{
    @Getter private Date date;
    @Getter private String numeroRadar;
    @Getter private String immatriculation;
    @Getter private double vitesse;
    @Getter private double VitesseMaxAutorise;
    @Getter private double montant;


    public CreateIndractionCommand(String id, Date date, String numeroRadar, String immatriculation, double vitesse, double vitesseMaxAutorise, double montant) {
        super(id);
        this.date = date;
        this.numeroRadar = numeroRadar;
        this.immatriculation = immatriculation;
        this.vitesse = vitesse;
        VitesseMaxAutorise = vitesseMaxAutorise;
        this.montant = montant;
    }
}
