package ExercisesHerencia.Ejercicio3Herencia.Clases3;

public class EmpleadoMedioTiempo extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoMedioTiempo(String nombre, String apellido, int id, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, id, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public EmpleadoMedioTiempo(int horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return getSalario()+(horasTrabajadas * tarifaPorHora);
    }
}
