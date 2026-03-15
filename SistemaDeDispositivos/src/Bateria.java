public class Bateria {


    private int capacidad;
    private String tipo;

    public Bateria(){

    }

    public Bateria(int capacidad, String tipo){
        this.capacidad=capacidad;
        this.tipo=tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
