public class Alumno {

    private String nombre;
    private String matricula;

    Curso cursoInscrito;

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", cursoInscrito=" + cursoInscrito + "]";
    }

    public Alumno(String nombre, String matricula, Curso cursoInscrito) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cursoInscrito = cursoInscrito;
    }

    public Alumno(){
        this.cursoInscrito = new Curso();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCursoInscrito() {
        return cursoInscrito;
    }

    public void setCursoInscrito(Curso cursoInscrito) {
        this.cursoInscrito = cursoInscrito;
    }

    

}
