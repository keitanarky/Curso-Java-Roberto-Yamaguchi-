// interfaces graficas swing JFrame JComboBox JTextField JButton
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextField txtNum1, txtNum2;
    private JLabel lblResultado;
    private JComboBox<String> comboOperacion;

    public Formulario() {
        setLayout(null);
        setTitle("Ejemplo con JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETAS
        JLabel lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(40, 30, 100, 25);
        add(lblNum1);

        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(40, 70, 100, 25);
        add(lblNum2);

        JLabel lblOperacion = new JLabel("Operación:");
        lblOperacion.setBounds(40, 110, 100, 25);
        add(lblOperacion);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(40, 210, 300, 25);
        add(lblResultado);

        //  TEXTFIELD
        txtNum1 = new JTextField();
        txtNum1.setBounds(140, 30, 200, 25);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(140, 70, 200, 25);
        add(txtNum2);

        //  COMBOBOX
        comboOperacion = new JComboBox<>();
        comboOperacion.addItem("Sumar");
        comboOperacion.addItem("Restar");
        comboOperacion.addItem("Multiplicar");
        comboOperacion.addItem("Dividir");
        comboOperacion.setBounds(140, 110, 200, 25);
        add(comboOperacion);

        //  BOTÓN
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 160, 140, 30);
        add(btnCalcular);

        //  EVENTO
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtNum1.getText());
                    double n2 = Double.parseDouble(txtNum2.getText());
                    String operacion = comboOperacion.getSelectedItem().toString();
                    double resultado = 0;

                    switch (operacion) {
                        case "Sumar":
                            resultado = n1 + n2;
                            break;
                        case "Restar":
                            resultado = n1 - n2;
                            break;
                        case "Multiplicar":
                            resultado = n1 * n2;
                            break;
                        case "Dividir":
                            if (n2 == 0) {
                                throw new ArithmeticException("No se puede dividir entre cero");
                            }
                            resultado = n1 / n2;
                            break;
                    }

                    lblResultado.setText("Resultado: " + resultado);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Ingresa valores válidos",
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
        formulario1.setBounds(0, 0, 420, 300);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
