package ExercisesPolimorfismo.Ejercicio1Polimorfismo.Base1;

import ExercisesPolimorfismo.Ejercicio1Polimorfismo.Clases1.Pago;
import ExercisesPolimorfismo.Ejercicio1Polimorfismo.Clases1.PagoConEfectivo;
import ExercisesPolimorfismo.Ejercicio1Polimorfismo.Clases1.PagoConTarjeta;

import java.util.ArrayList;
import java.util.List;


public class Ejecutador1 {
    public void presentar(){
        List<Pago> pagos = new ArrayList();
        pagos.add(new PagoConTarjeta(1,"juan",200));
        pagos.add(new PagoConTarjeta(2,"maria",100));
        pagos.add(new PagoConEfectivo("Mirian"));
        pagos.add(new PagoConEfectivo("Mari"));

        for (Pago pago : pagos){
            pago.procesarPago(50);
        }
    }
}
