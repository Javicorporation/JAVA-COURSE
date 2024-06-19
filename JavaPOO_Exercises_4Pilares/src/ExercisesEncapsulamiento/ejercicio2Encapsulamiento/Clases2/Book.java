package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2;

public class Book {
    private String title;
    private String author;
    private String status;

    public Book(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // cambiamos el uso de if por un switch
    public void changeStatu(String status) {
        switch (status.toLowerCase()){ // convierte mayusculas a minusculas
            case "disponible":
                this.status = "disponible";
                break;
            case "prestado":
                this.status = "prestado";
                break;
            default:
                System.out.println("El estado " + this.status + " no es válido.");
        }
        System.out.println("El libro esta: "+this.status);
    }
}
