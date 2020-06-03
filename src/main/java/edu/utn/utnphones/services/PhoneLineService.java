package edu.utn.utnphones.services;

import edu.utn.utnphones.models.PhoneLine;
import edu.utn.utnphones.repositories.PhoneLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneLineService {

    private final PhoneLineRepository phoneLineRepository;

    @Autowired

    public PhoneLineService(PhoneLineRepository phoneLineRepository) {
        this.phoneLineRepository = phoneLineRepository;
    }
}
