public class Motor {

    private int caballos;
    private String tipo;

    @Override
    public String toString() {
        return "Tu carro tiene el siguiente motor [caballos=" + caballos + ", tipo=" + tipo + "]";
    }
    // esto es un ejemplo

    public Motor(){

    }

    public Motor(int caballos, String tipo){
        this.caballos=caballos;
        this.tipo=tipo;
    }


    public int getCaballos() {
        return caballos;
    }
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
