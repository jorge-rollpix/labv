package edu.utn.utnphones.controllers;

import edu.utn.utnphones.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
