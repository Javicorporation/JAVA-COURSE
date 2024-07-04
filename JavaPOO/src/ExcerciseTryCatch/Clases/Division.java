package ExcerciseTryCatch.Clases;

import ExcerciseTryCatch.Metodos.ExceptionClase;

public class Division {
   public static int dividir(int numero, int denominador) {
       if (denominador == 0) {
           throw new ExceptionClase("Division po zero, nooooooo se puede");
       }
       return  numero / denominador;
   }
}
