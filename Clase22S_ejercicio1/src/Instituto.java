import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList <OfertaAcademica> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertas= new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica oferta){
        ofertas.add(oferta);
    }

    public String generarInforme(){
        String informacion = "";

        for(OfertaAcademica oferta: ofertas){
            informacion+= oferta.mostrarOferta() + "/n";
        }

        return informacion;
    }

    

}
