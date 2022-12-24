package com.example.radarservice.query.service;

import com.example.radarservice.query.entite.Radar;
import com.example.radarservice.query.queries.GettAllRadar;
import com.example.radarservice.query.reposetories.RadarReposetory;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class RadarEventHandlerService {
    private RadarReposetory radarReposetory;

    public RadarEventHandlerService(RadarReposetory radarReposetory) {
        this.radarReposetory = radarReposetory;
    }
    @EventHandler
    public void on(com.example.radarservice.commandeApi.event.RadarCreatedEvent event){
        log.info("********************************", event);
        Radar radar = new Radar();
        radar.setId(event.getId());
        radar.setVitesseMax(event.getVitesseMax());
        radar.setLatitude(event.getLatitude());
        radar.setLongitude(event.getLongitude());
        radarReposetory.save(radar);
    }

    @QueryHandler
    public List<Radar> on(GettAllRadar query){
        return radarReposetory.findAll();
    }
}
