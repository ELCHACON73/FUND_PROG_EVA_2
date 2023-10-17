/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        //VERIFICAR SI ES DIVISIBLE ENTRE 4"
        residuo = year % 4;
        
        if(residuo == 0){  //divisible entre 4, no es garantia de año bisiesto
            residuo = year % 100;
            if(residuo > 0)  //no es divisible entre 100
                System.out.println("Es año bisiesto");
            else{ 
                residuo = year % 400;
            if (residuo == 0)
                System.out.println("El año es bisiesto"); 
            else System.out.println("El año no es bisiesto");
            }
        }else
            System.out.println("No es año bisiesto");
    }
    
}
