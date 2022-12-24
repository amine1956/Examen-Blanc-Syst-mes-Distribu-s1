package com.example.radarservice.commandeApi.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class RadarUpdtedEvent extends BaseRadarEvent<String> {

    @Getter private double vitesseMax;
    @Getter private double latitude;
    @Getter private double longitude;

    public RadarUpdtedEvent(String id, double vitesseMax, double latitude, double longitude) {
        super(id);
        this.vitesseMax = vitesseMax;
        this.latitude = latitude;
        this.longitude = longitude;
    }



}
