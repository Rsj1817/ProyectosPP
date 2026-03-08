public abstract class Vehiculo{

    private String marca;
    private int velocidad;

    private Motor motor;

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", velocidad=" + velocidad + ", motor=" + motor + "]";
    }

    public Vehiculo(){
        this.motor = new Motor();
    }

    public Vehiculo(String marca, int velocidad, Motor motor){
        this.marca=marca;
        this.velocidad=velocidad;
        this.motor=motor;
    }

    //metodos que se deben de implementar
    public abstract double calcularConsumo();

    public void acelerar(int incremento){
        this.velocidad = this.velocidad + incremento;
    }



    //getter and setter
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
