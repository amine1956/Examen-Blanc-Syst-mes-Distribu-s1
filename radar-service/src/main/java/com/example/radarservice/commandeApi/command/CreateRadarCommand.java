package com.example.radarservice.commandeApi.command;

import lombok.Getter;

public class CreateRadarCommand extends BaseRadar<String> {
    @Getter private double vitesseMax;
    @Getter private double latitude;
    @Getter private double longitude;

    public CreateRadarCommand(String id, double vitesseMax, double latitude, double longitude) {
        super(id);
        this.vitesseMax = vitesseMax;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

