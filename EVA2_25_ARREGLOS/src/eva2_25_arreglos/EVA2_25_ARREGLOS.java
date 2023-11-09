/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_25_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[] arregloCali;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantas calificaciones se van a capturar?");
        cant = input.nextInt();
        arregloCali = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificación: ");
            arregloCali[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print(arregloCali[i] + " - ");
        }
    }
    
}
