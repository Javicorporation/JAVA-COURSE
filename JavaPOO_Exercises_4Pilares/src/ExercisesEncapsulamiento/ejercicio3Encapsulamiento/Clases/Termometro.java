package ExercisesEncapsulamiento.ejercicio3Encapsulamiento.Clases;

import java.util.ArrayList;
import java.util.List;

public class Termometro {
    // creamos una lista
    private List<Double> temperatures = new ArrayList<>();

    public List<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperatures(double temp) {
        temperatures.add(temp);
    }


    public double getMaxTemperature() {
        double maxTemp = temperatures.get(0);
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > maxTemp) {
                maxTemp = temperatures.get(i);
            }
        }
        return maxTemp;
    }
}
