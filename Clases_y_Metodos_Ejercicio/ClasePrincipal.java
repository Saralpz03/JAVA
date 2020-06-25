/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_y_Metodos_Ejercicio;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Calculadora op = new Calculadora();
        
        op.preguntarNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultado();
    }
}
