package EjercicioDeListas.Clases;

public class VideoJuego implements Entregables {
    public static final int mayor = 1;
    public static final int menor = -1;
    public static final int igual = 0;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String campania;


    public VideoJuego(String titulo, int horasEstimadas, String genero, String campania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.campania = campania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCampania() {
        return campania;
    }

    public void setCampania(String campania) {
        this.campania = campania;
    }

    @Override
    public String toString() {
        return "\nVideoJuego: " +
                "\ntitulo= " + titulo +
                "\nhorasEstimadas= " + horasEstimadas +
                "\nentregado= " + entregado +
                "\ngenero= " + genero +
                "\ncampania= " + campania ;
    }

    @Override
    public boolean equals(VideoJuego videoJuego) {
        if (titulo.equalsIgnoreCase(videoJuego.titulo) && campania.equalsIgnoreCase(videoJuego.campania)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Serie serie) {
        return false;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean comprobarArticuloExistente() {
        if (entregado) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object object) {
        int estado = menor;
        VideoJuego juego = (VideoJuego) object;
        if (horasEstimadas > juego.getHorasEstimadas()) {
            estado = mayor;
        } else if (horasEstimadas == juego.getHorasEstimadas()) {
            estado = igual;
        }
        return estado;
    }
}
