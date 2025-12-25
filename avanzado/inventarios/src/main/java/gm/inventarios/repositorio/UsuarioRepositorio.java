package gm.inventarios.repositorio;
import gm.inventarios.Dto.UserDto;
import gm.inventarios.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UsuarioRepositorio extends
        JpaRepository<Usuario, Integer> {

    // Método que busca usuario por usuario y password
    Optional<Usuario> findByUsuarioAndPassword(String usuario, String password);



}

