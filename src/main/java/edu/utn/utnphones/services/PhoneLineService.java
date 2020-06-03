package edu.utn.utnphones.services;

import edu.utn.utnphones.models.PhoneLine;
import edu.utn.utnphones.repositories.PhoneLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneLineService {

    private final PhoneLineRepository phoneLineRepository;

    @Autowired

    public PhoneLineService(PhoneLineRepository phoneLineRepository) {
        this.phoneLineRepository = phoneLineRepository;
    }

    public List<PhoneLine> getAllPhoneLines(){
        return phoneLineRepository.findAll();
    }

    public void addPhoneLine(PhoneLine phoneLine) {
        phoneLineRepository.save(phoneLine);
    }

    public List<PhoneLine> getAllPhoneLinesByPrefix(Integer prefix) {
        return phoneLineRepository.findAllPhoneLinesByPrefix(prefix);
    }


}
