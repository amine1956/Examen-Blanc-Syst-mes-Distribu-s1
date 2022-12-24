package com.example.immatriculationservice.commadeapi.commands;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseVehicule<T> {
    @TargetAggregateIdentifier
    @Getter
    private T id;

    public BaseVehicule(T id) {
        this.id = id;
    }

}
