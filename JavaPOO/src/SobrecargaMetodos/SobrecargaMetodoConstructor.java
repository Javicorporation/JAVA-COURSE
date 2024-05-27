package SobrecargaMetodos;

import org.w3c.dom.ls.LSOutput;

public class SobrecargaMetodoConstructor {

    // la sobrecarga de metodos contructores se puede dar y los metodos pueden tener el mismo nombre
    // pero no pueden tener los mismos parametros
    SobrecargaMetodoConstructor(int id, String nombre){
        System.out.println("su id es: "+id);
        System.out.println("su nombre es: "+nombre);
    }

    //ejemplo tiene los mismos parametros pero en diferente posicion, es permitido
    SobrecargaMetodoConstructor(String nombre, int id){
        System.out.println("su nombre es: "+nombre);
        System.out.println("su id es: "+id);
    }

    SobrecargaMetodoConstructor(float estatura, int edad){
        System.out.println("su estatura es: "+estatura);
        System.out.println("su edad es: "+edad);
    }

    SobrecargaMetodoConstructor(){}


    // lo mismo sucede con los metodos normales


}
