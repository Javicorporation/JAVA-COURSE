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

    public void hacerCaballito (){}
}
