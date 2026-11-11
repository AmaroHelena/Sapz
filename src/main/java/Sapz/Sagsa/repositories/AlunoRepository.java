package Sapz.Sagsa.repositories;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Buscas exatas por chaves únicas do aluno
    Optional<Aluno> findByCpf(String cpf);
    Optional<Aluno> findByMatricula(String matricula);
}