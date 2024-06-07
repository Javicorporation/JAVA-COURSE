package Ejercicio7POO.Clases;


public class Agenda {
    private Contacto contactos[];

    public Agenda() {
        contactos = new Contacto[10];
    }

    public Agenda(int tamaño) {
        contactos = new Contacto[tamaño];
    }

    //antes de añadir acontactos debemos comprobar si el contacto ya existe en el array esta lleno
    public boolean comprobarSiElContactoExiste(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                System.out.println("el contacto ya existe.");
                return true;
            }
        }
        return false;
    }

    //comprobamos si la agenda esta llena
    public boolean comprobarSiLaAgendaLlena() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }


    // comprobar si hay espacios libres
    public int buscarEspaciosLibres() {
        int contadorVacios = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorVacios++;
            }
        }
        return contadorVacios;
    }


    // añadir contacto
    public void añadirContacto(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (comprobarSiElContactoExiste(contacto)) {
                System.out.print("El contacto ya esxiste.");
            } else if (comprobarSiLaAgendaLlena()) {
                System.out.println("La agenda ya esta llena.");

            } else {
                //creamos una variable de registro
                boolean registro = false;
                for (int j = 0; j < contactos.length && !registro; j++) {
                    if (contactos[i] == null) {
                        contactos[i] = contacto;
                        registro = true;
                    }
                }
                if (registro == true) {
                    System.out.println("el contacto se a registrado correctamente.");
                } else {
                    System.out.println("No se a podido registrar el contacto.");
                }
            }
        }
    }

    public void listarContactos() {
        if (buscarEspaciosLibres() == contactos.length) {
            System.out.print("No hay contactos para enlistar.");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println("Nombre: " + contactos[i].getNombre());
                    System.out.println("Telefono: " + contactos[i].getTelefono());

                }
            }
        }
    }

    //Buscar contacto
    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre)) {
                System.out.println("\nContacto encontrado.");
                System.out.print("su nombre es: " + contactos[i].getNombre());
                System.out.print("su telefono es: " + contactos[i].getTelefono());
                encontrado = true;
            }
            if (!encontrado) {
                System.out.println("No se a encontrado contacto");

            }
        }
    }


    //EliminarContacto
    public void eliminarContacto(Contacto contacto) {
        boolean eliminado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                contactos[i] = null;
                eliminado = true;
            }
            if (eliminado == true) {
                System.out.println("El contacto se a eliminado correctamente");
            } else {
                System.out.println("El contacto no se a liminado.");
            }
        }
    }

}
