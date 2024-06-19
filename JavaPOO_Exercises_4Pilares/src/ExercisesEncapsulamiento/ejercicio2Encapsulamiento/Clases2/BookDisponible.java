package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2;

public class BookDisponible extends Book{
    private String status;

    public BookDisponible(String title, String author) {
        super(title, author);
        this.status = "Disponible";
    }

    @Override
    public void changeStatu(String newStatus) {
        if (newStatus.equalsIgnoreCase("disponible")) {
            this.status = "disponible";
        }else {
            System.out.println("El estado " + newStatus.toLowerCase() + " no es válido para un libro "+this.status);
        }

    }

    @Override
    public String toString() {
        return "El libro "+getAuthor()+" del autor "+getTitle()+" esta: "+this.status;
    }
}
