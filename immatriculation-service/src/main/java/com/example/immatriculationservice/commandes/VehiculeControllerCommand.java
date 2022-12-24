package com.example.immatriculationservice.commandes;

import com.example.immatriculationservice.commadeapi.commands.CreateVehiculeCommand;
import com.example.immatriculationservice.commadeapi.dto.CreateVehiculeDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@RequestMapping("/commands/vecticule")
public class VehiculeControllerCommand {
    private EventStore eventStore;
    private CommandGateway commandGateway;

    public VehiculeControllerCommand(EventStore eventStore, CommandGateway commandGateway) {
        this.eventStore = eventStore;
        this.commandGateway = commandGateway;
    }
    @GetMapping("/eventsStore/{id}")
    public Stream getEventsStore(@PathVariable String id){
        return eventStore.readEvents(id).asStream();
    }
    @PostMapping("/create")
    public CompletableFuture<String> createVehicule(@RequestBody CreateVehiculeDTO createVehiculeDTO){
        return commandGateway.send(new CreateVehiculeCommand(UUID.randomUUID().toString(), createVehiculeDTO.getMarque(), createVehiculeDTO.getModele(), createVehiculeDTO.getImmatriculation(), createVehiculeDTO.getPuissance(), createVehiculeDTO.getProprietaireId()));
    }
}
