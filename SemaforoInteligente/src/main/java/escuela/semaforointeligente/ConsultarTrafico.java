package escuela.semaforointeligente;

import java.util.Scanner;

class ConsultarTrafico extends Semaforo {
    double flujo;
    double x;
    int hora;
    Scanner entrada = new Scanner(System.in);
    
    public ConsultarTrafico(boolean v, boolean a, boolean r, double f, int h) {
        super(v, a, r);
        this.flujo = f;
        this.hora = h;
    }
    
    public void preguntarHora() {
        System.out.println("Que hora es? (24h)");
        hora = entrada.nextInt();
    }
    
    public void ingresarFlujo() {
        System.out.println("Ingrese el flujo de autos por minuto: ");
        flujo = entrada.nextDouble();
    }
    
    public void imprimirDatos() {
        int tiempoOptimo = 0;

        // Dividir el día en 4 partes: mañana, tarde, noche y madrugada
        if (hora >= 6 && hora < 12) {
            // Mañana
            if (flujo <= 10) {
                tiempoOptimo = 30;
            } else if (flujo <= 30) {
                tiempoOptimo = 20;
            } else {
                tiempoOptimo = 15;
            }
        } else if (hora >= 12 && hora < 18) {
            // Tarde
            if (flujo <= 20) {
                tiempoOptimo = 25;
            } else if (flujo <= 40) {
                tiempoOptimo = 15;
            } else {
                tiempoOptimo = 10;
            }
        } else if (hora >= 18 && hora < 24) {
            // Noche
            if (flujo <= 10) {
                tiempoOptimo = 20;
            } else if (flujo <= 25) {
                tiempoOptimo = 15;
            } else {
                tiempoOptimo = 10;
            }
        } else {
            // Madrugada
            if (flujo <= 5) {
                tiempoOptimo = 15;
            } else if (flujo <= 15) {
                tiempoOptimo = 10;
            } else {
                tiempoOptimo = 7;
            }
        }

        System.out.println("Tiempo óptimo en verde: " + tiempoOptimo + " segundos");
    }
}

