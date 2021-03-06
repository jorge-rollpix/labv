package edu.utn.utnphones.services;

import edu.utn.utnphones.models.Locality;
import edu.utn.utnphones.models.PhoneLine;
import edu.utn.utnphones.repositories.PhoneLineRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.WARN)

public class PhoneLineServiceTest {
    @InjectMocks
    private PhoneLineService phoneLineService;

    @Mock
    private PhoneLineRepository phoneLineRepository;

    @Test
    public void getAllPhoneLinesByPrefixTest() {
        List<PhoneLine> phoneLines = new ArrayList<PhoneLine>();

        PhoneLine line1 = new PhoneLine(1, 2213456, null,null);
        PhoneLine line2 = new PhoneLine(1, 2233456, null,null);
        PhoneLine line3 = new PhoneLine(1, 2243456, null,null);

        phoneLines.add(line1);
        phoneLines.add(line2);
        phoneLines.add(line3);

        when(phoneLineRepository.findAllPhoneLinesByPrefix(351)).thenReturn(phoneLines);
        List<PhoneLine> response = phoneLineService.getAllPhoneLinesByPrefix(351);

        assertNotNull(response);
        assertEquals(phoneLines,response);
    }
}