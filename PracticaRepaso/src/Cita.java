public class Cita {

    private String fecha;
    private String motivo;

    @Override
    public String toString() {
        return "Cita [fecha=" + fecha + ", motivo=" + motivo + ", doctorAsignado=" + doctorAsignado + "]";
    }

    private Doctor doctorAsignado;

    public Cita(String fecha, String motivo, Doctor doctorAsignado){
        this.fecha=fecha;
        this.motivo=motivo;
        this.doctorAsignado=doctorAsignado;
    }

    public Cita(){
        this.doctorAsignado = new Doctor();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Doctor getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(Doctor doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }




}
