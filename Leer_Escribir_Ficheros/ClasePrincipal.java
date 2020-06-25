/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leer_Escribir_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        
        //Ponemos una variable ruta        
        String ruta = "G:\\SARA\\CLASE\\Java\\";
        
        try { 
            FileWriter fichero = new FileWriter(ruta + "sara2.txt");  //Crea el fichero si no está creado
            fichero.write("hola mi nombre es Sara2");   //Escribe dentro del archivo
            fichero.close();  //Lo cierra
        } catch (IOException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader lector = new FileReader(ruta+"sara2.txt");  //Lee el archivo ya creado
            BufferedReader BR = new BufferedReader(lector);  
            System.out.println(BR.readLine());  //Lee la primera linea
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
