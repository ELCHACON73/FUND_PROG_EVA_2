/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_arreglos_ciclos;

/**
 *
 * @author invitado
 */
public class EVA2_24_ARREGLOS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[1000000];
        //1er 0 0; ultimo = N - 1
        for (int i = 0; i < 10000000; i++) {
            arreglo[i] = 10000;
        }
        for (int i = 0; i < 10000000; i++) {
            arreglo[i] = 10000;
            System.out.println(arreglo[i]);
        }
    }
    
}
