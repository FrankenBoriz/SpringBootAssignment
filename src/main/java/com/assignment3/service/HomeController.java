package com.assignment3.service;

import com.assignment3.domain.Student;
import com.assignment3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Autowired
    StudentRepository StudentRepository;



    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping("/login" )
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register(){ return "register"; }



    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/myprofile")
    public String greeting(Model model) {
        Student student = StudentRepository.findAll().iterator().next();

        model.addAttribute("me", student);
        return "myprofile";
    }
}
