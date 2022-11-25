import java.util.ArrayList;

public class Empresa {

    private ArrayList<Reserva> reservas;

    public Empresa() {
    }

    public Double recaudacionTotal(){
        Double resultado = 0.0;
        for(int i = 0; i <= reservas.size() ; i++){
            resultado =+ reservas.get(i).precioReserva();
        }
        return resultado;
    }

    public Integer cantVecesRecorrida(String estacion) throws EmpresaException {
        Integer resultado = 0;
        if(estacion.equals("Buenos Aires") || estacion.equals("Bragado")) {
            for (int i = 0; i <= reservas.size(); i++) {
                if (reservas.get(i).getEstacionLlegada().equals(estacion) || reservas.get(i).getEstacionPartida().equals(estacion)) {
                    resultado++;
                }
            }
            }
        else{
            throw new EmpresaException("No es una estación válida");
        }

        return resultado;
    }

    public void agregarReserva(Reserva r){
        reservas.add(r);
    }

}
