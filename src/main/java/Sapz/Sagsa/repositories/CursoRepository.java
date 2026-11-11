package Sapz.Sagsa.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    // Lista todos os cursos pertencentes a uma área tecnológica
    List<Curso> findByAreaTecnologica_Id(Long id);
}