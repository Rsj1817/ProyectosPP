public class Profesor extends Persona {

    private int numeroEmpleado;
    private double salario;

    private Departamento departamentoProfesor;

    public Profesor(String nombre, int edad, int numeroEmpleado, double salario, Departamento departamentoProfesor){
        super(nombre,edad);
        this.numeroEmpleado=numeroEmpleado;
        this.salario=salario;
        this.departamentoProfesor=departamentoProfesor;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Profesor [numeroEmpleado=" + numeroEmpleado + ", salario=" + salario + ", departamentoProfesor="
                + departamentoProfesor + "]";
    }



    public Profesor(){
        this.departamentoProfesor = new Departamento();
    }

    

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamentoProfesor() {
        return departamentoProfesor;
    }

    public void setDepartamentoProfesor(Departamento departamentoProfesor) {
        this.departamentoProfesor = departamentoProfesor;
    }



}
