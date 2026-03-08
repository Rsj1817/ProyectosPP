public class Auto extends Vehiculo implements Encendible{

    private int puertas;

    public Auto(){

    }

    public Auto(String marca, int velocidad, Motor motor, int puertas){
        super(marca,velocidad,motor);
        this.puertas=puertas;
    }


    @Override
    public double calcularConsumo() {
        return 2 * (super.getMotor().getCaballos() * super.getVelocidad());
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void encender() {
        System.out.println("Enccendido correctamente");
    }




}
