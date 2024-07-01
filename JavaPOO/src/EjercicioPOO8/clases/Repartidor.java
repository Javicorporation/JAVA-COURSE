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
        return "Repartidor{" + "zona='" + zona  + ", plus=" + plus + '}';
    }

    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona == "lima"){
            System.out.println("Se le a añadido un bono de :"+ super.getPlus());
            System.out.println("Su salario actual es de :"+ super.getSalario());
            return  true;

        }else{
            System.out.println("El empleado no cumple con los requisitos prara el bono\"");
            return false;
        }
    }
}
