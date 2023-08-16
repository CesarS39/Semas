package escuela.semaforointeligente;
import java.util.Scanner;
public class Emergencia extends Semaforo{
    Scanner entrada = new Scanner(System.in);
    int x;
    int emer;
    
    public Emergencia(boolean v, boolean a, boolean r, int  e){
        super(v,a,r);
        this.emer=e;
    }
    public void consultarEmergencia(){
        System.out.println("Hay una emergencia 1)si 2)no ");
        emer=entrada.nextInt();
    }
    public void secuenciaEmergencia(){
        if(x==1){
          verde=true;
          amarrillo=false;
          rojo=false;
           System.out.println("Verde: "+verde);
           System.out.println("Amarrilo: "+amarrillo);
           System.out.println("Rojo: "+rojo);
       }
       else{
           System.out.println("No hay Una emergencia");
       }
    }
}
