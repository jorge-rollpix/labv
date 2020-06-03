package edu.utn.utnphones.services;

import edu.utn.utnphones.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {

    private final CallRepository callRepository;

    @Autowired

    public CallService(CallRepository callRepository) {
        this.callRepository = callRepository;
    }
}
