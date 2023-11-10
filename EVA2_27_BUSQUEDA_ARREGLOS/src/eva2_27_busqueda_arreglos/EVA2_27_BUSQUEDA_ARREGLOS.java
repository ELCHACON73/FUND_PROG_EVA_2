/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_27_busqueda_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_27_BUSQUEDA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN ARREGLO DE 15 ELEMENTOS
        int[] arreglo = new int[15];
        Scanner input = new Scanner(System.in);
        //LLENARLO CON VALORES ALEATORIOS entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        int num;
        System.out.println("¿Qué número buscas?");
        num = input.nextInt();
        //BÚSQUEDA SECUENCIAL (POR FUERZA BRUTA)
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num){//valor encontrado
                System.out.println("Valor encontrado en la pocisión " + i);
                break;
            }else
                System.out.println("El elemento no se encuentra");
        }
    }
    
}
