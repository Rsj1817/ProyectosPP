import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println();

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        Guerrero g1 = new Guerrero("Kali",2,arma1,23);
        Mago m1 = new Mago("Merlin",15,arma2,34);
        Mago m2 = new Mago("Merlin",15,arma2,34);

        //Personaje[] personajes = {g1,m1};

        /*for (Personaje p : personajes) {
            System.out.println(p.toString());
        }*/

        System.out.println(g1.atacar());
        System.out.println(g1.getNivel());
        g1.subirNivel();
        System.out.println(g1.getNivel());

        Set<Personaje> personajes = new HashSet<>();
        personajes.add(g1);
        personajes.add(m1);
        personajes.add(m2);

        for (Personaje p : personajes) {
            System.out.println(p);
        }

        System.out.println(personajes.size());

        System.out.println(m1.equals(m2));

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());


    }
}
