package com.projeto.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.app.models.Desaparecido;
import com.projeto.app.repository.AppRepository;

import org.springframework.transaction.annotation.Transactional;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    // INÍCIO
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // CADASTRAR
    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public String cadastrar() {
        return "cadastrar";
    }

    // SAVE CADASTRO + IMG
    // IMG
    @PostMapping("/cadastrar")
    public String cadastrarSubmit(@ModelAttribute Desaparecido desaparecido, @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] fotoBytes = file.getBytes();
                desaparecido.setFoto(fotoBytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        csr.save(desaparecido);
        return "redirect:/";
    }

    @GetMapping("/imagem/{idDesaparecido}")
    public ResponseEntity<byte[]> exibirImagemJpeg(@PathVariable Long idDesaparecido) {
        Desaparecido desaparecido = csr.findByIdDesaparecido(idDesaparecido);
        if (desaparecido != null && desaparecido.getFoto() != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .contentType(MediaType.IMAGE_PNG)
                    .body(desaparecido.getFoto());
        }
        return ResponseEntity.notFound().build();
    }

    // LISTA
    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public ModelAndView lista() {
        ModelAndView mv = new ModelAndView("lista");
        Iterable<Desaparecido> desaparecidos = csr.findAll();
        mv.addObject("desaparecidos", desaparecidos);
        return mv;
    }

    // MAIS INFORMAÇÕES
    @RequestMapping(value = "/informacoes/{idDesaparecido}", method = RequestMethod.GET)
    public ModelAndView informacoes(@PathVariable("idDesaparecido") long idDesaparecido) {
        Desaparecido desaparecido = csr.findByIdDesaparecido(idDesaparecido);
        ModelAndView mv = new ModelAndView("informacoes");
        mv.addObject("desaparecido", desaparecido);
        return mv;
    }

    // ALTERAR GET
    @RequestMapping(value = "/alterar/{idDesaparecido}", method = RequestMethod.GET)
    public ModelAndView alterar(@PathVariable("idDesaparecido") long idDesaparecido) {
        Desaparecido desaparecido = csr.findByIdDesaparecido(idDesaparecido);
        ModelAndView mv = new ModelAndView("alterar");
        mv.addObject("desaparecido", desaparecido);
        return mv;
    }

    // ALTERAR POST
    @RequestMapping(value = "/alterar/{idDesaparecido}", method = RequestMethod.POST)
    public String alterar(@Validated Desaparecido desaparecido, BindingResult result, RedirectAttributes attributes,
            @RequestParam(value = "file", required = false) MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            try {
                byte[] fotoBytes = file.getBytes();
                desaparecido.setFoto(fotoBytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Desaparecido antigo = csr.findByIdDesaparecido(desaparecido.getIdDesaparecido());
            desaparecido.setFoto(antigo.getFoto());
        }
        csr.save(desaparecido);
        return "redirect:/informacoes/" + desaparecido.getIdDesaparecido();
    }

    @PostMapping("/excluir/{idDesaparecido}")
    @Transactional
    public String excluir(@PathVariable Long idDesaparecido) {
        csr.deleteByIdDesaparecido(idDesaparecido);
        return "redirect:/lista";
    }

    @GetMapping("/informacoes")
    public ModelAndView pesquisar(@RequestParam("cpf") String cpf) {
        Desaparecido desaparecido = csr.findByCpf(cpf);
        ModelAndView mv = new ModelAndView("informacoes");
        mv.addObject("desaparecido", desaparecido);
        return mv;
    }

}
