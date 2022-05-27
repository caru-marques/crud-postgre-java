package br.com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.crud.models.Cadastro;

public interface CadastroRepository extends JpaRepository <Cadastro, Integer>{
    

}
