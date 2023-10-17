/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Valor 1: ");
        valor1 = input.nextInt(); 
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();
        
         //> operadores
        if(valor1 > valor2) // VERDAD               CONCATENAR
            System.out.println("El valor más grande es el " + valor1);
        else{ //FALSO, EL VALOR1 NO ES MÁS GRANDE QUE EL VALOR2
            //if anidado: un if dentro de otro if
            //EN JAVA:
            //=ES ASIGNACIÓN
            //ES COMPARACIÓN
            
            if(valor1 == valor2) //VERDAD
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor más pequeño es " + valor1);
            
        }
             
        
        
    }
    
}
