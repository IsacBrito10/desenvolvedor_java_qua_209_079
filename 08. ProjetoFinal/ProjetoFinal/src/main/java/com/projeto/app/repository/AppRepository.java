package com.projeto.app.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.projeto.app.models.Desaparecido;

public interface AppRepository extends CrudRepository<Desaparecido, Long>
{
    Optional<Desaparecido> findByIdDesaparecido(Long idDesaparecido);
    Desaparecido deleteByIdDesaparecido(long idDesaparecido);
}
