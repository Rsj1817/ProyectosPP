public class Alumno extends Persona {


    private String matricula;
    private String carrera;

    @Override
    public String toString() {
        return super.toString() + "Alumno [matricula=" + matricula + ", carrera=" + carrera + ", dirrecionEstudiante="
                + dirrecionEstudiante + "]";
    }

    private Direccion dirrecionEstudiante;

    public Alumno(String nombre, int edad, String matricula, String carrera, Direccion direccionEstudiante){
        super(nombre,edad);
        this.matricula=matricula;
        this.carrera=carrera;
        this.dirrecionEstudiante=direccionEstudiante;
    }


    public Alumno() {
        this.dirrecionEstudiante = new Direccion();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Direccion getDirrecionEstudiante() {
        return dirrecionEstudiante;
    }

    public void setDirrecionEstudiante(Direccion dirrecionEstudiante) {
        this.dirrecionEstudiante = dirrecionEstudiante;
    }




}
