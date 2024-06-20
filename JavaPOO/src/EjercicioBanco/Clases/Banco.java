package EjercicioBanco.Clases;

public class Banco {

    Cliente cliente1 = new Cliente("Juan",1);
    Cliente cliente2 = new Cliente("Maria",2);
    Cliente cliente3 = new Cliente("Carla",3);

    public Banco() {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }
    public void operar(){
        cliente1.Depositar(100);
        cliente2.Depositar(200);
        cliente3.Depositar(300);
        cliente3.retirar(150);
        cliente3.imprimir();

    }

    public void depositosTotales(){
        int t = cliente1.retornarmonto()+cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("El total de dinero es: "+t);

    }


}
