public class Cliente {

    private String nombre;

    private CuentaBancaria cuentaCliente;

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cuentaCliente=" + cuentaCliente + "]";
    }

    public Cliente() {
        CuentaBancaria cuentaCliente = new CuentaBancaria();
    }

    public Cliente(String nombre, CuentaBancaria cuentaCliente){
        this.nombre=nombre;
        this.cuentaCliente=cuentaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(CuentaBancaria cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }
    
    

}
