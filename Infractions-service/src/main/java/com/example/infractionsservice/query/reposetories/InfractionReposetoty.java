package com.example.infractionsservice.query.reposetories;

import com.example.infractionsservice.query.enties.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionReposetoty extends JpaRepository<Infraction, String> {
}

