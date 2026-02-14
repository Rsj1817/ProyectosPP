public class Paciente extends Persona{

    private int numeroPaciente;
    private String tipoSangre;

    private Cita citaAsignada;

    @Override
    public String toString() {
        return super.toString() + " Paciente [numeroPaciente=" + numeroPaciente + ", tipoSangre=" + tipoSangre + ", citaAsignada="
                + citaAsignada + "]";
    }

    public Paciente(String nombre, int edad, int numeroPaciente, String tipoSangre, Cita citaAsignada){
        super(nombre, edad);
        this.numeroPaciente=numeroPaciente;
        this.tipoSangre=tipoSangre;
        this.citaAsignada=citaAsignada;
    }

    public Paciente(){
        this.citaAsignada = new Cita();
    }

    public int getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Cita getCitaAsignada() {
        return citaAsignada;
    }

    public void setCitaAsignada(Cita citaAsignada) {
        this.citaAsignada = citaAsignada;
    }






}
