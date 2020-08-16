package com.easy.archiecture.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Company {

    @Autowired
    private PersonServiceImpl person;


    public void getPersonName() {
        person.printName();
    }

}
