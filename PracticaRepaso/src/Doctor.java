public class Doctor extends Persona{

    private String cedulaProfesional;
    private String especialidad;
    
    private Consultorio consultorio;

    @Override
    public String toString() {
        return super.toString() + " Doctor [cedulaProfesional=" + cedulaProfesional + ", especialidad=" + especialidad + ", consultorio="
                + consultorio + "]";
    }


    public Doctor(String nombre, int edad, String cedulaProfesional, String especialidad, Consultorio consultorio){
        super(nombre,edad);
        this.cedulaProfesional=cedulaProfesional;
        this.especialidad=especialidad;
        this.consultorio=consultorio;
    }

    public Doctor(){
        this.consultorio = new Consultorio();
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }




}
