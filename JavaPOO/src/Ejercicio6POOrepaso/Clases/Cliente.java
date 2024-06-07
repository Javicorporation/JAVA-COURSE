package Ejercicio6POOrepaso.Clases;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String DNI, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }


    public double consultarSaldo(int indice){
        return cuentas[indice].getSaldo();
    }

    public void depositar(int indice, double valorADepositar){
        cuentas[indice].depositarDinero(valorADepositar);
    }

    public void retirar(int indice, double valorARetirar){
        cuentas[indice].retirarDinero(valorARetirar);
    }


}
