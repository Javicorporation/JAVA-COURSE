package Ejercicio7POO.Ejecutador;

import Ejercicio7POO.Clases.Agenda;
import Ejercicio7POO.Clases.Contacto;

import java.util.Scanner;

public class Registro {
    private final Scanner getting = new Scanner(System.in);
    private final String msgCantidadDeAgenda = "Digite el tamaño de su agenda: ";
    private final String msgOpcion = "Digite una opcion: ";
    private final String msgNombre = "Digite su nombre: ";
    private final String msgTelefono = "Digite su telefono: ";




    public int pedirInt(String message){
        System.out.println(message);
        return getting.nextInt();
    }

    public String pedirString(String message){
        System.out.println(message);
        return getting.next();
    }

    public void presentar(){
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        int tamañoDeAgenda;
        boolean loopMenu = false;

        tamañoDeAgenda = pedirInt(msgCantidadDeAgenda);
        Agenda agendaTelefonica = new Agenda(tamañoDeAgenda);


        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Añadir contacto.");
            System.out.println("2. Listar contacto.");
            System.out.println("3. Buscar contacto.");
            System.out.println("4. Comprobar si un contacto existe.");
            System.out.println("5. Eliminar contacto.");
            System.out.println("6. Comprobar contactos disponibles.");
            System.out.println("7. Comprobar si la agenda esta llena.");
            System.out.println("8. Salir.");
            opcion = pedirInt(msgOpcion);
            System.out.println("");

            switch (opcion){
                case 1:
                    nombre = pedirString(msgNombre);
                    telefono = pedirInt(msgTelefono);
                    contacto = new Contacto(nombre, telefono);
                    agendaTelefonica.añadirContacto(contacto);
                    System.out.println("");
                    break;
                case 2:
                    agendaTelefonica.listarContactos();
                    System.out.println("");
                    break;
                case 3:
                    nombre = pedirString(msgNombre);
                    agendaTelefonica.buscarContacto(nombre);
                    System.out.println("");
                    break;
                case 4:
                    nombre = pedirString(msgNombre);
                    contacto = new Contacto(nombre);
                    if (agendaTelefonica.comprobarSiElContactoExiste(contacto)) {
                        System.out.println("el contacto existe.");
                    }else {
                        System.out.println("el contacto no existe.");
                    }
                    break;
                case 5:
                    nombre = pedirString(msgNombre);
                    contacto = new Contacto(nombre);
                    agendaTelefonica.eliminarContacto(contacto);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("hay "+agendaTelefonica.buscarEspaciosLibres()+" existentes");
                    break;
                case 7:
                    if (agendaTelefonica.comprobarSiLaAgendaLlena()) {
                        System.out.println("La agenda esta llena");
                    }else{
                        System.out.println("la agenda no esta llena.");
                    }
                    break;
                case 8:
                    System.out.println("Hasta luego.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("Digite una opcion del menu");
                    break;
            }


        }while (!loopMenu);






    }
}
