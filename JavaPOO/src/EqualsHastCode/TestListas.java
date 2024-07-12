package EqualsHastCode;


public class TestListas {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("juan",13);
        Empleado emp2 = new Empleado("juan",13);
        //Empleado emp2 = new Empleado("paul",23);
        Empleado emp3 = emp1;

        // comparamos si los objetos tinenen la misma intancia en memoria
        if(emp1.equals(emp2)){
            System.out.println("los objetos tienen la misma referencia en memoria.");
        }else{
            System.out.println("no tienen la misma referencia en memoria.");
        }

    }

}
