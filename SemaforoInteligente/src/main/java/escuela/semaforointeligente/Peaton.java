package escuela.semaforointeligente;
import java.util.Scanner;
public class Peaton extends Semaforo{
    Scanner entrada = new Scanner(System.in);
        int x;
   public Peaton(boolean v, boolean a, boolean r){
        super(v,a,r);
        x=0;
    }
   
   public void cruzar(){
       System.out.println("Desea cruzar? 1)si 2) no");
       x=entrada.nextInt();
       if(x==1){
          verde=false;
          amarrillo=false;
          rojo=true;
           System.out.println("Verde: "+verde);
           System.out.println("Amarrilo: "+amarrillo);
           System.out.println("Rojo: "+rojo);
       }
       else{
           System.out.println("No hay peaton");
       }
   }
}
