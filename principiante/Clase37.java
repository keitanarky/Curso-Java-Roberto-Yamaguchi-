// interfaces graficas swing JFrame JMenuBar JMenu JMenuItem Submenu
import javax.swing.*;
import java.awt.event.*;

public class FormularioSubmenu extends JFrame {

    private JLabel lblMensaje;

    public FormularioSubmenu() {
        setTitle("Menú con Submenús");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  ETIQUETA
        lblMensaje = new JLabel("Selecciona una opción del menú");
        lblMensaje.setBounds(40, 60, 300, 25);
        add(lblMensaje);

        //  BARRA DE MENÚ
        JMenuBar barraMenu = new JMenuBar();

        //  MENÚ PRINCIPAL
        JMenu menuArchivo = new JMenu("Archivo");

        //  SUBMENÚ NUEVO
        JMenu submenuNuevo = new JMenu("Nuevo");

        JMenuItem itemTexto = new JMenuItem("Documento de texto");
        JMenuItem itemProyecto = new JMenuItem("Proyecto");

        submenuNuevo.add(itemTexto);
        submenuNuevo.add(itemProyecto);

        //  OPCIONES DEL MENÚ ARCHIVO
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemSalir = new JMenuItem("Salir");

        menuArchivo.add(submenuNuevo); // submenú dentro del menú
        menuArchivo.add(itemAbrir);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        //  MENÚ AYUDA
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcerca = new JMenuItem("Acerca de");
        menuAyuda.add(itemAcerca);

        //  AGREGAR MENÚS A LA BARRA
        barraMenu.add(menuArchivo);
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        //  EVENTOS
        itemTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Nuevo documento de texto");
            }
        });

        itemProyecto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Nuevo proyecto");
            }
        });

        itemAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("Abrir archivo");
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
                        "Ejemplo de Submenús\nSwing",
                        "Acerca de",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        FormularioSubmenu formulario = new FormularioSubmenu();
        formulario.setBounds(0, 0, 450, 250);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
