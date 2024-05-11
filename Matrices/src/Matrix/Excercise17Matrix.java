package Matrix;
import java.util.Random;
public class Excercise17Matrix {
        public static void main(String[] args) {
            int cantidadCadenas = 10; // Define la cantidad de cadenas aleatorias que deseas generar
            String[] arrayCadenas = new String[cantidadCadenas];

            // Crear un objeto Random para generar valores aleatorios
            Random random = new Random();

            // Definir el conjunto de caracteres posibles para las cadenas
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            for (int i = 0; i < cantidadCadenas; i++) {
                StringBuilder cadenaAleatoria = new StringBuilder();

                // Generar una cadena aleatoria de longitud aleatoria (entre 5 y 15 caracteres)
                int longitudCadena = random.nextInt(11) + 5;
                for (int j = 0; j < longitudCadena; j++) {
                    int indiceCaracter = random.nextInt(caracteres.length());
                    cadenaAleatoria.append(caracteres.charAt(indiceCaracter));
                }

                // Almacenar la cadena aleatoria en el array
                arrayCadenas[i] = cadenaAleatoria.toString();
            }

            // Imprimir el array de cadenas aleatorias
            for (String cadena : arrayCadenas) {
                System.out.println(cadena);
                System.out.println("hola");
            }
        }
}

