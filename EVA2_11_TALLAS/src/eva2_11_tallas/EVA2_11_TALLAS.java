/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de su talla");
        talla = input.nextInt();
        
        switch(talla){
            case 29:
                System.out.println("Su talla es small");
                break;
            case 42:
                System.out.println("Su talla es medium");
                break;
            case 44:
                System.out.println("Su talla es large");
                break;
            case 48:
                System.out.println("Su talla es xlarge");
                break;
            default:
                System.out.println("El número de talla no existe");
        }
    }
    
}
