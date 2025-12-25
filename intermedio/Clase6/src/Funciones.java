
// Encapsulamiento

public class Funciones {

    //encapsulamiento
   private  int kilos;
   private int llenadoCompleto;
   private int tipoDeRopa;
   private int LavadoCompleto;
   private int secadoCompleto;
    
   //publico
   public Funciones(int kilos, int TipoRopa){
        this.kilos=kilos;
        this.tipoDeRopa=TipoRopa;

    }

    private void Llenado(){
        if(kilos<=12){
            llenadoCompleto=1;
            System.out.println("Agregando ropa...");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga de ropa sobrepasa lo permitido , el limite son 12 kilos");
        }
    }

    private void Lavado(){
        Llenado();
        if (llenadoCompleto==1) {
            if(tipoDeRopa==1){
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando la ropa...");
                LavadoCompleto=1;
            }else if(tipoDeRopa==2){
                System.out.println("Ropa de color / lavado fuerte");
                System.out.println("Lavando la ropa...");
                LavadoCompleto=1;
            }else{
                System.out.println("Tipo de ropa invalida");
            }
        }
    }

    private void Secado(){
        Lavado();
        if (LavadoCompleto==1) {
            System.out.println("Secando la ropa...");
            secadoCompleto=1;
        }
    }

    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto==1){
        }
        System.out.println("La ropa esta lista... (*-*)   ");
    }


    //Getter y Setter

    public  int getTipoDeRopa(){
        
    }
}