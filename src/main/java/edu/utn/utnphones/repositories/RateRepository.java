package edu.utn.utnphones.repositories;

import edu.utn.utnphones.models.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer>{
}
