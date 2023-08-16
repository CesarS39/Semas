package escuela.semaforointeligente;
import java.util.Scanner;

public class SemaforoInteligente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Peaton peaton = new Peaton(false, false, false);
        Emergencia emergencia = new Emergencia(false, false, false, 0);
        ConsultarTrafico trafico = new ConsultarTrafico(false, false, false, 0.0, 0);
        CambiarSecuencia secuencia = new CambiarSecuencia(false, false,false, 0);
        
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("Menú:");
            System.out.println("1) Consultar tráfico");
            System.out.println("2) Cambiar secuencia");
            System.out.println("3) Consultar emergencia");
            System.out.println("4) Secuencia de emergencia");
            System.out.println("5) Tiempo adecuado");
            System.out.println("6) Cruzar peatón");
            System.out.println("7) Salir");
            System.out.print("Ingrese una opción: ");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    trafico.ingresarFlujo();
                    trafico.imprimirDatos();
                    break;
                case 2:
                    secuencia.preguntarSecuencia();
                    secuencia.cambiarSecuencia();
                    break;
                case 3:
                    emergencia.consultarEmergencia();
                    break;
                case 4:
                    emergencia.secuenciaEmergencia();
                    break;
                case 5:
                    trafico.preguntarHora();
                    break;
                case 6:
                    peaton.cruzar();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}