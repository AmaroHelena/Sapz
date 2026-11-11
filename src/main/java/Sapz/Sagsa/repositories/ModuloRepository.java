package Sapz.Sagsa.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long> {
    // Traz todos os módulos de um Plano de Curso
    List<Modulo> findByPlanoCurso_Id(Long id);
}