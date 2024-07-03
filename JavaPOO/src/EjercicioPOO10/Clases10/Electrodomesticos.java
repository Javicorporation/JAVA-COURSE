package EjercicioPOO10.Clases10;

public class Electrodomesticos {
    //valores por defecto
    protected final static String colorDefecto = "blanco";
    protected final static char consuamoEnergeticoDefecto = 'E';
    protected final static double precioBaseDefecto = 100;
    protected final static double pesoDefecto = 5;


    private double precioBase;
    private String color;
    private char consumaEnerjetico;
    private double peso;

    public Electrodomesticos(double precioBase, String color, char consumaEnerjetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumaEnerjetico(consumaEnerjetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumaEnerjetico() {
        return consumaEnerjetico;
    }

    public void setConsumaEnerjetico(char consumaEnerjetico) {
        this.consumaEnerjetico = consumaEnerjetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nElectrodomesticos: " + "\nprecioBase=" + precioBase +", \ncolor='" + color +", \nconsumaEnerjetico=" + consumaEnerjetico +", \npeso=" + peso;
    }

    private void comprobarColor(String color) {
        String colores[] = {"blanco","negro","azul","rojo","gris","verde","morado"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length; i++) {
            if(color.equals(colores[i])) {
                encontrado = true;
            }
        }
        if(encontrado) {
            this.color = color;
        }else {
            this.color = colorDefecto;
        }
    }

    public final void comprobarConsumaEnerjetico(char consumaEnerjeticos) {
        if(consumaEnerjeticos >= 65 && consumaEnerjeticos <= 70) {
            this.consumaEnerjetico = consumaEnerjeticos;
        }else{
            this.consumaEnerjetico = consuamoEnergeticoDefecto;
        }
    }

    public double obtenerPreciofinal(){
        double plus = 0;
        switch (consumaEnerjetico){
            case 'A':
                plus+= 100;
                break;
            case 'B':
                plus+= 80;
                break;
            case 'C':
                plus+= 60;
                break;
            case'D':
                plus+= 50;
                break;
            case 'E':
                plus+= 30;
                break;
            case 'F':
                plus+= 10;
                break;
            default:
                System.out.println("la opcion escogina no es correcta.");
        }
        if (precioBase >= 0 && precioBase <=19) {
            plus+= 10;
        } else if (precioBase >= 20 && precioBase <= 49) {
            plus+= 50;
        } else if (precioBase >= 50 && precioBase <= 79) {
            plus+= 80;
        } else if (precioBase >= 80) {
            plus+= 100;
        }
        return precioBase+plus;
    }
}
