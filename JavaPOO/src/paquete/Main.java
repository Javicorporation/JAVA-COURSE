package paquete;

public class Main {
    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();
        String nombre1 = lavadora1.nombre = "mabe";
        String marca1 = lavadora1.marca = "mabe";
        int serial1 = lavadora1.serie = 12435;
        float altura1 = lavadora1.altura = 1.35f;
        String color1 = lavadora1.color = "blanco";
        float precio1 = lavadora1.precio = 300.90f;

        System.out.println("caracteristicas de la lavadora "+marca1);
        System.out.println("el nombre es: "+nombre1);
        System.out.println("el serial es: "+serial1);
        System.out.println("la altura seria: "+altura1);
        System.out.println("el color seria: "+color1);
        System.out.println("el precio seria: "+precio1);





        Lavadora lavadora2 = new Lavadora();
        String nombre2 = lavadora2.nombre = "indurama";
        String marca2 = lavadora2.marca= "indurama";
        int serie2 = lavadora2.serie = 664635734;
        float precio2 = lavadora2.precio = 200.80f;
        float altura2 = lavadora2.altura = 1.35f;
        String color2 = lavadora2.color = "gris";

        System.out.println();
        System.out.println("caracteristicas de la lavadora "+marca2);
        System.out.println("el nombre es: "+nombre2);
        System.out.println("el serial es: "+serie2);
        System.out.println("la altura seria: "+altura2);
        System.out.println("el color seria: "+color2);
        System.out.println("el precio seria: "+precio2);


        Lavadora lavadora3 = new Lavadora();
        String nombre3 = lavadora3.nombre = "LG";
        String marca3 = lavadora3.marca = "LG";
        int serie3 = lavadora3.serie = 3625362;
        float precio3 = lavadora3.precio = 400.70f;
        float altura3 = lavadora3.altura = 1.29f;
        String color3 = lavadora3.color = "negro";

        System.out.println();
        System.out.println("caracteristicas de la lavadora "+marca3);
        System.out.println("el nombre es: "+nombre3);
        System.out.println("el serial es: "+serie3);
        System.out.println("la altura seria: "+altura3);
        System.out.println("el color seria: "+color3);
        System.out.println("el precio seria: "+precio3);


    }
}
