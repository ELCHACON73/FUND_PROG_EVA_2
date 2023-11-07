/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_continue_2;

/**
 *
 * @author invitado
 */
public class EVA2_21_CONTINUE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 15; i++){
            //MODULO --> &
            if((i % 2) != 0)
                continue;
            System.out.print(i + " - ");
        }
    }
    
}
