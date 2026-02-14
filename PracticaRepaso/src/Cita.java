public class Cita {

    private String fecha;
    private String motivo;

    private Doctor doctorAsignado;

    public Cita(String fecha, String motivo, Doctor doctorAsignado){
        this.fecha=fecha;
        this.motivo=motivo;
        this.doctorAsignado=doctorAsignado;
    }

    public Cita(){
        this.doctorAsignado = new Doctor();
    }




}
