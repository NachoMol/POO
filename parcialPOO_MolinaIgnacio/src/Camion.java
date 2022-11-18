import java.time.LocalDate;

public class Camion extends Vehiculo implements Comparable<Camion>{

    private Integer cantidadEjes;
    private Double capacidad;

    public Camion(Dueño dueño, LocalDate fechaAdquirido, Double cotizacionUsd, String marca, String patente, Boolean esNacional, Integer cantidadEjes, Double capacidad) {
        super(dueño, fechaAdquirido, cotizacionUsd, marca, patente, esNacional);
        this.cantidadEjes = cantidadEjes;
        this.capacidad = capacidad;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public int compareTo(Camion C){
        if(this.capacidad > C.getCapacidad()){
            return 1;
        } else if (this.capacidad == C.getCapacidad()) {
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " cantidad de Ejes: " + cantidadEjes + " Capacidad (en toneladas): " + capacidad;
    }
}
