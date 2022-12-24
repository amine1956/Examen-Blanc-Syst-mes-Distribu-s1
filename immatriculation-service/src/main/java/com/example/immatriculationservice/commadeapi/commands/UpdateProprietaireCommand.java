package com.example.immatriculationservice.commadeapi.commands;

public class UpdateProprietaireCommand extends BaseProprietaire<String>{
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    public UpdateProprietaireCommand(String id, String nom, String prenom, String adresse, String telephone) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
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

