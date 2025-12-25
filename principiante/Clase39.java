// interfaces graficas swing JFrame JButton JCheckBox
import javax.swing.*;
import java.awt.event.*;

public class FormularioTerminos extends JFrame {

    private JCheckBox chkAceptar;
    private JButton btnContinuar;
    private JLabel lblMensaje;

    public FormularioTerminos() {
        setTitle("Términos y Condiciones");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  CHECKBOX
        chkAceptar = new JCheckBox("Acepto los términos y condiciones");
        chkAceptar.setBounds(30, 40, 250, 25);
        add(chkAceptar);

        //  BOTÓN
        btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(80, 80, 140, 30);
        btnContinuar.setEnabled(false); // deshabilitado al inicio
        add(btnContinuar);

        //  MENSAJE
        lblMensaje = new JLabel("");
        lblMensaje.setBounds(40, 120, 300, 25);
        add(lblMensaje);

        //  EVENTO CHECKBOX
        chkAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // habilita o deshabilita el botón
                btnContinuar.setEnabled(chkAceptar.isSelected());
            }
        });

        //  EVENTO BOTÓN
        btnContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Términos aceptados. Continuando...");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioTerminos formulario = new FormularioTerminos();
        formulario.setBounds(0, 0, 350, 220);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
