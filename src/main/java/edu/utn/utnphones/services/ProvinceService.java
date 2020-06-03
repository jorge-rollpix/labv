package edu.utn.utnphones.services;

import edu.utn.utnphones.models.Province;
import edu.utn.utnphones.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;


@Service
public class ProvinceService {

   private final ProvinceRepository provinceRepository;

   @Autowired

    public ProvinceService(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public void addProvince(Province newProvince) {
       provinceRepository.save(newProvince);
    }

    public List<Province> getAll(String name){
       if(isNull(name)){
           return provinceRepository.findAll();
       }
       return provinceRepository.findByProvinceName(name);
    }


}
