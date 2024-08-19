package ClasesOperadores;

public class Ejercicio3 {

    public void eje3 (){
        System.out.println("Ejercicio 3");
        int numero1 = 8;
        int numero2 = 2;
        System.out.println("sin cambio");
        System.out.println(numero1);
        System.out.println(numero2);

        int auxiliar = numero2;
        numero2 = numero1;
        numero1= auxiliar;

        System.out.println("con cambio");
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
