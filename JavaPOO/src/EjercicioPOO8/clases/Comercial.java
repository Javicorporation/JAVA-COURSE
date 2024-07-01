package EjercicioPOO8.clases;

public class Comercial extends Empleado{

    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "\nComision: "+comision;
    }

    @Override
    public boolean plus() {
        if (getEdad() > 30 && comision >200 ) {
            double salarioNuev = getSalario() + getPlus();
            setSalario(salarioNuev);
            System.out.println("\nSe le a añadido un bono de :"+ getPlus());
            System.out.println("Su salario actual es de :"+ getSalario());
            return  true;
        }else {
            System.out.println("\nEl empleado no cumple con los requisitos para el bono");
            return false;
        }
    }
}
