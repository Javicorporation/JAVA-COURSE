package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2;

public class BookPrestado extends Book{
    private String status;



    public BookPrestado(String title, String author) {
        super(title, author);
        this.status = "prestado";
    }

    @Override
    public void changeStatu(String status) {
        if (status.equalsIgnoreCase("prestado")) {
            this.status = "prestado";
        }else {
            System.out.println("El estado " + status.toLowerCase() + " no es válido para un libro "+this.status);

        }
    }

    @Override
    public String toString() {
        return "el libro "+getTitle()+" del autor "+getAuthor()+" esta "+this.status;
    }
}
