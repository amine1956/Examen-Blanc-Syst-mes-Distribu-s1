package com.example.infractionsservice.query.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Infraction {
    @Id
    private String id;
    private Date date;
    private String numeroRadar;
    private String immatriculation;
    private double vitesse;
    private double VitesseMaxAutorise;
    private double montant;

}
