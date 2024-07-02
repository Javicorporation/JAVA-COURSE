package EjercicioPOO9.Metodos;

import EjercicioPOO9.Clases.Bebida;

public class Almacen {
    private Bebida estanteria[][];

    // creamos un constructor en el que implementamos las filas y columnas a la matris bebida.
    /*
    public Almacen(int filas, int columnas) {
        estanteria = new Bebida[filas][columnas];
    }*/

    // implementamos un tamaño por defecto de 5 x 5
    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    // Creamos el metodo para agregamos una bebida
    public void agregarBebida(Bebida bebida) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) { // si encontramos una posicion vacia
                    estanteria[i][j] = bebida; // agregamos una bebida
                    encontrado = true; // el encontrado pasa a true y salimos del bucle
                }
            }
        }
        if (encontrado) {
            System.out.println("Bebida guardada");
        }else {
            System.out.println("Bebida no guardada");
        }
    }


    // Creamos el metodo para calculamos el precio de las bebidas
    public double calcularPrecioBebidas(){
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) { // si estanteria es diferente de null
                    precioTotal += estanteria[i][j].getPrecio(); // obtenemos y sumamos los precios de cada producto.
                }
            }
        }
        return precioTotal;
    }

    // Creamos el metodo para mostramos las bebidas
    public void mostrarBebidas(){
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if(estanteria[i][j] != null){
                    System.out.println("\nFila "+i+"\nColumna "+j+estanteria[i][j].toString());
                }
            }
        }
    }

    // Creamos el metodo para eliminar Bebidas
    public void eliminarBebida(int id){
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null; // elimina la bebida, bueno la cambia a null
                        encontrado = true;
                    }
                }
            }
        }
        if (encontrado) {
            System.out.println();
            System.out.println("Bebida eliminada");
        }else{
            System.out.println();
            System.out.println("La bebida no ha sido eliminada");
        }
    }
}
