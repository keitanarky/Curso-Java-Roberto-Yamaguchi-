// interfaces graficas swing JFrame
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    // Etiqueta global (para poder modificarla desde los botones)
    private JLabel lblMensaje;

    public Formulario() {
        setLayout(null);
        setTitle("Formulario con Botones y Etiquetas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ETIQUETA
        lblMensaje = new JLabel("Esperando acción...");
        lblMensaje.setBounds(100, 40, 200, 30);
        add(lblMensaje);

        //  BOTONES
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 100, 120, 30);
        add(btnAceptar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200, 100, 120, 30);
        add(btnCancelar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(50, 160, 120, 30);
        add(btnLimpiar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(200, 160, 120, 30);
        add(btnSalir);

        //  MANEJO DE EVENTOS
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Botón Aceptar presionado");
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Operación cancelada");
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Esperando acción...");
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
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
