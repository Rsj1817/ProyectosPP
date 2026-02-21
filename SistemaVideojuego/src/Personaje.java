
public abstract class Personaje {

    private String nombre;
    private int nivel;

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", nivel=" + nivel + "] ";
    }

    public Personaje(){
        
    }

    public Personaje(String nombre, int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Clases abstractas metodos
    public abstract void atacar();

    public abstract int calcularDanio();

    public void mostrarInformacion(){
        System.out.println("Tu nombre es  " + this.nombre + " y nivel " + this.nivel);
    }

    public void subirNivel(){
        this.nivel= this.nivel + 1;
    }

}
