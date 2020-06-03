package edu.utn.utnphones.repositories;

import edu.utn.utnphones.models.PhoneLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneLineRepository extends JpaRepository<PhoneLine, Integer> {
}
