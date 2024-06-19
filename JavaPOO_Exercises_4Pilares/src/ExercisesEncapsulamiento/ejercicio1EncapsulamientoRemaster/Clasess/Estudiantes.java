package ExercisesEncapsulamiento.ejercicio1EncapsulamientoRemaster.Clasess;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    private String nombre;
    private int id;
    private List<Integer> notas;  // lista de enteros

    public Estudiantes(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();  // inicializamos la lista en el constructor
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void agregarNota(int nota){
        this.notas.add(nota);   // El this es para asignar el atributo nota de la clase
    }


    public int calcularNota(){
        if (notas.isEmpty()) {  // el .isEmpty sirva para comprobar si la lista está vacía.
            return 0;
        }
        int suma = 0;
        for (int nota: notas) {
            suma+=nota;
        }
        return suma/notas.size();
    }


    public void presentarNotas(){
        for (int presenta: notas){
            System.out.println(presenta);
        }
    }
}
