package Sapz.Sagsa.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.EixoTecnologico;

@Repository
public interface EixoTecnologicoRepository extends JpaRepository<EixoTecnologico, Long> {
    Optional<EixoTecnologico> findByNome(String nome);
}