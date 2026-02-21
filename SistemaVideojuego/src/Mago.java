public class Mago extends Personaje{

    private int poderMagico;

    @Override
    public String toString() {
        return super.toString() + " Mago [poderMagico=" + poderMagico + "]";
    }

    public Mago(){

    }

    public Mago(String nombre, int nivel, int poderMagico){
        super(nombre, nivel);
        this.poderMagico=poderMagico;
    }

    @Override
    public void atacar() {
        System.out.println("EL mago lanza un hechizo");
        
    }

    @Override
    public int calcularDanio() {
        int calcularDanio = poderMagico * getNivel();
        return calcularDanio;
    }

    // getter and setter
    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }




}
