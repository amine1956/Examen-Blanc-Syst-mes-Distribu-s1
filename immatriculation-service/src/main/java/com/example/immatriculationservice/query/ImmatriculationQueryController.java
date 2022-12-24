package com.example.immatriculationservice.query;

import com.example.immatriculationservice.query.entities.Vehicule;
import com.example.immatriculationservice.query.queries.GettAllVehicule;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/query")
public class ImmatriculationQueryController
{
    private QueryGateway queryGateway;

    public ImmatriculationQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/vehicules")
    public CompletableFuture<List<Vehicule>> getAllVehicules() {
        return queryGateway.query(new GettAllVehicule(), ResponseTypes.multipleInstancesOf(Vehicule.class));
    }


}
