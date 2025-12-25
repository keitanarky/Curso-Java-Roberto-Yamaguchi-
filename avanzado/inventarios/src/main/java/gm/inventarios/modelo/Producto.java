package gm.inventarios.modelo;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "producto") // debe coincidir con la tabla real
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto") // coincide con tu columna PK
    private Integer idproducto;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "existencia")
    private Integer existencia;

    // Getters y Setters
    public Integer getIdproducto() { return idproducto; }
    public void setIdproducto(Integer idproducto) { this.idproducto = idproducto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getExistencia() { return existencia; }
    public void setExistencia(Integer existencia) { this.existencia = existencia; }

    @Override
    public String toString() {
        return "Producto [id=" + idproducto + ", descripcion=" + descripcion + ", precio=" + precio + ", existencia=" + existencia + "]";
    }
}
