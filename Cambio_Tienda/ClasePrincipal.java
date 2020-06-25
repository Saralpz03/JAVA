/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cambio_Tienda;

import java.util.Scanner;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    private int precio, pagado;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuanto euros cuesta el articulo?");
        int precio = sc.nextInt();
        System.out.println("¿Cuanto euros ha pagado?");
        int pagado = sc.nextInt();
        
        int vuelta = 0;
        
        vuelta = pagado - precio;
        
        if(pagado<precio){
            System.out.println("Se necesita mas dinero");
        }
        else{
            System.out.println("Lo que el dependiente le tiene que devolver es "+vuelta+" euros");
        }
        
    }
}
