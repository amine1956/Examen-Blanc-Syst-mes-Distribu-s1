package com.example.immatriculationservice.query.service;

import com.example.immatriculationservice.commadeapi.event.CreatedProprietaireEvent;
import com.example.immatriculationservice.commadeapi.event.CreatedVehiculeEvent;
import com.example.immatriculationservice.query.entities.Proprietairre;
import com.example.immatriculationservice.query.entities.Vehicule;
import com.example.immatriculationservice.query.queries.GettAllVehicule;
import com.example.immatriculationservice.query.reposetories.PropriataireReposetorie;
import com.example.immatriculationservice.query.reposetories.VehuculeReposetorie;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
@Service
@Transactional
@Slf4j
public class ImmatriculationHandlerService {
    private VehuculeReposetorie vehuculeReposetorie;
    private PropriataireReposetorie propriataireReposetorie;

    public ImmatriculationHandlerService(VehuculeReposetorie vehuculeReposetorie, PropriataireReposetorie propriataireReposetorie) {
        this.vehuculeReposetorie = vehuculeReposetorie;
        this.propriataireReposetorie = propriataireReposetorie;
    }

    @EventHandler
    public void on(CreatedVehiculeEvent event) {
        Vehicule vehicule = new Vehicule();
        vehicule.setId(UUID.randomUUID().toString());
        vehicule.setImmatriculation(event.getImmatriculation());
        vehicule.setMarque(event.getMarque());
        vehicule.setModele(event.getModele());
        vehicule.setPuissance(event.getPuissance());
        System.out.println("event.getProprietaireId() = " + event.getProprietaireId());
        vehicule.setProprietaire(propriataireReposetorie.findById(event.getProprietaireId()).get());
        vehuculeReposetorie.save(vehicule);
    }
    @EventHandler
    public void on(CreatedProprietaireEvent event) {
        Proprietairre proprietaire = new Proprietairre();
        proprietaire.setId(UUID.randomUUID().toString());
        proprietaire.setNom(event.getNom());
        proprietaire.setPrenom(event.getPrenom());
        proprietaire.setAdresse(event.getAdresse());
        proprietaire.setTelephone(event.getTelephone());
        propriataireReposetorie.save(proprietaire);
    }

    @QueryHandler
    public List<Vehicule> getVehicule(GettAllVehicule query) {
        return vehuculeReposetorie.findAll();
    }





}
