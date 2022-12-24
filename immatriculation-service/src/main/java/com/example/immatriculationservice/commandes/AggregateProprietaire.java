package com.example.immatriculationservice.commandes;

import com.example.immatriculationservice.commadeapi.commands.CreateProprietaireCommand;
import com.example.immatriculationservice.commadeapi.commands.UpdateProprietaireCommand;
import com.example.immatriculationservice.commadeapi.event.CreatedProprietaireEvent;
import com.example.immatriculationservice.commadeapi.event.UpdatedProprietaireEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AggregateProprietaire {
    @AggregateIdentifier
    private String id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    public AggregateProprietaire() {

    }

    @CommandHandler
    public AggregateProprietaire(CreateProprietaireCommand command) {
        AggregateLifecycle.apply(new CreatedProprietaireEvent(command.getId(), command.getNom(), command.getPrenom(), command.getAdresse(), command.getTelephone()));

    }

    @EventSourcingHandler
    public void on(CreatedProprietaireEvent event) {
        this.id = event.getId();
        this.nom = event.getNom();
        this.prenom = event.getPrenom();
        this.adresse = event.getAdresse();
        this.telephone = event.getTelephone();
    }

    @CommandHandler
    public void on(UpdateProprietaireCommand command) {
        if (command.getId() != null) {
            AggregateLifecycle.apply(new UpdatedProprietaireEvent(command.getId(), command.getNom(), command.getPrenom(), command.getAdresse(), command.getTelephone()));
        }


    }

    @EventSourcingHandler
    public void on(UpdatedProprietaireEvent event) {
        this.nom = event.getNom();
        this.prenom = event.getPrenom();
        this.adresse = event.getAdresse();
        this.telephone = event.getTelephone();
    }
}