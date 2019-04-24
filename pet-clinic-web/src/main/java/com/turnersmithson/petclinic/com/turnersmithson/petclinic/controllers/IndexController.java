package com.turnersmithson.petclinic.com.turnersmithson.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/index", "/"})
    String indexPage(Model model) {

        return "index";
    }
}
