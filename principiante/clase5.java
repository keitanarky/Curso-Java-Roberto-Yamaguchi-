//En esta clase veremos operadores Aritmeticos
//        suma,resta,divicion,divicion
//
//nota importante  existen prioridades para realizar las operaciones dentro de java
//
//la prioridad es
//parentesis ( multiplicaciones)
//    potencias (^) <--- circunflejo  simbolo de potencia  alt+94
//
//multiplicacion(*) y divicion(/)
//suma(+) y resta(-) el programa les dara prioridad en este orden


public  class Clase5 {
    public  static  void main(String[] args) {
      int numero1=4;
      int numero2=4;
      int resultado=0;


      //aqui se pensaria que 4 + 4 = 8  y despues se divide entre 2
        // al tener la divicion el programa primero resuelve primero la divicion
//        quedando el codigo asi
//                4 + 4/2    siento 4 + 2
      resultado=numero1 + numero2 /2;

      //imprimimos un mensaje dando el resultado seguido de un + terminando las comillas doblres
        //esto se llama  concatenar

        //en pantalla estariamos viendo El resultado es: 6
      System.out.println("El resultado es: "+ resultado);

        //misma operacion ahora mostrando un ejemplo con parentesis
//        de esta manera se resuelve primero la suma y luedo la divicion ,
//                asi estariamos mirando en pantalla como resultado 4
//            y no un 6
        //primero se resolvio lo que habia dentro de los parentesis
        resultado=(numero1 + numero2) /2;
        System.out.println("El resultado es: "+ resultado);
    }


}