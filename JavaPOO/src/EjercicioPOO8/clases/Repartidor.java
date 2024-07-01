package EjercicioPOO8.clases;

import EjercicioPOO8.msgs.Msg;

public class Repartidor extends  Empleado{

    private String zona;
    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Repartidor: " + "\nzona='" + zona;
    }

    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona == "lima"){
            System.out.println();
            System.out.println(Msg.msgBono+ super.getPlus());
            System.out.println(Msg.msgSalarioAct+ super.getSalario());
            return  true;
        }else{
            System.out.println(Msg.msgNoCumple);
            return false;
        }
    }
}
