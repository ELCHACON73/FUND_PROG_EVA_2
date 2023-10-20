/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de su calificación");
        califa = input.nextInt();
        if((califa > 0) && (califa < 101)){
            if((califa >89)&& califa < 101)
                System.out.println("Su calificación es una A");
            else if((califa >79) && (califa <90))
                System.out.println("Su calificación es una B");
            else if((califa > 69) && (califa < 80))
                System.out.println("Su calificación es una C");
            else if((califa > 59) && (califa < 70))
                System.out.println("Su calificación es una D");
            else if(califa < 61 )
                System.out.println("Su calificación es una F");
            
        } 
        else 
            System.out.println("El valor es inválido");
    }
    
}
