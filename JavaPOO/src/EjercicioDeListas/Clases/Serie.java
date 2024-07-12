package EjercicioDeListas.Clases;

import java.util.Objects;

public class Serie  implements Entregables{

    public static final int mayor= 1;
    public static final int menor= -1;
    public static final int igual= 0;


    private String titulo;
    private int numeroDeTemporadas;
    private boolean esEntregado;
    private String genero;
    private String creador;

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.esEntregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public boolean isEsEntregado() {
        return esEntregado;
    }

    public void setEsEntregado(boolean esEntregado) {
        this.esEntregado = esEntregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "\nSerie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", esEntregado=" + esEntregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }



    @Override
    public void entregar() {
        esEntregado = true;
    }

    @Override
    public void devolver() {
        esEntregado = false;
    }

    @Override
    public boolean comprobarArticuloExistente() {
        if (esEntregado) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object object) {
        int estado = menor;
        // castin de objetos
        Serie serie = (Serie) object;
        if (numeroDeTemporadas > serie.numeroDeTemporadas){
            estado = mayor;
        }else if(numeroDeTemporadas == serie.numeroDeTemporadas){
            estado = igual;
        }
        return estado;
    }
}
