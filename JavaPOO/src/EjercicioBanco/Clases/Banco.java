package EjercicioBanco.Clases;

public class Banco {

    Cliente cliente1 = new Cliente("Juan");
    Cliente cliente2 = new Cliente("Maria");
    Cliente cliente3 = new Cliente("Carla");

    public Banco() {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }
    public void operar(){
        cliente1.Depositar(100);
        cliente2.Depositar(200);
        cliente3.Depositar(300);
        cliente3.Depositar(150);
    }

    public void depositosTotales(){
        int t = cliente1.retornarmonto()+cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("El total de dinero es: "+t);

    }


}
