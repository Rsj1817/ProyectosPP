public class Consultorio {

    private int numeroConsultorio;
    private String piso;

    @Override
    public String toString() {
        return "Consultorio [numeroConsultorio=" + numeroConsultorio + ", piso=" + piso + "]";
    }

    public Consultorio(int numeroConsultorio, String piso){
        this.numeroConsultorio=numeroConsultorio;
        this.piso=piso;
    }

    public Consultorio() {
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

}
