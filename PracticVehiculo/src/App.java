public class App {
    public static void main(String[] args) throws Exception {
        
        Motor m1 = new Motor(23,"hibrido");
        Motor m2 = new Motor(50,"Gasolina");


        Auto auto1 = new Auto("BMW",23,m1,4);
        Moto moto1 = new Moto("SUSUKI",45,m2,true);


        Vehiculo[]vehiculos = {auto1,moto1};


        for (Vehiculo vehiculo : vehiculos) {
            System.out.println();
            System.out.println(vehiculo.toString());

        }

        System.out.println();

        auto1.encender();
        moto1.encender();
        System.out.println();

        System.out.println(moto1.calcularConsumo());
        System.out.println(auto1.calcularConsumo());
        System.out.println();

        System.out.println(moto1.getVelocidad());
        moto1.acelerar(2);
        System.out.println(moto1.getVelocidad());

        Encendible e = new Auto("BMW", 50, m1, 4);
        e.encender();



    }
}
