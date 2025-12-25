package Clase20;

public class MySQL {

}



//1 ¿Qué es JDBC?

/* JDBC (Java DataBase Connectivity) permite a Java conectarse y trabajar con bases de datos.

Arquitectura básica:

Java → JDBC → Driver → Base de datos




//2️ Dependencia / Driver MySQL
 MySQL Connector

Descárgalo o agrégalo con Maven:

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
</dependency>

//3  Base de datos de ejemplo
CREATE DATABASE escuela;
USE escuela;

CREATE TABLE alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT
);

//4 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL =
        "jdbc:mysql://localhost:3306/escuela";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}


//5 alta insert
// 
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AltaAlumno {

    public static void main(String[] args) {

        String sql = "INSERT INTO alumnos(nombre, edad) VALUES (?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "Juan");
            ps.setInt(2, 20);

            ps.executeUpdate();
            System.out.println("Alumno agregado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//6️ CONSULTA (SELECT)
import java.sql.*;

public class ConsultaAlumnos {

    public static void main(String[] args) {

        String sql = "SELECT * FROM alumnos";

        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("nombre") + " " +
                    rs.getInt("edad")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//7️ BAJA (DELETE)
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BajaAlumno {

    public static void main(String[] args) {

        String sql = "DELETE FROM alumnos WHERE id = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, 1);
            ps.executeUpdate();

            System.out.println("Alumno eliminado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//8 UPDATE (extra importante)
String sql = "UPDATE alumnos SET edad = ? WHERE id = ?";



//10 Flujo típico en Java
Connection
 ↓
PreparedStatement
 ↓
executeQuery / executeUpdate
 ↓
ResultSet


*/

