/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclo_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A CAPTURAR CALIFICACIONES DE UN GRUPO Y GENERAR
        //EL PROMEDIO:
        int noCalifas;
        double sumaCalifa = 0; //cero es el neutro aditivo
                               //1 es el neutro multiplicador
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos: ");
        noCalifas = input.nextInt();
        System.out.println("Introduce las calificación del grupo: ");
        for (int i = 1; i <= noCalifas; i++) {
            int califa = input.nextInt();
            //SUMATORIA DE CALIFICACIONES
            //ACUMULDORES
            //sumaCalifa = sumaCalifa + califa;
            sumaCalifa += califa;
            
        }
        //el prromedio es sumaCalifa/noCalifas, pero ambos son enteros
        //y dividir enteros en Java da como resultado un entero, sin decimales
        double promedio = sumaCalifa / (noCalifas * 1.0);
        System.out.println("El promedio del grupo es: " + promedio);
        }
}