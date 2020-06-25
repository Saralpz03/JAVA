/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import java.util.Scanner;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = new int[10];   //Creamos los 10 numeros que nos va a pedir
        
        int contar_pares=0;
        int contar_impares=0;
        
        System.out.println("Llena el array");
        for(int i=0;i<10;i++){
            System.out.println("Escriba un numero");
            lista[i] = entrada.nextInt();
            if(lista[i] % 2 == 0){
                contar_pares++;   //Numero de pares
            }
            else{
                contar_impares++;  //Numero de impares
            }
        }
        
        int pares[] = new int[contar_pares];  // Almacenammos los numeros pares
        int impares[] = new int[contar_impares];
        
        contar_pares=0;
        contar_impares=0;
        
        for(int i=0;i<10;i++){
            if(lista[i] % 2 == 0){
                pares[contar_pares] = lista[i];
                contar_pares++;
            }
            else{
                impares[contar_impares] = lista[i];
                contar_impares++;
            }
        }
        
        //imprimir los numeros
        
        System.out.println("Lista de pares: ");
        for(int i=0;i<contar_pares;i++){
            System.out.println(pares[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("Lista de impares: ");
        for(int i=0;i<contar_impares;i++){
            System.out.println(impares[i]+" - ");
        }
        System.out.println("");
        
    }
}
