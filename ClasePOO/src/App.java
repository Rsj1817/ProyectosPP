public class App {
    public static void main(String[] args) throws Exception {

        Departamento depa1 = new Departamento("87A","Las lomas");
        Direccion direccion1 = new Direccion("Venustiano carranza","London");

        Profesor p1 = new Profesor("Juan Jose",29,12,500,depa1);

        Alumno a1 = new Alumno("Pedrito",20,"20243DS185","Sistemas computacionales",direccion1);
        Alumno a2 = new Alumno("Pedrito",20,"20243DS185","Sistemas computacionales",direccion1);

        Persona[] personas = {p1,a1};

        for (Persona persona : personas) {
            System.out.println(persona);
        }

        p1.getDepartamentoProfesor().setNombreDepa("El Rincon");

        System.out.println(p1.getDepartamentoProfesor().getNombreDepa());

        if(a1.equals(a2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }

    }
}
