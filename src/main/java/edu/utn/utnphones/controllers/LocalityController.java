package edu.utn.utnphones.controllers;

import edu.utn.utnphones.exceptions.LocalityNotFoundException;
import edu.utn.utnphones.models.Locality;
import edu.utn.utnphones.services.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locality")
public class LocalityController {
    private final LocalityService localityService;

    @Autowired

    public LocalityController(LocalityService localityService) {
        this.localityService = localityService;
    }

    // POST LOCALITY.
    @PostMapping("/")
    public void addLocality(@RequestBody Locality newLocality){
        localityService.addLocality(newLocality);
    }

    @GetMapping("/")
    public List<Locality> getAll() {
        return localityService.getAll();
    }

    @GetMapping("/{id_locality}")
    public Optional<Locality> getLocalityById(@PathVariable Integer id_locality) {
        return localityService.getById(id_locality);
    }

    @DeleteMapping("/")
    public void deleteCity(@RequestBody Locality locality) {
        localityService.delete(locality);
    }

    @PutMapping("/{id_locality}")
    public Locality update(@RequestBody Locality locality, @PathVariable int id_locality) {
        return localityService.update(locality, id_locality);
    }




}
