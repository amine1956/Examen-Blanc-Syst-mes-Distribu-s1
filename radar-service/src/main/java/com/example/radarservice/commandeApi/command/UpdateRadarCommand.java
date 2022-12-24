package com.example.radarservice.commandeApi.command;

public class UpdateRadarCommand extends BaseRadar<String> {
    private double vitesseMax;
    private double latitude;
    private double longitude;

    public UpdateRadarCommand(String id, double vitesseMax, double latitude, double longitude) {
        super(id);
        this.vitesseMax = vitesseMax;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

