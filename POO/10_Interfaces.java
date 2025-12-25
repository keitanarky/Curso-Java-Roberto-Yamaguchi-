//10. Interfaces
//
//Contratos de métodos.

public interface Pago {
    void procesarPago(double cantidad);
}


public class Paypal implements Pago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago realizado con PayPal: " + cantidad);
    }
}