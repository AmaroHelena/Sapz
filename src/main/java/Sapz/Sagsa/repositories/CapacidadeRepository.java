package Sapz.Sagsa.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Capacidade;

@Repository
public interface CapacidadeRepository extends JpaRepository<Capacidade, Long> {
    // Traz as capacidades vinculadas a uma Unidade Curricular
    List<Capacidade> findByUnidadeCurricular_Id(Long id);
}