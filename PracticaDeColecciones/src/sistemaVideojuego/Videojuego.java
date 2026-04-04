package sistemaVideojuego;

public class Videojuego {

    private String id;
    private String nombre;
    private String genero;


    public Videojuego(){

    }

    public Videojuego(String id, String nombre, String genero){
        this.id=id;
        this.nombre=nombre;
        this.genero=genero;
    }

    @Override
    public String toString() {
        return "Videojuego: " + nombre + " (" + genero + ")" + " - ID: " + id;
    }

    //Getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    



}
