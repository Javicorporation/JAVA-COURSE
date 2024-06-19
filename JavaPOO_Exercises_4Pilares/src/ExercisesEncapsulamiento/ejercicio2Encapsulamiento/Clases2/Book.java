package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2;

public abstract class Book {
    protected String title;
    protected String author;
    //private String status;   comentamos el atributo estato por que va a ser el que vamos a crear en las distintas clases

    // modificamos el contructor y le quitamos el estado
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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


    // Convertido en un metodo abstracto y si puede llevar parametros
    public abstract void changeStatu(String newStatus);






        /*switch (status.toLowerCase()){ // convierte mayusculas a minusculas
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
    }*/
}

