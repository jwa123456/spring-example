package com.easy.archiecture.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfig.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Person person = (Person) applicationContext.getBean("person");
        person.input();
        Person person1 = (Person) applicationContext.getBean("person");

        System.out.println(person == person1);
    }
}
