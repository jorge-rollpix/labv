package edu.utn.utnphones.services;

import edu.utn.utnphones.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final BillRepository billRepository;

    @Autowired

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
}
