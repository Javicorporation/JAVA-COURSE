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
       numeroDecimalGrande = Double.parseDouble(JOptionPane.showInputDialog("escribe un decimal: "));
       numeroDecimal = Float.parseFloat(JOptionPane.showInputDialog("escribe un numero flotante: "));
       texto = JOptionPane.showInputDialog("escribe una frace: ");
       caracter = JOptionPane.showInputDialog("escribe un caracter: ").charAt(0);
       
       JOptionPane.showMessageDialog(null,"este es el numero: "+numeroEntero);
       JOptionPane.showMessageDialog(null, "este es el decimal: "+numeroDecimalGrande);
       JOptionPane.showMessageDialog(null,"este es el valor flotante: "+numeroDecimal);
       JOptionPane.showMessageDialog(null, "este es el texto: "+texto);
       JOptionPane.showMessageDialog(null,"este es el caracter "+caracter);
    }
    
}
