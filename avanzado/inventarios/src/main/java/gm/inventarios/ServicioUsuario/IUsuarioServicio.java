package gm.inventarios.ServicioUsuario;
import gm.inventarios.modelo.Producto;
import gm.inventarios.modelo.Usuario;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUsuarioServicio {
    Usuario log(String usuario, String password);
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorId(Integer idEmpleado);
    Usuario guardar(Usuario usuario);
    void eliminar(Integer idproducto);
}