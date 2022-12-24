package com.example.radarservice.commandes.aggeregate;

import com.example.radarservice.commandeApi.command.CreateRadarCommand;
import com.example.radarservice.commandeApi.command.UpdateRadarCommand;
import com.example.radarservice.commandeApi.event.RadarCreatedEvent;
import com.example.radarservice.commandeApi.event.RadarUpdtedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate

public class RadareAggregat {
    @AggregateIdentifier
    private String id;
    private double vitesseMax;
    private double latitude;
    private double longitude;

    public RadareAggregat() {
    }

    @CommandHandler
    public RadareAggregat(CreateRadarCommand command) {
        AggregateLifecycle.apply(new RadarCreatedEvent(command.getId(), command.getVitesseMax(), command.getLatitude(), command.getLongitude()));
    }
    @EventSourcingHandler
    public void on(RadarCreatedEvent event) {
        this.id = event.getId();
        this.vitesseMax = event.getVitesseMax();
        this.latitude = event.getLatitude();
        this.longitude = event.getLongitude();
    }
    @CommandHandler
    public void on(UpdateRadarCommand command) {
        if(command.getId() != null) {
            AggregateLifecycle.apply(new RadarUpdtedEvent(command.getId(), command.getVitesseMax(), command.getLatitude(), command.getLongitude()));
        }
    }

    @EventSourcingHandler
    public void on(RadarUpdtedEvent event) {
        this.vitesseMax = event.getVitesseMax();
        this.latitude = event.getLatitude();
        this.longitude = event.getLongitude();
    }

}
