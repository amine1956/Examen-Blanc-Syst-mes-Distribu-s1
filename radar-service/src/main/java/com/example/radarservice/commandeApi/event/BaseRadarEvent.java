package com.example.radarservice.commandeApi.event;

public class BaseRadarEvent <T> {
    private T id;

    public BaseRadarEvent(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }


}
