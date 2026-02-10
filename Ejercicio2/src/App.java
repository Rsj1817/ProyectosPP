public class App {
    public static void main(String[] args) throws Exception {
        
        Curso c1 = new Curso();
        Curso c2 = new Curso("Curso de ingles","12 coins");

        Alumno a1 = new Alumno("Luis Angel","20243ds190",c1);
        Alumno a2 = new Alumno("Ricardo Jaciel","20243ds876",c2);

        Alumno[] alumnos = {a1,a2};
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        a1.getCursoInscrito().setNombre("Curso Fisica");

        System.out.println(a1.getCursoInscrito().getNombre());

    }
}
