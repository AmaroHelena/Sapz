package Sapz.Sagsa.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Escola;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
    // Busca escola pelo código da unidade
    Optional<Escola> findByCodigoUnidade(String codigoUnidade);
}
