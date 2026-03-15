public abstract class Dispositivo {

    private String marca;

    private String modelo;

    private Bateria bateria;


    public Dispositivo(){
        this.bateria = new Bateria();
    }

    public Dispositivo(String marca, String modelo, Bateria bateria){
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
}
