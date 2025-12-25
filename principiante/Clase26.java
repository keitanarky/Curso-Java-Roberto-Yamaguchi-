// interfaces graficas swing JFrame JLabel
import javax.swing.*;

public class Formulario extends JFrame {

    public Formulario() {
        setLayout(null);
        setTitle("Mi formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETAS
        JLabel lblTitulo = new JLabel("Formulario de Usuario");
        lblTitulo.setBounds(90, 20, 200, 30);
        add(lblTitulo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(40, 80, 100, 25);
        add(lblNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(40, 120, 100, 25);
        add(lblApellido);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(40, 160, 100, 25);
        add(lblCorreo);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(40, 200, 100, 25);
        add(lblTelefono);

        setVisible(true);
    }

    // String[] args;   == forma moderna y recomendada
    // String args[];   == forma antigua (heredada de C/C++)
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 550);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
