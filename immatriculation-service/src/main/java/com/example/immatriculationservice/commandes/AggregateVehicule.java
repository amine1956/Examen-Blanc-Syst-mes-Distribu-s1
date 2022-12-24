package com.example.immatriculationservice.commandes;

import com.example.immatriculationservice.commadeapi.commands.CreateVehiculeCommand;
import com.example.immatriculationservice.commadeapi.commands.UpdateVehiculeCommand;
import com.example.immatriculationservice.commadeapi.event.CreatedVehiculeEvent;
import com.example.immatriculationservice.commadeapi.event.UpdatedVehiculeEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate

public class AggregateVehicule {
    @AggregateIdentifier
    private String id;
    private String marque;
    private String modele;
    private String immatriculation;
    private String proprietaireId;

    private int puissance;

    public AggregateVehicule() {
    }
    @CommandHandler
    public AggregateVehicule(CreateVehiculeCommand command) {
        AggregateLifecycle.apply(new CreatedVehiculeEvent(command.getId(), command.getMarque(), command.getModele(), command.getImmatriculation(), command.getIdProprietaire(), command.getPuissance()));
    }
    @EventSourcingHandler
    public void on(CreatedVehiculeEvent event) {
        this.id = event.getId();
        this.marque = event.getMarque();
        this.modele = event.getModele();
        this.immatriculation = event.getImmatriculation();
        this.proprietaireId = event.getProprietaireId();
        this.puissance = event.getPuissance();
    }
    @CommandHandler
    public void on(UpdateVehiculeCommand command) {
        if (command.getId() != null) {
            AggregateLifecycle.apply(new UpdatedVehiculeEvent(command.getId(), command.getMarque(), command.getModele(), command.getImmatriculation(), command.getIdProprietaire(), command.getPuissance()));
        }
    }
    @EventSourcingHandler
    public void on(UpdatedVehiculeEvent event) {
        this.marque = event.getMarque();
        this.modele = event.getModele();
        this.immatriculation = event.getImmatriculation();
        this.proprietaireId = event.getProprietaireId();
        this.puissance = event.getPuissance();
    }
}
