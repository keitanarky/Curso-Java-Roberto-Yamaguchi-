// interfaces graficas swing JFrame JButton JScrollPane
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextArea txtArea;
    private JLabel lblEstado;

    public Formulario() {
        setLayout(null);
        setTitle("Formulario con JScrollPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        JLabel lblComentario = new JLabel("Comentario:");
        lblComentario.setBounds(40, 20, 100, 25);
        add(lblComentario);

        lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(40, 300, 300, 25);
        add(lblEstado);

        //  TEXTAREA
        txtArea = new JTextArea();
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);

        //  SCROLLPANE
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(40, 50, 300, 200);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        );
        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
        add(scrollPane);

        //  BOTONES
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(40, 260, 120, 30);
        add(btnMostrar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(220, 260, 120, 30);
        add(btnLimpiar);

        //  EVENTOS
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = txtArea.getText();

                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "No hay texto para mostrar",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    lblEstado.setText("Texto mostrado correctamente");
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
        formulario1.setBounds(0, 0, 400, 380);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
