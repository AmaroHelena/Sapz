package Sapz.Sagsa.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    // Busca um perfil pelo nome exato (ex: "ADMINISTRADOR")
    Optional<Perfil> findByNome(String nome);
}
