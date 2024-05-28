package Estaticos;

public class Main {

    // si el metodo estatico esta creado en la misma clase que la clase main  tampoco debes crear un objeto de ella
    public static void estoyAqui(){
        System.out.println("estoy aqui");
    }







    public static void main(String[] args) {
        // es un ejemplo
        Main.estoyAqui();


        //aqui
        // podemos acceder a los metodos de la clase Humano.java
        // por que son static y pertenecen a la clase y no al objeto
        //y evitamos crear un objetos
        Humano.pintar();
        int edad = Humano.saberEdad(2001,2024);
        System.out.println("su edad es: "+edad);

        // los atributos se manejan igual que los metodos
        Humano.edad =100;
        Humano.sexo ="femenino";



        // instanciamos un objeto de la clase persona
        // y mediante ese objeto podemos acceder a los metodos que no son estatic
        Humano persona = new Humano();

        persona.presentar();
        persona.hablar();
    }
}
