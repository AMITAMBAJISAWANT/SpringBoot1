package com.amit.springboot1.model;

import org.springframework.stereotype.Component;
@Component
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("desktop Object created");
    }

    
    public void compile() {
         System.out.println("In the Desktop");
         
    }
    
}
