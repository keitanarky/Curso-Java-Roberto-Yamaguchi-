    package gm.inventarios.controlador;
    import gm.inventarios.ServicioUsuario.UsuarioServicio;
    import gm.inventarios.modelo.LoginRequest;
    import gm.inventarios.modelo.Usuario;
    import gm.inventarios.repositorio.AuthRepositorio;
    import gm.inventarios.repositorio.UsuarioRepositorio;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;
    import java.util.NoSuchElementException;
    import java.util.Optional;

    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api")
    @CrossOrigin(origins = "http://localhost:4200")
    public class UsuarioControlador {

        private final UsuarioServicio usuarioServicio;
        private static final Logger logger = LoggerFactory.getLogger(UsuarioControlador.class);

        @Autowired
        private UsuarioRepositorio usuarioRepositorio;
        @Autowired
        public UsuarioControlador(UsuarioServicio usuarioServicio) {
            this.usuarioServicio = usuarioServicio;
        }

        // ==============================
        //  LISTAR TODOS LOS USUARIOS
        // ==============================
        @GetMapping("")
        public List<Usuario> listarUsuarios() {
            List<Usuario> usuarios = usuarioServicio.listarUsuarios();
            logger.info("Usuarios obtenidos:");
            usuarios.forEach(usuario -> logger.info(usuario.toString()));
            return usuarios;
        }

        @PostMapping("/login")
        public ResponseEntity<?> login(@RequestBody LoginRequest request) {
            Optional<Usuario> usuarioOpt = usuarioRepositorio.findByUsuarioAndPassword(
                    request.getUsuario(),
                    request.getPassword()
            );

            if (usuarioOpt.isPresent()) {
                return ResponseEntity.ok(usuarioOpt.get());
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body("Credenciales incorrectas");
            }
        }















    }