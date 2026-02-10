public class App {
    public static void main(String[] args) throws Exception {

        CuentaBancaria cuenta1 = new CuentaBancaria("129045556",500);
        CuentaBancaria cuenta2 = new CuentaBancaria("9000012233",90);

        Cliente c1 = new Cliente("Chatsito",cuenta1);
        Cliente c2 = new Cliente("Maria",cuenta2);

        Cliente[] clientes = {c1,c2};

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        c1.getCuentaCliente().depositar(200);

        System.out.println(c1.getCuentaCliente().getSaldo());

        c1.getCuentaCliente().retirar(50);
        System.out.println(c1.getCuentaCliente().getSaldo());

        //esto es una prueba

        
    }
}
