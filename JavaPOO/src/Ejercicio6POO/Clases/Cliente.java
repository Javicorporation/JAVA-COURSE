package Ejercicio6POO.Clases;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double consultarSaldo(int indice){
        return cuentas[indice].getSaldo();
    }

    public void ingresarDinero(int indice, double cantidad){
        cuentas[indice].depositarDinero(cantidad);
    }

    public void retirarDinero(int indice, double cantidad){
        cuentas[indice].retirarDinero(cantidad);
    }
}
