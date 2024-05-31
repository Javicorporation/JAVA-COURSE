package Ejercicio2POO.Metodos;


public class EcuacionSegGrad {

    double a;
    double b;
    double c;

    public EcuacionSegGrad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private  double OptenerDescriminante(){
        return Math.sqrt(Math.pow(b,2) - 4 * a * c);
    }

    private void OptenerRaices(){
        double descriminante1 = OptenerDescriminante();
        double x1 = -b + descriminante1/2*a;
        double x2 = -b - descriminante1/2*a;
        System.out.println("la solucion X1 es: "+x1);
        System.out.println("la solucion X2 es: "+x2);
    }

    private void OptenerRaiz(){
        double solucion0 = -b/2*a;
        System.out.println("la solucion X0 es: "+solucion0);
    }


    public void calcular(){
        if (OptenerDescriminante() == 0) {
            OptenerRaiz();
        } else if (OptenerDescriminante() > 0) {
            OptenerRaices();
        }else {
            System.out.println("no tiene solucionS");
        }
    }
}
