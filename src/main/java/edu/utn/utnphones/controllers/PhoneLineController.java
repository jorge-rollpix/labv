package edu.utn.utnphones.controllers;

import edu.utn.utnphones.services.PhoneLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone_line")
public class PhoneLineController {

    private final PhoneLineService phoneLineService;

    @Autowired

    public PhoneLineController(PhoneLineService phoneLineService) {
        this.phoneLineService = phoneLineService;
    }
}
