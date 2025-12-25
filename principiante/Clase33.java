// interfaces graficas swing JFrame JTextArea JButton parse
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextArea txtArea;
    private JLabel lblResultado;

    public Formulario() {
        setLayout(null);
        setTitle("Suma con JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        JLabel lblInstruccion = new JLabel("Ingrese dos números (uno por línea):");
        lblInstruccion.setBounds(40, 20, 300, 25);
        add(lblInstruccion);

        //  TEXTAREA + SCROLL
        txtArea = new JTextArea();
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(40, 50, 300, 100);
        add(scrollPane);

        //  RESULTADO
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(40, 210, 300, 25);
        add(lblResultado);

        //  BOTÓN
        JButton btnResultado = new JButton("Resultado");
        btnResultado.setBounds(120, 160, 140, 30);
        add(btnResultado);

        //  EVENTO
        btnResultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener texto
                    String texto = txtArea.getText();

                    // Separar líneas
                    String[] lineas = texto.split("\n");

                    // Convertir con parse
                    int num1 = Integer.parseInt(lineas[0].trim());
                    int num2 = Integer.parseInt(lineas[1].trim());

                    int suma = num1 + num2;

                    lblResultado.setText("Resultado: " + suma);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Ingresa dos números válidos (uno por línea)",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
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
