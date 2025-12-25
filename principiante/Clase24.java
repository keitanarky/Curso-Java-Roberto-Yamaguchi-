// interfaces graficas libreria swing
import javax.swing.*;

public class Formulario extends JFrame {

    private JLabel label1;

    public Formulario() {
        setLayout(null);
        label1 = new JLabel("Mensaje");
        label1.setBounds(10, 20, 200, 300);
        //primer valor 10 eje de las x , 20 eje de las y , 200 ancho , 300 largo
        add(label1);
    }

    public static void main(String[] args){
        Formulario formulario= new Formulario();
        formulario.setBounds(0,0,400,300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
//fin de la clase
    }
}