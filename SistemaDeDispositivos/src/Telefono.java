public class Telefono extends Dispositivo implements Conectable{

    private int numeroCamaras;

    public Telefono(){


    }

    public Telefono(String marca, String modelo, Bateria bateria, int numeroCamaras){
        super(marca,modelo,bateria);
        this.numeroCamaras=numeroCamaras;
    }




    @Override
    public double consumoEnergia() {
        return 12* 3;
    }


    @Override
    public void conectarWifi() {
        System.out.println("Tu cel ya esta conectado");
    }
}
