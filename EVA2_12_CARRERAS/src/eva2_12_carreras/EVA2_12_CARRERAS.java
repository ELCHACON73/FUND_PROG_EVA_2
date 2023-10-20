/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce las siglas de la carrera: ");
        carrera = input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingenieria en Sistemas Computacionales");
                break;
            case "INF":
                System.out.println("Ingenieria en Sistemas Informatica");
                break;
            case "IND":
                System.out.println("Ingenieria industrial");
                break;
            case "IDI":
                System.out.println("Ingenieria en Diseño Industrial");
                break;
            case "LA":
                System.out.println("Licenciatura en Administración");
                break;
            case "IGE":
                System.out.println("Ingenieria Eléctrica");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            default:
                        System.out.println("La carrera no existe");
              
        }
                
        
    }
    
}
