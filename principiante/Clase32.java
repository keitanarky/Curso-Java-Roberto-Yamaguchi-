// interfaces graficas swing JFrame JTextField JTextArea
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextField txtEntrada;
    private JTextArea txtArea;

    public Formulario() {
        setLayout(null);
        setTitle("Pasar texto de JTextField a JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        JLabel lblTexto = new JLabel("Texto:");
        lblTexto.setBounds(40, 30, 100, 25);
        add(lblTexto);

        //  TEXTFIELD
        txtEntrada = new JTextField();
        txtEntrada.setBounds(100, 30, 240, 25);
        add(txtEntrada);

        //  TEXTAREA + SCROLL
        txtArea = new JTextArea();
        txtArea.setEditable(false); // solo lectura
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(40, 80, 300, 180);
        add(scrollPane);

        //  BOTONES
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(40, 270, 120, 30);
        add(btnAgregar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(220, 270, 120, 30);
        add(btnLimpiar);

        //  EVENTOS
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = txtEntrada.getText();

                if (!texto.isEmpty()) {
                    txtArea.append(texto + "\n");
                    txtEntrada.setText("");
                    txtEntrada.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Ingresa un texto",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                txtEntrada.setText("");
                txtEntrada.requestFocus();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 360);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
