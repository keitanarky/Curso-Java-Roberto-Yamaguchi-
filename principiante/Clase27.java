// interfaces graficas swing JFrame JButtom
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    public Formulario() {
        setLayout(null);
        setTitle("Mi formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BOTONES
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(50, 80, 120, 30);
        add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200, 80, 120, 30);
        add(btnCancelar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(50, 140, 120, 30);
        add(btnLimpiar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(200, 140, 120, 30);
        add(btnSalir);

        // EVENTOS
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Formulario limpio");
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // String[] args;   == forma moderna y recomendada
    // String args[];   == forma antigua (heredada de C/C++)
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 550);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
