package ExercisesEncapsulamiento.ejercicio1Encapsulamiento.clases;

public class Estudiante {

    private String name;
    private int id;
    private int[] grades;

    public Estudiante(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void addGrade(int grade) {
        int contador = 0;
        int nota = 0;
        grades = new int[grade];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("ingrese su nota numero "+(i+1)+": ");
            nota = MenuAndValidations.getting.nextInt();
            grades[i] = nota;
            if(grades[i] == 00){
                contador++;
            }
        }
        double resultado = calculateAverage();
        System.out.println("El promedio es: "+resultado);
        System.out.println("Existen "+contador+" espacios vacios");
    }
    public  double calculateAverage() {
        double suma = 0;
        for (int i = 0; i < grades.length; i++) {
            suma += grades[i];
        }
        return suma/grades.length;
    }
    public void presentarNotas(){
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+" ");
        }
        System.out.println();
    }
}
