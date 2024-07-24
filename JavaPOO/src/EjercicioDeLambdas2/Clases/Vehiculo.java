package EjercicioDeLambdas2.Clases;


public class Vehiculo {

    private String matricula;
    private Modelo modelo;
    private double kilometro;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, Modelo modelo, double kilometro) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometro = kilometro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getKilometro() {
        return kilometro;
    }

    public void setKilometro(double kilometro) {
        this.kilometro = kilometro;
    }

    @Override
    public String toString() {
        return "\nVehiculo: " +
                "\nmatricula: " + matricula +
                "\nmodelo: " + modelo +
                "\nkilometro: " + kilometro +
                '}';
    }
}
