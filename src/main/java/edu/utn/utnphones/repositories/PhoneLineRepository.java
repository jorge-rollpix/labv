package edu.utn.utnphones.repositories;

import edu.utn.utnphones.models.PhoneLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneLineRepository extends JpaRepository<PhoneLine, Integer> {

    @Query(value="SELECT * FROM phone_lines WHERE number LIKE ?1%",nativeQuery = true)
    List<PhoneLine> findAllPhoneLinesByPrefix(Integer prefix);

}


