package Sapz.Sagsa.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.PlanoCurso;

@Repository
public interface PlanoCursoRepository extends JpaRepository<PlanoCurso, Long> {
    // Lista todos os planos de curso de um curso específico
    List<PlanoCurso> findByCurso_Id(Long id);
}
