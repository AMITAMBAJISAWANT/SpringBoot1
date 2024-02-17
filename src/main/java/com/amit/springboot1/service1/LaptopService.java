package com.amit.springboot1.service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.amit.springboot1.repo.LaptopRepository;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository repo1;

    public void  service(){
        repo1.repository();
    }
;

    




    
}