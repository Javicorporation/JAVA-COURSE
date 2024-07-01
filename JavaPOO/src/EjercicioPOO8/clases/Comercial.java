package EjercicioPOO8.clases;

import EjercicioPOO8.msgs.Msg;

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
            System.out.println();
            System.out.println(Msg.msgBono+ getPlus());
            System.out.println(Msg.msgSalarioAct+ getSalario());
            return  true;
        }else {
            System.out.println(Msg.msgNoCumple);
            return false;
        }
    }
}
