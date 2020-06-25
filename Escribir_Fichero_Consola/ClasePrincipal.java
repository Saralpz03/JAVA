/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escribir_Fichero_Consola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);
        
        //Variables
        String ruta = "G:\\SARA\\CLASE\\Java\\";
        String archivo = "libro.txt";
        String texto;
        
        //Pregunta
        System.out.println("Escribe lo que quieras añadir al archivo");
        texto = sc.nextLine();
        
        //Ejecucion. Uso el while para decirle al usuario que sino escribe nad
        //tenga que volverle a preguntar para que se asegure de escribir
        while(texto.length() == 0){    //Si la longitud del texto es 0, no escribió
            System.out.println("Debes escribir algo");
            System.out.println("Escribe lo que quieras añadir al archivo");
            texto = sc.nextLine();
        }
        // Solo saldrá del bucle si la logongitud no es igual a 0
        //Al salir haz esto
        try {
                FileWriter fichero = new FileWriter(ruta+archivo,true);
                fichero.write(texto);
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Se ha añadido con éxito");
    }
}

