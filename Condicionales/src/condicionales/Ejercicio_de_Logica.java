
package condicionales;

import javax.swing.JOptionPane;

public class Ejercicio_de_Logica {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota1;
        int nota2;
        int nota3;
        
        double promedio;
        
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero: "));
        
        promedio = (nota1+nota2+nota3)/3;
        
        if (promedio < 15) {
            JOptionPane.showMessageDialog(null, "esta reprobado");            
        }else if(promedio >= 15){
            JOptionPane.showInternalMessageDialog(null, nota3);
        } 
        else {
            JOptionPane.showMessageDialog(null, "ingreso una nota no valida!!");
        }   
    }
}
