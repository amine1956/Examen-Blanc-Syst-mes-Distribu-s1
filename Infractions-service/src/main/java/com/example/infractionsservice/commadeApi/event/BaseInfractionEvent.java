package com.example.infractionsservice.commadeApi.event;

public class BaseInfractionEvent<T> {
    private T id;

    public BaseInfractionEvent(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
