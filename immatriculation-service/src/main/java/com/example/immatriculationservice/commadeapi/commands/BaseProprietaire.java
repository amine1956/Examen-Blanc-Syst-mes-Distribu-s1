package com.example.immatriculationservice.commadeapi.commands;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseProprietaire<T> {
    @TargetAggregateIdentifier
    @Getter
    private T id;

    public BaseProprietaire(T id) {
        this.id = id;
    }

}

