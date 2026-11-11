package Sapz.Sagsa.repositories;


   

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.AreaTecnologica;

@Repository
public interface AreaTecnologicaRepository extends JpaRepository<AreaTecnologica, Long> {
    // Lista todas as áreas tecnológicas de um determinado Eixo
    List<AreaTecnologica> findByEixoTecnologico_Id(Long id);
}

