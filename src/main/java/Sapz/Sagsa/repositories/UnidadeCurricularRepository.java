package Sapz.Sagsa.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.UnidadeCurricular;

@Repository
public interface UnidadeCurricularRepository extends JpaRepository<UnidadeCurricular, Long> {
    // Traz todas as UCs de um Módulo específico
    List<UnidadeCurricular> findByModulo_Id(Long id);
}