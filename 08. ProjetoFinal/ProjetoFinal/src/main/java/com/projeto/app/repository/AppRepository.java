package com.projeto.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.projeto.app.models.Desaparecido;

public interface AppRepository extends CrudRepository<Desaparecido, String>
{
    Desaparecido findByIdDesaparecido(long idDesaparecido); 
    Desaparecido deleteByIdDesaparecido(long idDesaparecido);
    Desaparecido findByCpf(String cpf);
    Desaparecido findByNome(String nome);
}
