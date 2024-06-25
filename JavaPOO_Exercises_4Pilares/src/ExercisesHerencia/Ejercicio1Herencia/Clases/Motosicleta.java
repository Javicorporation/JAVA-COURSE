package ExercisesHerencia.Ejercicio1Herencia.Clases;

public class Motosicleta extends Vehiculo{
    private String tipoDeManillar;

    public Motosicleta(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    public String getTipoDeManillar() {
        return tipoDeManillar;
    }

    public void setTipoDeManillar(String tipoDeManillar) {
        this.tipoDeManillar = tipoDeManillar;
    }

    public void hacerlevamtadas (){
        System.out.println("Hace levantadas.");
    }

    public void acelerar(){
        System.out.println("Acelerando el moto");
    }
    public void frenar(){
        System.out.println("Frenando el moto");
    }

    public void presentarDatos(){
        System.out.println("nombre:"+ this.marca);
        System.out.println("modelo:"+ this.modelo);
        System.out.println("color:"+ this.color);
        hacerlevamtadas();
    }
}
