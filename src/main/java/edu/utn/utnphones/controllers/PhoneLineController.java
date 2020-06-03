package edu.utn.utnphones.controllers;

import edu.utn.utnphones.models.PhoneLine;
import edu.utn.utnphones.services.PhoneLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone_line")
public class PhoneLineController {

    private final PhoneLineService phoneLineService;

    @Autowired

    public PhoneLineController(PhoneLineService phoneLineService) {
        this.phoneLineService = phoneLineService;
    }

    @GetMapping("/")
    public List<PhoneLine> getPhoneLines(){
        return phoneLineService.getAllPhoneLines();
    }


    @PostMapping("/")
    public void addPhoneLine(@RequestBody PhoneLine newPhoneLine){
        phoneLineService.addPhoneLine(newPhoneLine);
    }


    //PARCIAL BY PREFIX PHONE LINE W/O LOCALITIES
    @GetMapping("/byPrefix/{prefix}")
    public ResponseEntity<List<PhoneLine>> getAllPhoneLinesByPrefix(@PathVariable Integer prefix){
        ResponseEntity<List<PhoneLine>> responseEntity;
        List<PhoneLine> phoneLines = phoneLineService.getAllPhoneLinesByPrefix(prefix);

        if(phoneLines.size() > 0){
            responseEntity = ResponseEntity.ok(phoneLines);
        }else{
            responseEntity = ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return responseEntity;
    }


}
