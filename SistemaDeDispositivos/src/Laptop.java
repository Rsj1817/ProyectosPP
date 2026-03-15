public class Laptop extends Dispositivo implements Conectable{

    private int ram;

    public Laptop(){

    }

    public Laptop(String marca,String modelo, Bateria bateria, int ram){
        super(marca,modelo,bateria);
        this.ram=ram;
    }


    @Override
    public double consumoEnergia() {
        return 31 * 2;
    }

    @Override
    public void conectarWifi() {
        System.out.println("Tu lap ya esta conectada");
    }
}
