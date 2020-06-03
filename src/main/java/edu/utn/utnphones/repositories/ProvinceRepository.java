package edu.utn.utnphones.repositories;

import edu.utn.utnphones.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

    @Query(value = "Select * from provinces where name + ?1", nativeQuery = true)
    List<Province> findByProvinceName(String name);
}
