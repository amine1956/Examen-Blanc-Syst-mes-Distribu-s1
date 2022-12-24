package com.example.infractionsservice.command.aggergat;

import com.example.infractionsservice.commadeApi.commandes.CreateIndractionCommand;
import com.example.infractionsservice.commadeApi.dto.CreateInfractionDTO;
import com.example.infractionsservice.commadeApi.dto.UpdateInfractionDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands/infraction")
public class InfractionControllerHandler {
    private EventStore eventStore;
    private CommandGateway commandGateway;
    public InfractionControllerHandler(EventStore eventStore, CommandGateway commandGateway) {
        this.eventStore = eventStore;
        this.commandGateway = commandGateway;
    }
    @PostMapping("/create")
    public CompletableFuture<String>  createInfraction(@RequestBody CreateInfractionDTO createInfractionDTO){
        return commandGateway.send(new CreateIndractionCommand(UUID.randomUUID().toString(), createInfractionDTO.getDate(), createInfractionDTO.getNumeroRadar(), createInfractionDTO.getImmatriculation(), createInfractionDTO.getVitesse(), createInfractionDTO.getVitesseMaxAutorise(), createInfractionDTO.getMontant()));
    }
    @PutMapping("/update")
    public CompletableFuture<String>  updateInfraction(@RequestBody UpdateInfractionDTO createInfractionDTO){
        return commandGateway.send(new UpdateInfractionDTO( createInfractionDTO.getDate(), createInfractionDTO.getNumeroRadar(), createInfractionDTO.getImmatriculation(), createInfractionDTO.getVitesse(), createInfractionDTO.getVitesseMaxAutorise(), createInfractionDTO.getMontant()));
    }

}
