package com.example.exam2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.exam2.Models.VirusRepo;
@Controller
public class MainController {
    @Autowired
    VirusRepo virusRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mnv = new ModelAndView("index");
        mnv.addObject("viruslist", virusRepo.findAll());

        return mnv;
    }
}
