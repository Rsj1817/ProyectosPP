public class App {
    public static void main(String[] args) throws Exception {
        
        Consultorio c1 = new Consultorio(2,"no 23");

        Doctor doc1 = new Doctor("Ana lilia",27,"HIO3434","Cirujano",c1);

        Cita cita1 = new Cita("14/02/2026","Dolor de cabeza",doc1);

        Paciente paciente1 = new Paciente("Jose",12,1,"B+",cita1);

        Cita cita2 = new Cita();

        Paciente paciente2 = new Paciente("Manuel",22,2,"O-",cita2);

        Persona[] personas = {doc1,paciente1,paciente2};

        for (Persona persona : personas) {
            System.out.println();
            System.out.println(persona);
        } 
        

        // Comprobar
        System.out.println();

        Paciente paciente3 = new Paciente("Jose",12,1,"B+",cita1);
        Paciente paciente4 = new Paciente("Jose",12,1,"B+",cita1);

        if(paciente3.equals(paciente4)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");

        }

        doc1.getConsultorio().setNumeroConsultorio(10);
        System.out.println(doc1.getConsultorio().getNumeroConsultorio());

        paciente1.getTipoSangre();

    }
}