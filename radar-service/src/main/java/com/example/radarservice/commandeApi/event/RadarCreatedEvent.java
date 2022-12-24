package com.example.radarservice.commandeApi.event;


import lombok.Getter;

public class RadarCreatedEvent extends BaseRadarEvent<String> {
    @Getter
    private double vitesseMax;
    @Getter private double latitude;
    @Getter private double longitude;

    public RadarCreatedEvent(String id, double vitesseMax, double latitude, double longitude) {
        super(id);
        this.vitesseMax = vitesseMax;

        this.latitude = latitude;
        this.longitude = longitude;
    }


}
