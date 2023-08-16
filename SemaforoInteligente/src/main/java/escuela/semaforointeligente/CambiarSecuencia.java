
package escuela.semaforointeligente;

import java.util.Scanner;

public class CambiarSecuencia extends Semaforo{
    Scanner entrada = new Scanner(System.in);
    int secuencia;
    
    public CambiarSecuencia(boolean v, boolean a, boolean r, int s){
        super(v,a,r);
        this.secuencia=s;
    }
    public void preguntarSecuencia(){
        System.out.println("Seleccione la secuencia: ");
        System.out.println("1. Intermitentes");
        System.out.println("2. Rojo");
        System.out.println("3. Siga");
        secuencia = entrada.nextInt();
    }
    public void cambiarSecuencia(){
        if (secuencia == 1) {
            verde=false;
            amarrillo=true;
            rojo=false;
            System.out.println("Secuencia de intermitentes");
            System.out.println("Verde: "+verde);
           System.out.println("Amarrilo: "+amarrillo);
           System.out.println("Rojo: "+rojo);
        } else if (secuencia == 2) {
            verde=false;
            amarrillo=false;
            rojo=true;
            System.out.println("Secuencia de alto");
            System.out.println("Verde: "+verde);
           System.out.println("Amarrilo: "+amarrillo);
           System.out.println("Rojo: "+rojo);
        } else if (secuencia == 3) {
            verde=true;
            amarrillo=false;
            rojo=false;
            System.out.println("Secuencia de siga");
            System.out.println("Verde: "+verde);
           System.out.println("Amarrilo: "+amarrillo);
           System.out.println("Rojo: "+rojo);
        } else {
            System.out.println("Opción inválida.");
        }
    }
}

