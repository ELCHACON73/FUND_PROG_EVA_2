/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_17_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("ADIVINA EL NÚMERO EN EL QUE PIENSO");
            int num = input.nextInt();
            if(num == valor){
                System.out.println("Adivinaste!!");
                break;//aqui termina el while
                
        }
            
        }
      
    }
    
}
