// interfaces graficas swing JFrame JButton RGB
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioRGB extends JFrame {

    private JPanel panelColor;
    private JLabel lblColor;

    public FormularioRGB() {
        setLayout(null);
        setTitle("Botones RGB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  PANEL DE COLOR
        panelColor = new JPanel();
        panelColor.setBounds(40, 30, 300, 120);
        panelColor.setBackground(Color.LIGHT_GRAY);
        add(panelColor);

        //  ETIQUETA
        lblColor = new JLabel("Color actual: Gris");
        lblColor.setBounds(40, 160, 300, 25);
        add(lblColor);

        //  BOTONES RGB
        JButton btnRojo = new JButton("Rojo");
        btnRojo.setBounds(40, 210, 80, 30);
        add(btnRojo);

        JButton btnVerde = new JButton("Verde");
        btnVerde.setBounds(150, 210, 80, 30);
        add(btnVerde);

        JButton btnAzul = new JButton("Azul");
        btnAzul.setBounds(260, 210, 80, 30);
        add(btnAzul);

        //  EVENTOS
        btnRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.RED);
                lblColor.setText("Color actual: Rojo");
            }
        });

        btnVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.GREEN);
                lblColor.setText("Color actual: Verde");
            }
        });

        btnAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.BLUE);
                lblColor.setText("Color actual: Azul");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioRGB formulario = new FormularioRGB();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
