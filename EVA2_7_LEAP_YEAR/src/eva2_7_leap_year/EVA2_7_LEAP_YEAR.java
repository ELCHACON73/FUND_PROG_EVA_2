/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_leap_year;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_LEAP_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, resi4, resi100, resi400;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        
        resi4 = year % 4;//DIVISIBLE ENTRE 4
        resi100 = year % 100;//DIVISIBLE ENTRE 100
        resi400 = year % 400;//DIVISIBLE ENTRE 400
        
        if((resi4 == 0) && (resi100 != 0)||(resi400 == 0) )  //!= diferente //cuando es obligatoria es &, sino es or
                System.out.println("El año " + year + " es bisiesto!!");
        else
                System.out.println("El año " + year + "NO es bisiesto!!");
            
       
    }
}
