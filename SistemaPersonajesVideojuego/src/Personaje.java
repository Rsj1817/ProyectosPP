public abstract  class Personaje {

    private String nombre;
    private int nivel;

    private Arma arma;


    public Personaje(){
        this.arma = new Arma();
    }

    public Personaje(String nombre, int nivel, Arma arma){
        this.nombre=nombre;
        this.nivel=nivel;
        this.arma=arma;
    }

    //metodos personalizados
    public abstract double atacar();

    public void subirNivel(){
        this.nivel = this.nivel + 3;
    };

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    //ToString
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", Rifle" + arma + "]";
    }
    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Personaje other = (Personaje) obj;

        return this.nombre.equals(other.nombre);
    }
    
    @Override
    public int hashCode() {
        return  nombre.hashCode();
    }




}
