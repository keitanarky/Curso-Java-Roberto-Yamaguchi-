package gm.inventarios.ServicioUsuario;

import  gm.inventarios.Dto.UserDto;
import gm.inventarios.modelo.Usuario;


public interface UserService {
    Usuario findByUsername(String username);

    Usuario save(UserDto userDto);
}
