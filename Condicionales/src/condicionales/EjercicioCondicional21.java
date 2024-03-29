package condicionales;

import javax.swing.*;

public class EjercicioCondicional21 {
    public static void main(String[] args){

        char caracter = JOptionPane.showInputDialog("escrinba un caracter: ").charAt(0);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("escriba una opcion: \n"+"1. convertir a mayuscula. \n"+"2. convertir a minuscula"));

        if (opcion == 1) {
            if (Character.isUpperCase(caracter)) {
                JOptionPane.showMessageDialog(null,"el caracter ya esta en mayuscula");
            } else{
                char caracterCon  = Character.toUpperCase(caracter);
                JOptionPane.showMessageDialog(null, "el caracter convertido es: "+ caracterCon);
            }

        } else if (opcion == 2) {
            if (Character.isLowerCase(caracter)) {
                JOptionPane.showMessageDialog(null,"el caracter ya esta en minuscula");
            }else {
                char caracterCon1  = Character.toLowerCase(caracter);
                JOptionPane.showMessageDialog(null, "el caracter convertido es: "+ caracterCon1);
            }
            
        }


    }
}
