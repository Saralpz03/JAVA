package Area_Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Alexara
 */
public class ClasePrincipal {
    private float radio;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cual es el radio de la circunferencia?");
        float radio = sc.nextFloat();
        float numero = 3.1416f;
        float solucion=(float)Math.pow(radio, 2);
        float resultado = (solucion*numero);
        System.out.println("El area del circulo es "+resultado);
        
    }
}
    
    

