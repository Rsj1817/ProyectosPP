public class Departamento {

    private String nombreDepa;
    private String edificio;

    @Override
    public String toString() {
        return "Departamento [nombreDepa=" + nombreDepa + ", edificio=" + edificio + "]";
    }

    public Departamento() {
        
    }

    public Departamento(String edificio, String nombreDepa) {
        this.edificio = edificio;
        this.nombreDepa = nombreDepa;
    }

    public String getNombreDepa() {
        return nombreDepa;
    }

    public void setNombreDepa(String nombreDepa) {
        this.nombreDepa = nombreDepa;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

}
