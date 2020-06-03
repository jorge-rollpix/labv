package edu.utn.utnphones.controllers;

import edu.utn.utnphones.services.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
public class CallController {

    private final CallService callService;

    @Autowired

    public CallController(CallService callService) {
        this.callService = callService;
    }
}
