package com.projeto.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetoController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/cadastrar")
    public String cadastrar(){
        return "cadastrar";
    }
}
