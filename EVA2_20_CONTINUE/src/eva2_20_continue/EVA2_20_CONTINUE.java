/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_continue;

/**
 *
 * @author invitado
 */
public class EVA2_20_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //break --> termina el ciclo
        
        for (int i = 1; i <=15; i++){
            if(i == 10)
                break;
            System.out.print(i + " - ");
        }
        System.out.println("");
        //continue --> termina la iteración actual
         for (int i = 1; i <=15; i++){
            if(i == 10)
                continue;
            System.out.print(i + " - ");
         }
    }
    
}
