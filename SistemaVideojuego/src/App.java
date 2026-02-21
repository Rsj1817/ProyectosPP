public class App {
    public static void main(String[] args) throws Exception {
        
        Guerrero g1 = new Guerrero("Tor",10,12);
        Mago m1 = new Mago("Merlin",8,45);

        g1.mostrarInformacion();
        m1.mostrarInformacion();

        Personaje[] personajes = {g1,m1};
        
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }

        g1.atacar();
        System.out.println(g1.calcularDanio());

        m1.atacar();
        System.out.println(m1.calcularDanio());

        m1.mostrarInformacion();

        m1.subirNivel();

        m1.mostrarInformacion();

        System.out.println(m1.calcularDanio());




    }
}
