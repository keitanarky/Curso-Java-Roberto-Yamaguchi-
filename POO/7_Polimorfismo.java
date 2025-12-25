//7. Polimorfismo

//Un objeto hijo puede comportarse como su clase padre.

//El polimorfismo permite que diferentes clases hijas se comporten de manera distinta usando el mismo método.

//En pocas palabras:

//Un mismo método, diferentes comportamientos.
public class Animal {
    public void comer() {
        System.out.println("El animal come");
    }
}


public class Perro extends Animal {
    public void ladrar() {
        System.out.println("Guau guau");
    }

    Animal a = new Perro(); // Polimorfismo
    a.comer();



    //ejemplo polimorfismo usando metodos de pago
    //Interface o clase padre (contrato)
    public interface MetodoPago {
        void procesarPago(double cantidad);



        //Esto solo dice:
        //"Toda clase que sea un método de pago debe tener un método llamado procesarPago".
    }

    //Clases hijas (cada una implementa el método a su manera)

    //hereda procesar pago de metodo_pago
    public class PagoEfectivo implements MetodoPago {
        @Override
        public void procesarPago(double cantidad) {
            System.out.println("Pago en efectivo de $" + cantidad);
        }
    }

    //hereda procesar pago de metodo_pago
    public class PagoTarjeta implements MetodoPago {
        @Override
        public void procesarPago(double cantidad) {
            System.out.println("Procesando pago con tarjeta por $" + cantidad);
        }
    }

    //hereda procesar pago de metodo_pago
    public class PagoPaypal implements MetodoPago {
        @Override
        public void procesarPago(double cantidad) {
            System.out.println("Pago con PayPal por $" + cantidad);
        }
    }

    //usando el polimorfismo
    public class Tienda {
        public static void main(String[] args) {

            MetodoPago pago;

            pago = new PagoEfectivo();
            pago.procesarPago(200);

            pago = new PagoTarjeta();
            pago.procesarPago(200);

            pago = new PagoPaypal();
            pago.procesarPago(200);
        }
    }

}