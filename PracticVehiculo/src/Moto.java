public class Moto extends Vehiculo implements Encendible{

    private boolean cascoIncluido;

    public Moto(){

    }

    public Moto(String marca, int velocidad, Motor motor, boolean cascoIncluido){
        super(marca,velocidad,motor);
        this.cascoIncluido=cascoIncluido;
    }

    public boolean isCascoIncluido() {
        return cascoIncluido;
    }

    public void setCascoIncluido(boolean cascoIncluido) {
        this.cascoIncluido = cascoIncluido;
    }

    @Override
    public double calcularConsumo() {
        return 1.2 * (super.getMotor().getCaballos() * super.getVelocidad());
    }

    @Override
    public void encender() {
        System.out.println("Se encendio bien");
    }

    public void acelerar(int incremento){
        super.setVelocidad(super.getVelocidad() + incremento + 100);
    }

}
