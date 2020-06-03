package edu.utn.utnphones.services;

import edu.utn.utnphones.repositories.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    private final RateRepository rateRepository;

    @Autowired

    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }
}
