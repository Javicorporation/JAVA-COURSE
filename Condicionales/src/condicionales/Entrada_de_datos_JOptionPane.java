package condicionales;

import javax.swing.JOptionPane;

public class Entrada_de_datos_JOptionPane {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
       int numeroEntero;
       float numeroDecimal;
       double numeroDecimalGrande;
       String texto;
       char caracter;
       
       numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("escribe un numero entero: "));
       
       JOptionPane.showMessageDialog(null,"este es el numero: "+numeroEntero);
    }
    
}
