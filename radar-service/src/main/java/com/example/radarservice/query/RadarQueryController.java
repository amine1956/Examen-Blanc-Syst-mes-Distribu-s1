package com.example.radarservice.query;

import com.example.radarservice.query.entite.Radar;
import com.example.radarservice.query.queries.GettAllRadar;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
@CrossOrigin("*")
@RestController
@RequestMapping("/query")
public class RadarQueryController {
    private QueryGateway queryGateway;

    public RadarQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }
    @GetMapping("/radars")
    public CompletableFuture<List<Radar>> getAllRadar(){
        return  queryGateway.query(new GettAllRadar(), ResponseTypes.multipleInstancesOf(Radar.class));
    }

}
