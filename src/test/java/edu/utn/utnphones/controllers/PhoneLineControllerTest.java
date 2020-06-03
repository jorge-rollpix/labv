package edu.utn.utnphones.controllers;

import edu.utn.utnphones.models.Locality;
import edu.utn.utnphones.models.PhoneLine;
import edu.utn.utnphones.services.PhoneLineService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness =  Strictness.WARN)

public class PhoneLineControllerTest {
    @InjectMocks
    private PhoneLineController phoneLineController;
    @Mock
    private PhoneLineService phoneLineService;

    @Test
    public void getAllPhoneLinesByPrefix(){
        List<PhoneLine> phoneLines = new ArrayList<PhoneLine>();


        PhoneLine line1 = new PhoneLine(1, 2213456, null,null);
        PhoneLine line2 = new PhoneLine(1, 2233456, null,null);
        PhoneLine line3 = new PhoneLine(1, 2243456, null,null);

        phoneLines.add(line1);
        phoneLines.add(line2);
        phoneLines.add(line3);

        when(phoneLineService.getAllPhoneLinesByPrefix(221)).thenReturn(phoneLines);
        ResponseEntity<List<PhoneLine>> responsePhoneLine = phoneLineController.getAllPhoneLinesByPrefix(221);

        assertEquals(200, responsePhoneLine.getStatusCodeValue());

    }
}
