package edu.utn.utnphones.services;

import edu.utn.utnphones.models.Locality;
import edu.utn.utnphones.repositories.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalityService {
    private final LocalityRepository localityRepository;

    @Autowired
    public LocalityService(LocalityRepository localityRepository) {
        this.localityRepository = localityRepository;
    }

    public void addLocality(Locality newLocality) {
        localityRepository.save(newLocality);
    }


    public Optional<Locality> getById(Integer id_city) {
        return localityRepository.findById(id_city);
    }


    public List<Locality> getAll() {
        return localityRepository.findAll();
    }

    public void delete(Locality locality) {
        localityRepository.delete(locality);
    }

    public Locality update(Locality locality, int id_locality) {
        Locality localityToUpdate = localityRepository.getOne(id_locality);
        localityToUpdate.setName(locality.getName());
        localityToUpdate.setPrefix(locality.getPrefix());
        localityToUpdate.setEntityId(locality.getEntityId());
        return localityRepository.save(localityToUpdate);
    }



}
