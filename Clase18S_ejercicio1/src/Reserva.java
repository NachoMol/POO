import java.util.ArrayList;

public class Reserva {

    private Integer codigo;

    private String estacionPartida;

    private String estacionLlegada;
    private Integer cantPasjeros;
    private static Double precioBoleto = 50.0;

    public Reserva(Integer codigo, String estacionPartida, String estacionLlegada, Integer cantPasjeros) {
        this.codigo = codigo;
        this.estacionPartida = estacionPartida;
        this.estacionLlegada = estacionLlegada;
        this.cantPasjeros = cantPasjeros;
    }

    public Double precioReserva() {
        return (cantPasjeros*precioBoleto) * 0.8;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionLlegada() {
        return estacionLlegada;
    }



}
