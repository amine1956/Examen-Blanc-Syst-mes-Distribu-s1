package com.example.immatriculationservice.commadeapi.dto;

public class UpdateProprietaireDTO {
    private String id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    public UpdateProprietaireDTO(String id, String nom, String prenom, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }
}
