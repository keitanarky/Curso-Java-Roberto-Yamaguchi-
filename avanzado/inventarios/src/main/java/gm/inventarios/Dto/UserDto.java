package gm.inventarios.Dto;

public class UserDto {
    private String usuario;
    private String password;

    // Constructor vacío (necesario para Spring)
    public UserDto() {}

    // Constructor con parámetros
    public UserDto(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    // Getters y Setters
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
}
