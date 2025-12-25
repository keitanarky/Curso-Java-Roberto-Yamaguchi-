// interfaces graficas swing JFrame JButton JTextArea
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextArea txtArea;
    private JLabel lblEstado;

    public Formulario() {
        setLayout(null);
        setTitle("Formulario con JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        JLabel lblComentario = new JLabel("Comentario:");
        lblComentario.setBounds(40, 30, 100, 25);
        add(lblComentario);

        lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(40, 260, 300, 25);
        add(lblEstado);

        //  TEXTAREA
        txtArea = new JTextArea();
        txtArea.setBounds(40, 60, 300, 120);
        txtArea.setLineWrap(true);       // salto de línea automático
        txtArea.setWrapStyleWord(true);  // no corta palabras
        add(txtArea);

        //  BOTONES
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(40, 200, 120, 30);
        add(btnMostrar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(220, 200, 120, 30);
        add(btnLimpiar);

        //  EVENTOS
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = txtArea.getText();

                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El área de texto está vacía",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    lblEstado.setText("Texto ingresado:");
                    JOptionPane.showMessageDialog(null, texto);
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                lblEstado.setText("Estado:");
                txtArea.requestFocus();
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
