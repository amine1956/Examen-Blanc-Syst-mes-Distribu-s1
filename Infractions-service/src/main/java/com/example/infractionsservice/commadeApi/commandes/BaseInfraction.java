package com.example.infractionsservice.commadeApi.commandes;

public class BaseInfraction <T> {
    private T id;

    public BaseInfraction(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
