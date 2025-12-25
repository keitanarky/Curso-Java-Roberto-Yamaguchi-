// interfaces graficas swing JFrame JCheckBox
import javax.swing.*;
import java.awt.event.*;

public class FormularioCheckBox extends JFrame {

    private JCheckBox chkJava, chkPython, chkSQL;
    private JLabel lblResultado;

    public FormularioCheckBox() {
        setTitle("Ejemplo JCheckBox");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  CHECKBOX
        chkJava = new JCheckBox("Java");
        chkJava.setBounds(40, 40, 100, 25);
        add(chkJava);

        chkPython = new JCheckBox("Python");
        chkPython.setBounds(40, 70, 100, 25);
        add(chkPython);

        chkSQL = new JCheckBox("SQL");
        chkSQL.setBounds(40, 100, 100, 25);
        add(chkSQL);

        //  BOTÓN
        JButton btnMostrar = new JButton("Mostrar selección");
        btnMostrar.setBounds(40, 140, 180, 30);
        add(btnMostrar);

        //  ETIQUETA
        lblResultado = new JLabel("Selecciona opciones");
        lblResultado.setBounds(40, 180, 300, 25);
        add(lblResultado);

        //  EVENTO
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultado = "Seleccionado: ";

                if (chkJava.isSelected()) {
                    resultado += "Java ";
                }
                if (chkPython.isSelected()) {
                    resultado += "Python ";
                }
                if (chkSQL.isSelected()) {
                    resultado += "SQL ";
                }

                if (!chkJava.isSelected() && !chkPython.isSelected() && !chkSQL.isSelected()) {
                    resultado = "No seleccionaste nada";
                }

                lblResultado.setText(resultado);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioCheckBox formulario = new FormularioCheckBox();
        formulario.setBounds(0, 0, 350, 280);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
