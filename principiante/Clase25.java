//interfaces graficas swing JFrame
import javax.swing.*;

public class Formulario extends JFrame{

    public Formulario() {
        setLayout(null);
       // setSize(400, 300);
        setTitle("Mi formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


   // String[] args;   == forma moderna y recomendada
   // String args[];   == forma antigua (heredada de C/C++)
    public static void main(String[] args){
        Formulario  formulario1 = new Formulario();
        formulario1.setBounds(0,0,400,550);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);


//fin de la clase
    }
}