public class Guerrero extends Personaje{

    private double fuerza;


    public Guerrero(String nombre, int nivel, Arma arma, double fuerza){
        super(nombre, nivel, arma);
        this.fuerza=fuerza;
    }

    public Guerrero(){

    }

    //metodo implementado
    @Override
    public double atacar() {
        return fuerza * super.getNivel();
    }

    //getter an setter
    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

        //toString
    @Override
    public String toString() {
        return super.toString() + " Guerrero [fuerza=" + fuerza + "]";
    }
    


}
