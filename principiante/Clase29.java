// interfaces graficas swing JFrame JButton JTextField
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextField txtNombre;
    private JLabel lblResultado;

    public Formulario() {
        setLayout(null);
        setTitle("Formulario Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETAS
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(40, 40, 100, 25);
        add(lblNombre);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(40, 220, 300, 25);
        add(lblResultado);

        //  TEXTFIELD
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 40, 200, 25);
        add(txtNombre);

        //  BOTONES
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(40, 100, 120, 30);
        add(btnMostrar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(200, 100, 120, 30);
        add(btnLimpiar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(120, 160, 120, 30);
        add(btnSalir);

        // EVENTOS
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();

                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor ingresa un nombre",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    lblResultado.setText("Hola, " + nombre);
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                lblResultado.setText("Resultado:");
                txtNombre.requestFocus();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 350);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
