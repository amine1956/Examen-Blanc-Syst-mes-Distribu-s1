package com.example.immatriculationservice.commadeapi.event;

public class BaseVehiculeEvent<T> {
    private T id;

    public BaseVehiculeEvent(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }


}
