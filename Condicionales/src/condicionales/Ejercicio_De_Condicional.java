
package condicionales;

import javax.swing.JOptionPane;


public class Ejercicio_De_Condicional {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1;
        int numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("escrina el primer numero : "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("escriba el segundo numero: "));
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "el numero mayor es : "+numero1);
        } 
        else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, "el numero menor es: "+numero2);
        }
        else {
            System.out.println("puso numeros iguales");
        }
    }
    
}
