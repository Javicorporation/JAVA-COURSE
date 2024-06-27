package ExercisesHerencia.Ejercicio3Herencia.Clases3;

public class EmpleadoTiempoCompleto extends Empleado{
    private String beneficios;

    public EmpleadoTiempoCompleto(String nombre, String apellido, int id, double salario, String beneficios) {
        super(nombre, apellido, id, salario);
        this.beneficios = beneficios;
    }

    public EmpleadoTiempoCompleto(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public double calcularPago() {
        return  getSalario()+200;
    }
}
