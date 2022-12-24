package com.example.immatriculationservice.commadeapi.event;

public class BaseProprietaireEvent<T>{

    private T id;
    public T getId() {
        return id;
    }
    public BaseProprietaireEvent(T id){
        this.id=id;
    }





}
