package com.example.infractionsservice.query.service;

import com.example.infractionsservice.commadeApi.event.CreateIndractionEvent;
import com.example.infractionsservice.query.enties.Infraction;
import com.example.infractionsservice.query.queries.GetALLInfraction;
import com.example.infractionsservice.query.reposetories.InfractionReposetoty;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class InfractionHandlerService {
    private InfractionReposetoty infractionReposetoty;

    public InfractionHandlerService(InfractionReposetoty infractionReposetoty) {
        this.infractionReposetoty = infractionReposetoty;
    }
    @EventHandler

    public void on(CreateIndractionEvent event) {
        Infraction infraction = new com.example.infractionsservice.query.enties.Infraction();
        infraction.setId(event.getId());
        infraction.setDate(event.getDate());
        infraction.setNumeroRadar(event.getNumeroRadar());
        infraction.setVitesse(event.getVitesse());
         infraction.setVitesseMaxAutorise(event.getVitesseMaxAutorise());
        infraction.setImmatriculation(event.getImmatriculation());
        infraction.setMontant(event.getMontant());

        infractionReposetoty.save(infraction);
    }
    @QueryHandler
    public List<Infraction> getInfraction(GetALLInfraction id) {
        return infractionReposetoty.findAll();
    }

}
