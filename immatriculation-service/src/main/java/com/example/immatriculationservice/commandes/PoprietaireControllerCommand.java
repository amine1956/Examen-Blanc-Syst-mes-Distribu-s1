package com.example.immatriculationservice.commandes;

import com.example.immatriculationservice.commadeapi.commands.CreateProprietaireCommand;
import com.example.immatriculationservice.commadeapi.dto.CreateProprietaireDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@RequestMapping("/commands/propietaire")
public class PoprietaireControllerCommand {

    private EventStore eventStore;
    private CommandGateway commandGateway;

    public PoprietaireControllerCommand(EventStore eventStore, CommandGateway commandGateway) {
        this.eventStore = eventStore;
        this.commandGateway = commandGateway;
    }

    @GetMapping("/eventsStore/{id}")
    public Stream getEventsStore(@PathVariable String id) {
        return eventStore.readEvents(id).asStream();
    }

    @PostMapping("/create")
    public CompletableFuture<String> createProprietaire(@RequestBody CreateProprietaireDTO createProprietaireDTO) {
        return commandGateway.send(new CreateProprietaireCommand(UUID.randomUUID().toString(), createProprietaireDTO.getNom(), createProprietaireDTO.getPrenom(), createProprietaireDTO.getAdresse(), createProprietaireDTO.getTelephone()));
    }
    @PutMapping("/update/{id}")
    public CompletableFuture<String> updateProprietaire(@PathVariable String id, @RequestBody CreateProprietaireDTO createProprietaireDTO) {
        return commandGateway.send(new CreateProprietaireCommand(id, createProprietaireDTO.getNom(), createProprietaireDTO.getPrenom(), createProprietaireDTO.getAdresse(), createProprietaireDTO.getTelephone()));
    }
}