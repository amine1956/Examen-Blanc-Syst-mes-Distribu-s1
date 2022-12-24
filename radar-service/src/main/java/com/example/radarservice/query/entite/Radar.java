package com.example.radarservice.query.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Radar {
    @Id
    private String id;
    private double vitesseMax;
    private double latitude;
    private double longitude;

    public Radar() {
    }

    public Radar(String id, double vitesseMax, double latitude, double longitude) {
        this.id = id;
        this.vitesseMax = vitesseMax;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
