package com.example.radarservice.commandes.aggeregate;

import com.example.radarservice.commandeApi.command.CreateRadarCommand;
import com.example.radarservice.commandeApi.dto.CreateRadarDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@RequestMapping("/commands/radar")
public class RadarCommandeController {
    private EventStore eventStore;
    private CommandGateway commandGateway;
    public RadarCommandeController(EventStore eventStore, CommandGateway commandGateway) {
        this.eventStore = eventStore;
        this.commandGateway = commandGateway;
    }

    @GetMapping("/eventsStore/{id}")
    public Stream getEventsStore(@PathVariable String id){
        return eventStore.readEvents(id).asStream();
    }
    @PostMapping("/create")
    public CompletableFuture<String> createRadar(@RequestBody CreateRadarDTO createRadarDTO){
        return commandGateway.send(new CreateRadarCommand(UUID.randomUUID().toString(), createRadarDTO.getVitesseMax(), createRadarDTO.getLatitude(), createRadarDTO.getLongitude()));
    }
}
