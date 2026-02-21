public class Guerrero extends Personaje {

    private int fuerza;

    @Override
    public String toString() {
        return super.toString() + " Guerrero [fuerza=" + fuerza + "]";
    }

    public Guerrero(){

    }

    public Guerrero(String nombre, int nivel, int fuerza){
        super(nombre, nivel);
        this.fuerza=fuerza;
    }



    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con espada");
    }

    @Override
    public int calcularDanio() {
        int calcularDanio = fuerza * super.getNivel();

        return calcularDanio;
    }


    // getter and setter
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }





}
