public class App {
    public static void main(String[] args) throws Exception {

        Bateria b1 = new Bateria(5000,"Lionn");
        Bateria b2 = new Bateria(4800,"Markup");

        Dispositivo d1 = new Telefono("Xiaomi","Xiamo redmi note 10 pro",b1,4);
        Dispositivo d2 = new Laptop("Asus","Asus tuf gamin",b2,2);

        Dispositivo[] dispositivos = {d1,d2};

        Conectable c1 = new Laptop("Asus","Asus tuf gamin",b2,2);

        for(Dispositivo d: dispositivos){
            System.out.println(d.getMarca());
            System.out.println(d.consumoEnergia());
            if (d instanceof Conectable){
                ((Conectable) d).conectarWifi();
            }
        }


        Laptop l1 = (Laptop) d2;
        ((Laptop) d2).conectarWifi();
        l1.conectarWifi();

//        Encendible e = new Moto("Suzuki",45,m2,true);
//
//        if(e instanceof Moto){
//            Moto m = (Moto) e;
//            m.acelerar(10);
//        }

    }
}
