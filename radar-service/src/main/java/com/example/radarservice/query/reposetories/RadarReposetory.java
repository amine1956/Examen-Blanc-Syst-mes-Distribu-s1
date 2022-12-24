package com.example.radarservice.query.reposetories;

import com.example.radarservice.query.entite.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarReposetory extends JpaRepository<Radar, String> {

}
