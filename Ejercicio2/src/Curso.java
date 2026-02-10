public class Curso {

    private String nombre;
    private String creditos;

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", creditos=" + creditos + "]";
    }

    public Curso(){

    }

    public Curso(String nombre, String creditos){
        this.nombre=nombre;
        this.creditos=creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    

}
