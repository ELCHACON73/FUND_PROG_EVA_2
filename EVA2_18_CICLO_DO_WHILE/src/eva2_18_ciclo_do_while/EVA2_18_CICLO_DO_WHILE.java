/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_ciclo_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_CICLO_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner input = new Scanner(System.in);
        
       
        do{// este bloque siempre se ejecuta al menos 1 vez
            System.out.println("Intenta adivinar el número: ");
            nume = input.nextInt();
        }while(nume != 100);
        System.out.println("ADIVINASTE!!");
        
    }
    
}
