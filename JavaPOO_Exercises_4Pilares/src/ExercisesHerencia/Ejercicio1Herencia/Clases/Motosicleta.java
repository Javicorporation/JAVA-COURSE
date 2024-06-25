package ExercisesHerencia.Ejercicio1Herencia.Clases;

public class Motosicleta extends Vehiculo{
    private String tipoDeManillar;

    public Motosicleta(String marca, String modelo, String color, String tipoDeManillar) {
        super(marca, modelo, color);
        this.tipoDeManillar = tipoDeManillar;
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

    @Override
    public void presentarDatos(){
        super.presentarDatos();
        System.out.println("tipo de manillar "+ this.tipoDeManillar);
        hacerlevamtadas();
    }
}
