public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
    }

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        this.saldo=this.saldo+cantidad;
    }

    public void retirar(double retirar){
        this.saldo=this.saldo-retirar;
    }
    


}
