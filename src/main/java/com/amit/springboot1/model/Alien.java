package com.amit.springboot1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Alien {
    @Value("24")
    private int age;
    
    private Computer com;
    public Computer getCom() {
        return com;
    }
    
    @Autowired
    
    public void setCom(Computer com) {
        this.com = com;
    }

    public void compile(){
        System.out.println("In the Alien class ");
        com.compile();
        System.out.println(age);
    }
      
    
}
