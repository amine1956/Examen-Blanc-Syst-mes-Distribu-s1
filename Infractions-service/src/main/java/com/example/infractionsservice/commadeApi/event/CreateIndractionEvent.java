package com.example.infractionsservice.commadeApi.event;

import com.example.infractionsservice.commadeApi.commandes.BaseInfraction;
import lombok.Getter;

import java.util.Date;

public class CreateIndractionEvent extends BaseInfraction<String> {
    @Getter private Date date;
    @Getter private String numeroRadar;
    @Getter private String immatriculation;
    @Getter private double vitesse;
    @Getter private double VitesseMaxAutorise;
    @Getter
    private double montant;


    public CreateIndractionEvent(String id, Date date, String numeroRadar, String immatriculation, double vitesse, double vitesseMaxAutorise, double montant) {
        super(id);
        this.date = date;
        this.numeroRadar = numeroRadar;
        this.immatriculation = immatriculation;
        this.vitesse = vitesse;
        VitesseMaxAutorise = vitesseMaxAutorise;
        this.montant = montant;
    }
}
