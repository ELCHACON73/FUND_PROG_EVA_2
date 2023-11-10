/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos = new String[10];
        Scanner input = new Scanner(System.in);
        platillos[0] = "Tacos";
        platillos[1] = "Tortas de loma";
        platillos[2] = "Tortas ahogadas";
        platillos[3] = "Tamales";
        platillos[4] = "Tripitas";
        platillos[5] = "Tripotas";
        platillos[6] = "Bolillos";
        platillos[7] = "T-BONE";
        platillos[8] = "Alitas";
        platillos[9] = "Bolillos pal´susto";
        double[] precio = {20, 50, 0, 15, 30, 50, 8, 400, 80, 90};
        System.out.println("Welcome to the restaurant");
        System.out.println("~~LA PANTUNFLA~~");
        System.out.println("----------MENÚ----------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + "- " + platillos[i] + ": $" + precio[i]);   
        }
        int opc, cant;
        System.out.println("¿Que quieres ordenar hoy?");
        opc = input.nextInt();
        System.out.println("¿Cuantas órdenes quieres?");
        cant = input.nextInt();
        System.out.println("Total a pagar: " + (cant * precio[opc]) );
    }
    
}
