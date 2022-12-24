package com.example.radarservice.commandeApi.command;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseRadar<T> {
    @TargetAggregateIdentifier
    @Getter
    public T id;

    public BaseRadar(T id) {
        this.id = id;
    }




}
