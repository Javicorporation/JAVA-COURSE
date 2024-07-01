package Interfacess.Clases;

public class MusicoEstudiante implements Musico,Estudiante{

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    @Override
    public void tocarMusica() {
        System.out.println("estoy estudiando musica");
    }

    @Override
    public void hablar() {
        System.out.println("estoy cantando XD");
    }
}
