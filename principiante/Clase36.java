Clase35.java// interfaces graficas swing JFrame JMenuBar JMenu JMenuItem
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioMenu extends JFrame {

    private JLabel lblMensaje;

    public FormularioMenu() {
        setLayout(null);
        setTitle("Menú con Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        lblMensaje = new JLabel("Selecciona una opción del menú");
        lblMensaje.setBounds(40, 60, 300, 25);
        add(lblMensaje);

        //  BARRA DE MENÚ
        JMenuBar barraMenu = new JMenuBar();

        //  MENÚ ARCHIVO
        JMenu menuArchivo = new JMenu("Archivo");

        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemSalir = new JMenuItem("Salir");

        menuArchivo.add(itemNuevo);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        //  MENÚ AYUDA
        JMenu menuAyuda = new JMenu("Ayuda");

        JMenuItem itemAcerca = new JMenuItem("Acerca de");
        menuAyuda.add(itemAcerca);

        //  AGREGAR MENÚS A LA BARRA
        barraMenu.add(menuArchivo);
        barraMenu.add(menuAyuda);

        //  ASIGNAR BARRA AL FRAME
        setJMenuBar(barraMenu);

        //  EVENTOS
        itemNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Opción: Nuevo");
            }
        });

        itemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        itemAcerca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Aplicación Swing\nVersión 1.0",
                        "Acerca de",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioMenu formulario = new FormularioMenu();
        formulario.setBounds(0, 0, 400, 250);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
