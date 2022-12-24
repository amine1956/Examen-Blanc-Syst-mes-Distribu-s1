package com.example.radarservice.commandeApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@ AllArgsConstructor
@NoArgsConstructor
public class CreateRadarDTO {

    private double vitesseMax;
    private double latitude;
    private double longitude;


}

