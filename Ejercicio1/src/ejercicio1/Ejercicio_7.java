/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author krchi
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aplicacion que calcula el area de un trapesio 
        
        Scanner entrada = new Scanner(System.in);
        
        double baseMenor;
        double basemayor;
        double altura;
        
        System.out.print("Escribe la base menor: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Escribe la base mayor: ");
        basemayor = entrada.nextDouble();
        System.out.print("Escribe la altura: ");
        altura = entrada.nextDouble();
        
        double resultado;
        resultado = (altura*(basemayor*baseMenor))/2;
        System.out.println("el area de un trapesio es: "+resultado);
        
    }
    
}
