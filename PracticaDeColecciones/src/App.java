import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Set<String> nombres = new HashSet<String>();

        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Juan"); // duplicado
        nombres.add("Daniela");
        nombres.add("Francisco");

        System.out.println(nombres);
        

        //Mas ejemplos
        Set<String> datos = new HashSet<String>();

        datos.add("A");
        datos.add("B");
        datos.add("A");
        datos.add("C");

        System.out.println(datos);
    
        //prueba de numeros aleatorios
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(1);
        numeros.add(50);
        numeros.add(3);
        numeros.add(20);

        System.out.println(numeros);

        //otra prueba de valores
        Set<Integer> numerosx = new HashSet<>();

        numerosx.add(1000);
        numerosx.add(2);
        numerosx.add(300);
        numerosx.add(45);
        numerosx.add(7);

        System.out.println(numerosx);

    }
}
