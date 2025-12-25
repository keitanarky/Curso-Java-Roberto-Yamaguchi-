// interfaces graficas swing JFrame JRadioButton
import javax.swing.*;
import java.awt.event.*;

public class FormularioRadioButton extends JFrame {

    private JRadioButton rbMasculino, rbFemenino, rbOtro;
    private JLabel lblResultado;

    public FormularioRadioButton() {
        setTitle("Ejemplo JRadioButton");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  RADIO BUTTONS
        rbMasculino = new JRadioButton("Masculino");
        rbMasculino.setBounds(40, 40, 120, 25);
        add(rbMasculino);

        rbFemenino = new JRadioButton("Femenino");
        rbFemenino.setBounds(40, 70, 120, 25);
        add(rbFemenino);

        rbOtro = new JRadioButton("Otro");
        rbOtro.setBounds(40, 100, 120, 25);
        add(rbOtro);

        //  AGRUPAR RADIO BUTTONS
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbMasculino);
        grupo.add(rbFemenino);
        grupo.add(rbOtro);

        //  BOTÓN
        JButton btnMostrar = new JButton("Mostrar selección");
        btnMostrar.setBounds(40, 140, 180, 30);
        add(btnMostrar);

        //  ETIQUETA
        lblResultado = new JLabel("Selecciona una opción");
        lblResultado.setBounds(40, 180, 250, 25);
        add(lblResultado);

        //  EVENTO
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rbMasculino.isSelected()) {
                    lblResultado.setText("Seleccionaste: Masculino");
                } else if (rbFemenino.isSelected()) {
                    lblResultado.setText("Seleccionaste: Femenino");
                } else if (rbOtro.isSelected()) {
                    lblResultado.setText("Seleccionaste: Otro");
                } else {
                    lblResultado.setText("No seleccionaste nada");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioRadioButton formulario = new FormularioRadioButton();
        formulario.setBounds(0, 0, 350, 260);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
