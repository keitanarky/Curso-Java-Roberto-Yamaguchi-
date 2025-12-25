package gm.inventarios.Servicio;

import gm.inventarios.modelo.LoginRequest;
import gm.inventarios.modelo.Usuario;
import gm.inventarios.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import gm.inventarios.repositorio.AuthRepositorio;

import java.util.Optional;

@Service
@Transactional
public class AuthServicio {
    @Autowired
    private AuthRepositorio authRepositorio;

    public Optional<Usuario> login(String usuario, String password) {
        return authRepositorio.findByUsuarioAndPassword(usuario, password);
    }
}



