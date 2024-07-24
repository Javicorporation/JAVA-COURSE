package EjercicioDeLambdas2.Ejecutar;

import EjercicioDeLambdas2.Clases.Modelo;
import EjercicioDeLambdas2.Clases.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejecutar {

    public void ejecutador() {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
        listaVehiculos.add(new Vehiculo("2222AAA", Modelo.AUDI, 20000));
        listaVehiculos.add(new Vehiculo("3333AAA", Modelo.OPEL, 30000));
        listaVehiculos.add(new Vehiculo("4444AAA", Modelo.BMW, 100000));
        listaVehiculos.add(new Vehiculo("5555AAA", Modelo.AUDI, 20000));
        listaVehiculos.add(new Vehiculo("6666AAA", Modelo.OPEL, 30000));
        listaVehiculos.add(new Vehiculo("7777AAA", Modelo.CITROEN, 0));
        listaVehiculos.add(new Vehiculo("8888AAA", Modelo.AUDI, 90000));

        // .stream =
        // .map =
        // .collect =
        // .toList =

        // presentar todos los vehiculos multiplicados por 2
        System.out.println("presentar todos los vehiculos multiplicados por 2");
        listaVehiculos.stream().forEach(e -> System.out.println(e.getKilometro()*2));


        // Listar los kilómetros de cada vehículo y multiplicarlo por 2
        System.out.println();
        System.out.println("Listar los kilómetros de cada vehículo y multiplicarlo por 2");
        List<Double> listaKilo = listaVehiculos.stream().map(v -> v.getKilometro()*2).collect(Collectors.toList());
        listaKilo.forEach(e -> System.out.println(e));



        // Listar los kilómetros de todos los vehiculos
        System.out.println();
        System.out.println("Listar los kilómetros de todos los vehiculos");
        List<Double> listadoKilom = listaVehiculos.stream().map(ve -> ve.getKilometro()).collect(Collectors.toList());
        listadoKilom.forEach(e -> System.out.println(e));

        // Listar los vehículos solo con modelo AUDI
        System.out.println("");

        // Ordenar los vehículos por la cantidad de kilómetros
        System.out.println("");

        // Listar todos los modelos sin que se repitan
        System.out.println("");

        // Listar los vehículos con más de 20000 kilómetros e imprimir el objeto
        System.out.println("");

        // Agrupar a los vehículos por modelo
        System.out.println("");

        // Sumar los kilómetros de los vehículos
        System.out.println("");

        // Listar 2 vehículos con kilómetros menores o iguales a 100000
        System.out.println("");




    }
}
