package edu.utn.utnphones.controllers;

import edu.utn.utnphones.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RateController {

    private final RateService rateService;

    @Autowired

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }
}
