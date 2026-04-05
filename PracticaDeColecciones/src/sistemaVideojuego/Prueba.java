package sistemaVideojuego;

import java.util.HashSet;
import java.util.Set;

public class Prueba {

    public static void main(String[] args) {
        

        Videojuego v1 = new Videojuego("001","Zelda","Aventura");
        Videojuego v3 = new Videojuego("001","Zelda","Aventura");
        Videojuego v2 = new Videojuego("004","GTA V","Accion y disparo");


        Set <Videojuego> Juegos = new HashSet<Videojuego>();
        Juegos.add(v1);
        Juegos.add(v2);
        Juegos.add(v3);

        for (Videojuego v : Juegos) {
            System.out.println(v);
        }

        System.out.println(Juegos.size());

    }

}
