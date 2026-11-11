package Sapz.Sagsa.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Sapz.Sagsa.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Busca um usuário pelo e-mail (útil para o login/autenticação)
    Optional<Usuario> findByEmail(String email);

    // Retorna todos os usuários de um determinado perfil
    List<Usuario> findByPerfil_Id(Long id);
}