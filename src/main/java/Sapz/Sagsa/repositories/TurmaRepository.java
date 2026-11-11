package Sapz.Sagsa.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    // Lista turmas filtradas pela escola
    List<Turma> findByEscola_Id(Long id);
    
    // Lista turmas de um determinado plano de curso
    List<Turma> findByPlanoCurso_Id(Long id);
}