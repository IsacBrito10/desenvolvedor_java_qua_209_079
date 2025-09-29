package com.projeto.app.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.app.models.Desaparecido;
import com.projeto.app.repository.AppRepository;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    //INÍCIO
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    // CADASTRAR
    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    public String cadastrar(){
        return "cadastrar";
    }

    // SAVE CADASTRO
    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    public String cadastrar(Desaparecido desaparecido){
        csr.save(desaparecido);
        return "redirect:/";
    }

    // LISTA
    @RequestMapping(value="/lista", method=RequestMethod.GET)
    public ModelAndView lista(){
        ModelAndView mv = new ModelAndView("lista");
        Iterable<Desaparecido> desaparecidos = csr.findAll();
        mv.addObject("desaparecidos", desaparecidos);
        return mv;
    }

    //MAIS INFORMAÇÕES
    @RequestMapping(value="/informacoes/{idDesaparecido}", method=RequestMethod.GET)
    public ModelAndView informacoes(@PathVariable("idDesaparecido") long idDesaparecido){
        Desaparecido desaparecido = csr.findByIdDesaparecido(idDesaparecido);
        ModelAndView mv = new ModelAndView("informacoes");
        mv.addObject("desaparecido", desaparecido);
        return mv;
    }

    //ALTERAR GET
    @RequestMapping(value="/alterar/{idDesaparecido}", method=RequestMethod.GET)
    public ModelAndView alterar(@PathVariable("idDesaparecido") long idDesaparecido){
        Desaparecido desaparecido = csr.findByIdDesaparecido(idDesaparecido);
        ModelAndView mv = new ModelAndView("alterar");
        mv.addObject("desaparecido", desaparecido);
        return mv;
    }

    //ALTERAR POST
    @RequestMapping(value="/alterar/{idDesaparecido}", method=RequestMethod.POST)
    public String alterar(@Validated Desaparecido desaparecido, BindingResult result, RedirectAttributes attributes){
        csr.save(desaparecido);
        return "redirect:/informacoes/{idDesaparecido}";
    }

    @PostMapping("../excluir/{idDesaparecido}")
    public String excluirDesaparecido(@PathVariable long idDesaparecido){
        csr.deleteByIdDesaparecido(idDesaparecido);
        return "redirect:/lista";
    }
    }



