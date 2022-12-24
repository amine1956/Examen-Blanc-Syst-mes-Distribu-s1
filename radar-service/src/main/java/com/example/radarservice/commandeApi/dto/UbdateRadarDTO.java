package com.example.radarservice.commandeApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UbdateRadarDTO {

    private String id;
    private double vitesseMax;
    private double latitude;
    private double longitude;


}

