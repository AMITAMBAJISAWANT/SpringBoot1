package com.amit.springboot1.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("laptop Object created");
    }
    
    

    public void compile() {
        System.out.println("In the Laptop");
        
   }
    
}
