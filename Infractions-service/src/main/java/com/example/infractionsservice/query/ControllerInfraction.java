package com.example.infractionsservice.query;

import com.example.infractionsservice.query.enties.Infraction;
import com.example.infractionsservice.query.queries.GetALLInfraction;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/query")
public class ControllerInfraction {
    private QueryGateway queryGateway;

    public ControllerInfraction(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/infracions")
       public CompletableFuture<List<Infraction>> getAllInfraction() {
            return queryGateway.query(new GetALLInfraction(), ResponseTypes.multipleInstancesOf(Infraction.class));
        }
}
