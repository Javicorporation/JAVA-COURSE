package EjercicioBanco.Basee;

import EjercicioBanco.Clases.Banco;

public class Ejecutador1 {
    public void presentar(){
        Banco banco = new Banco();
        banco.operar();
        banco.depositosTotales();
    }
}
