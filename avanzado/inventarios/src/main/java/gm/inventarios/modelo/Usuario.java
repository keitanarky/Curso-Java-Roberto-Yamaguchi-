    package gm.inventarios.modelo;
    import jakarta.persistence.*;
    import lombok.Data;


    @Entity
    @Data
    @Table(name = "usuario")
    public class Usuario {
            @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            @Column(name = "idEmpleado")
            private Integer idEmpleado;

            @Column(nullable = false, length = 50)
            private String usuario;

            @Column(nullable = false, length = 100)
            private String password;


        public Integer getIdEmpleado() {
            return idEmpleado;
        }

        public void setIdEmpleado(Integer idEmpleado) {
            this.idEmpleado = idEmpleado;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User [id=" + idEmpleado + ", username=" + usuario + ", password=" + password ;
        }
    }
