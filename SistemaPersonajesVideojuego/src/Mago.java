public class Mago extends Personaje{

    private double mana;

    public Mago(){

    }

    public Mago(String nombre, int nivel, Arma arma, double mana){
        super(nombre, nivel, arma);
        this.mana=mana;
    }

    //metodo implementado
    @Override
    public double atacar() {
        return mana * super.getNivel();
    }
    
    //getter and setter
        public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " Mago [mana=" + mana + "]";
    }
    

}
