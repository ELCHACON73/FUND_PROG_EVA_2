/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación:");
        califa = input.nextInt();
        
        if(califa >= 70){ //if(expresión a evaluar)
            System.out.println("Aprobaste");
            System.out.println("quema tus apuntes");
        }else                    //ESTO SE EJECUTA SI ES FALSO. ELSE ES OPCIONAL
            System.out.println("No aprobaste");
    }
    
}
