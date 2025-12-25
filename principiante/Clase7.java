//estructuras condicionales anidadas con if else
//una estructura condicional se convierte anidada
//cuando esta dentro de otra estructura condicional N numero de veces

public class Clase7{
    public static void main(String[] args){
        int operacion =1;
        int numero1=2;
        int numero2=4;
        //nota importante usar = se usa para asignar un valor
        int resultado =0;
        //si fuece ==0  estaria comparando si es igual a 0

        if(operacion==1){
            //realizando una suma
            resultado = numero1+numero2;
            System.out.println("El resultado es: "+resultado);
        }else if (operacion==2){
            //realizando una resta
            resultado = numero1-numero2;
            System.out.println("El resultado es: "+resultado);
        } else if (operacion==3) {
            //realizando una multiplicacion
            resultado = numero1*numero2;
            System.out.println("El resultado es: "+resultado);
        } else if (operacion==4) {
            //realizando una resta
            resultado = numero1/numero2;
            System.out.println("El resultado es: "+resultado);
        }else {
            System.out.println("La operacion seleccionada no es valida ");
        }
    }
}
