package com.easy.archiecture.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Company {

    @Autowired
    private PersonServiceImpl person;

    //applicationContext.getBean("xxxxx");


    public void getPersonName() {
        person.printName();
    }

}
