package EqualsHastCode;


public class TestListas {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("juan",13);
        Empleado emp2 = new Empleado("juahn",13);
        //Empleado emp2 = new Empleado("paul",23);
        Empleado emp3 = emp1;

        // comparamos si los objetos tinenen la misma intancia en memoria
//        if (emp1.equals(emp2)) {
//            System.out.println("los datos de los empleados son iguales");
//        } else {
//            System.out.println("los datos de los empleados son diferentes");
//        }

        if(emp1.hashCode() == emp2.hashCode()){
            System.out.println("los has de los objetos son iguales");
        }else{
            System.out.println("los has de los objetos no son iguales");
        }

    }

}
