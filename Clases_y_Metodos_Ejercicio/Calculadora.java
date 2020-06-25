package Clases_y_Metodos_Ejercicio;

import java.util.Scanner;


public class Calculadora {
    //Atributos (Características)
    int suma,resta,multiplicacion,division,numero1,numero2;
    
    //Métodos
    
    public void preguntarNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        numero2 = sc.nextInt();
    }
    
    public void sumar(){
        suma = numero1 + numero2;
    }
    public void restar(){
        resta = numero1 - numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    public void dividir(){
        division = numero1 / numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicaion es "+multiplicacion);
        System.out.println("El resultado de la division es "+division);
    }
}