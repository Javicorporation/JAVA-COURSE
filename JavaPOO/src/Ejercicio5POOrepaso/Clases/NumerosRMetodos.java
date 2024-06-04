package Ejercicio5POOrepaso.Clases;

public class NumerosRMetodos {
    private double numeroReal;
    private double numeroImaginario;

    // creamos el constructor para inicializarlo con los atributos
    public NumerosRMetodos(double numeroReal, double numeroImaginario) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
    }

    // creamos los getters para acceder a los atributos privados
    public double getNumeroReal() {
        return numeroReal;
    }

    public double getNumeroImaginario() {
        return numeroImaginario;
    }

    // metodo de tipo NumeroRMetodos que suma numeros
    public NumerosRMetodos sumaDeNumero(NumerosRMetodos numero){
        double sumareal= this.numeroReal+numero.getNumeroReal(); // cramos variable para guardar la operacion
        double sumaImaginario= this.numeroImaginario+numero.getNumeroImaginario();  // cramos variable para guardar la operacion
        NumerosRMetodos suma = new NumerosRMetodos(sumareal, sumaImaginario);// creamos una objeto de tipo NumerosRMetodosQue recibe como parametro las dos variables anteriores.
        return suma;
    }
    public NumerosRMetodos multiplicDeNumReales(NumerosRMetodos numero){
        double val1 = numeroReal*numero.getNumeroReal() - numeroImaginario*numero.getNumeroImaginario();
        double val2 = numeroReal*numero.getNumeroImaginario() + numero.getNumeroReal()*numeroImaginario;
        NumerosRMetodos multiplicacion = new NumerosRMetodos(val1,val2);
        return multiplicacion;
    }

    public boolean siSonIguales (NumerosRMetodos numero){
        boolean iguales = false;
        if (numeroReal == numero.getNumeroReal() && numeroImaginario == numero.getNumeroImaginario()){
            iguales = true;
        }
        return iguales;
    }

    public NumerosRMetodos multiplicarInt(int numero){
        double val1 = numeroReal * numero;
        double val2 = numeroImaginario * numero;
        NumerosRMetodos multiplicarPorInt = new NumerosRMetodos(val1, val2);
        return multiplicarPorInt;
    }


}
