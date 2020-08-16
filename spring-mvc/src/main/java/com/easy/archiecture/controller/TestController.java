package com.easy.archiecture.controller;

import com.easy.archiecture.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam(name = "a") int num1, @RequestParam(name = "b") int num2) {
        return "cccdddd" + num1 + num2;
    }


    @RequestMapping(value = "/hello2/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public String hello2(@PathVariable(name = "a") int num1, @PathVariable(name = "b") int num2) {
        return "cccdddd" + num1 + num2;
    }


    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    @ResponseBody
    public String hello3(@RequestBody User user) {
        return user.getName();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloPage() {
        return "index";
    }


    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    @ResponseBody
    public User userInfo() {
        User user = new User();
        user.setAge(11);
        user.setName("abc");
        return user;
    }
}
