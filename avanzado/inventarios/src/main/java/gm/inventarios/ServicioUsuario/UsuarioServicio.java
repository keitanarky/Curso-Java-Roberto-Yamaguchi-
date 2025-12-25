package gm.inventarios.ServicioUsuario;

import gm.inventarios.modelo.Usuario;
import gm.inventarios.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import gm.inventarios.Dto.UserDto;


@Service
@Transactional
public class UsuarioServicio implements IUsuarioServicio {

    private  UsuarioServicio usuarioServicio;

    private final UsuarioRepositorio usuarioRepositorio;
    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario log(String usuario, String password) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idEmpleado) {
        return usuarioRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminar(Integer idEmpleado) {
        if (!usuarioRepositorio.existsById(idEmpleado)) {
            throw new NoSuchElementException("No existe usuario con idEmpleado " + idEmpleado);
        }
        usuarioRepositorio.deleteById(idEmpleado);
    }







}
