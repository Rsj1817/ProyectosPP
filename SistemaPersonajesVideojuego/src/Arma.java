public class Arma {

    private String nombreArma;

    private double danio;


    //contructores
    public Arma(){

    }

    public Arma(String nombreArma, double danio){
        this.nombreArma=nombreArma;
        this.danio=danio;
    }


    //getter and setter
    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    //metodo tostring
    @Override
    public String toString() {
        return "Tu Arma [ nombre=" + nombreArma + ", daño=" + danio + " ]";
    }



}
