package EjercicioPOO8.clases;

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
            System.out.println("\nSe le a añadido un bono de :"+ super.getPlus());
            System.out.println("Su salario actual es de :"+ super.getSalario());
            return  true;

        }else{
            System.out.println("\nEl empleado no cumple con los requisitos para el bono");
            return false;
        }
    }
}
