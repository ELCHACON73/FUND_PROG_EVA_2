/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_ciclo_for;

/**
 *
 * @author invitado
 */
public class EVA2_13_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for --> desde
        //punto de inicio, condición para continuar, avance o retroceso
        //cuando es falso termina
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
            System.out.println("----------");
        for(int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        //imprimir los números pares de 0 a 100, incluyendo 0 y 100
        for (int i = 0; i < 101; i+= 2) {
            System.out.print(i + " - ");
        }
    }
    
}
