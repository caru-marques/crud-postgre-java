package br.com.crud.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.crud.models.Cadastro;
import br.com.crud.crud.repositories.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
public class UserController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @PostMapping("/")
    public Cadastro cadastro(@RequestBody Cadastro cadastro) {
        return this.cadastroRepository.save(cadastro);
    }
    
    @GetMapping("/lista")
    public List<Cadastro> lista() {
        return this.cadastroRepository.findAll();
    }
}
