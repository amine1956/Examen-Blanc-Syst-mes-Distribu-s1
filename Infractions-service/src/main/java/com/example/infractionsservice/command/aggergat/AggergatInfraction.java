package com.example.infractionsservice.command.aggergat;

import com.example.infractionsservice.commadeApi.commandes.CreateIndractionCommand;
import com.example.infractionsservice.commadeApi.event.CreateIndractionEvent;
import com.example.infractionsservice.commadeApi.event.UpdateIndractionEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AggergatInfraction {
    @AggregateIdentifier
    private String id;
    private String numeroRadar;
    private String immatriculation;
    private double vitesse;
    private double VitesseMaxAutorise;
    private double montant;

    public AggergatInfraction() {
    }

    @CommandHandler
    public AggergatInfraction(CreateIndractionCommand command) {
        AggregateLifecycle.apply(new CreateIndractionEvent(command.getId(), command.getDate(), command.getNumeroRadar(), command.getImmatriculation(), command.getVitesse(), command.getVitesseMaxAutorise(), command.getMontant()));
    }

    @EventSourcingHandler
    public void on(CreateIndractionEvent event) {
        this.id = event.getId();
        this.numeroRadar = event.getNumeroRadar();
        this.immatriculation = event.getImmatriculation();
        this.vitesse = event.getVitesse();
        VitesseMaxAutorise = event.getVitesseMaxAutorise();
        this.montant = event.getMontant();
    }

    @EventSourcingHandler
    public void on(UpdateIndractionEvent event) {
        this.numeroRadar = event.getNumeroRadar();
        this.immatriculation = event.getImmatriculation();
        this.vitesse = event.getVitesse();
        VitesseMaxAutorise = event.getVitesseMaxAutorise();
        this.montant = event.getMontant();
    }




}
