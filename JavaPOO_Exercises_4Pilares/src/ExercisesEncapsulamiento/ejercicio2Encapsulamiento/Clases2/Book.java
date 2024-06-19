package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2;

public class Book {
    private String title="";
    private String author="";
    private String status="";

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

    public String changeStatu(String status) {
        if(status.equalsIgnoreCase("disponible")){
            status="Disponible";
        }else if(status.equalsIgnoreCase("prestado")){
            status="Prestado";
        } else if (status != "Disponible" || status != "Prestado"){
            System.out.println("El estado "+status+" no es disponible");
        } {
        }
        return status;
    }
}
