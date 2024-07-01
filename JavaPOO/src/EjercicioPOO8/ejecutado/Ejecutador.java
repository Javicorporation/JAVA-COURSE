package EjercicioPOO8.ejecutado;

import EjercicioPOO8.clases.Comercial;
import EjercicioPOO8.clases.Repartidor;
import EjercicioPOO8.msgs.Msg;

import java.util.Scanner;

public class Ejecutador {
    public static Scanner getting = new Scanner(System.in);




    public void presentar(){
        // instanciamos objetos de las clases
        Repartidor repartidor;
        Comercial comercial;
        boolean loopMenu;
        int opcion;

        do {
            System.out.println("\nBonos de empleandos");
            System.out.println("1. Bono de empleado comercial");
            System.out.println("2. Bono de empleado repartidor");
            System.out.println("3. Salir");
            opcion = Msg.pedirInt("Seleccione una opcion: ");

            switch (opcion){
                case 1:
                    String nombre = Msg.pedirString(Msg.msgNombre);
                    int edad = Msg.pedirInt(Msg.msgEdad);
                    double salario =Msg.pedirDouble(Msg.msgSalario);
                    double comision = Msg.pedirDouble(Msg.msgComision);
                    comercial = new Comercial(nombre,edad,salario,comision);
                    comercial.toString();
                    comercial.plus();

                    break;
                case 2:
                    String nombreR = Msg.pedirString(Msg.msgNombre);
                    int edadR = Msg.pedirInt(Msg.msgEdad);
                    double salarioR = Msg.pedirDouble(Msg.msgSalario);
                    String zona = Msg.pedirString(Msg.msgZona);

                    repartidor = new Repartidor(nombreR,edadR,salarioR,zona);
                    repartidor.toString();
                    repartidor.plus();
                    break;
                case 3:
                    System.out.println(Msg.msgAdios);
                    break;
                default:
                    System.out.println();
            }

        }while (opcion!=3);





    }
}
