//3. Encapsulamiento (Getters y Setters)
//Encapsulamiento (Getters y Setters)

//El encapsulamiento es un principio de POO que consiste en proteger los datos sensibles de una clase para evitar que se modifiquen de manera incorrecta desde fuera.
//
//        En Java, esto se logra usando:
//
//Atributos privados (private)
//
//Métodos públicos (getters y setters)

//Protege los atributos de acceso incorrecto.


public class CuentaBancaria {

    //private double saldo
    //Nadie fuera de esta clase puede cambiar el saldo directamente
    //evita errores como cuenta.saldo-99999;  no permitido
    private double saldo;

//El getter permite leer el saldo, pero no modificarlo.
    public double getSaldo() {
        return saldo;
    }

    //esto es el algoritmo con la logica matematica para realizar un deposito o sumarle o restarle
    //dependiendo si fuere retirar entonces se comprobaria si hay saldo sufiente y restarlo de la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }


    //uso real

    //SE CREA LA CUENTA CON SALDO INICIAL 0
    CuentaBancaria cuenta = new CuentaBancaria();


cuenta.depositar(500);

//se pide el saldo mediante el getter
System.out.println(cuenta.getSaldo());
}