package ExcerciseTryCatch.Clases;

import ExcerciseTryCatch.Metodos.ExceptionClase;

public class Division {
    // el throws sirve para decir que rl metodo va a tener una exception
   public static int dividir(int numero, int denominador) throws ExceptionClase {
       if (denominador == 0) {
           throw new ExceptionClase("Division po zero, nooooooo se puede");
       }
       return  numero / denominador;
   }
}
