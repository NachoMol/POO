public class Main {
    public static void main(String[] args) {

    Instituto instituto =  new Instituto("DH");

    OfertaFactory ofertaFactory = OfertaFactory.obtenerInstancia();

    Curso curso1= (Curso)ofertaFactory.crearOferta(OfertaFactory.CURSO, "FrontEnd","HTML/CSS");

    curso1.setCargaHorariaMensual(16);
    curso1.setCantidadMeses(2);
    curso1.setValorHora(1000.0);

    Curso curso2= (Curso)ofertaFactory.crearOferta(OfertaFactory.CURSO, "BackEnd", "Java");

        curso2.setCargaHorariaMensual(20);
        curso2.setCantidadMeses(2);
        curso2.setValorHora(900);


    ProgramaIntensivo programa= (ProgramaIntensivo)ofertaFactory.crearOferta(OfertaFactory.PROGRAMA, "FullStack", "Avanzado");

    programa.setPorcentajeBonificacion(20);

    programa.agregarOferta(curso1);
    programa.agregarOferta(curso2);

    instituto.agregarOfertaAcademica(programa);
    instituto.agregarOfertaAcademica(curso1);
    instituto.agregarOfertaAcademica(curso2);

        System.out.println(instituto.generarInforme());

    }
}