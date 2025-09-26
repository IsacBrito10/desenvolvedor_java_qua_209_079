package com.projeto.app.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.app.models.Desaparecido;
import com.projeto.app.repository.AppRepository;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    public String cadastrar(){
        return "cadastrar";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    public String cadastrar(Desaparecido desaparecido){
        csr.save(desaparecido);
        return "redirect:/";
    }

    @RequestMapping(value="/lista", method=RequestMethod.GET)
    public ModelAndView lista(){
        ModelAndView mv = new ModelAndView("lista");
        Iterable<Desaparecido> desaparecidos = csr.findAll();
        mv.addObject("desaparecidos", desaparecidos);
        return mv;
    }

    @RequestMapping(value="/informacoes/{idDesaparecido}", method=RequestMethod.GET)
    public ModelAndView informacoes(@PathVariable("idDesaparecido") long idDesaparecido){
    Optional<Desaparecido> desaparecido = csr.findByIdDesaparecido(idDesaparecido);
    ModelAndView mv = new ModelAndView("informacoes");
    mv.addObject("desaparecido", desaparecido);
    return mv;
}

}


