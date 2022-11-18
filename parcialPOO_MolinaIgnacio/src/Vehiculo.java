import java.time.LocalDate;

public abstract class Vehiculo {

    private Dueño dueño;
    private LocalDate fechaAdquirido;
    private Double cotizacionUsd;
    private String marca;
    private String patente;
    private Boolean esNacional;

    public Vehiculo(Dueño dueño, LocalDate fechaAdquirido, Double cotizacionUsd, String marca, String patente, Boolean esNacional) {
        this.dueño = dueño;
        this.fechaAdquirido = fechaAdquirido;
        this.cotizacionUsd = cotizacionUsd;
        this.marca = marca;
        this.patente = patente;
        this.esNacional = esNacional;
    }

    

    public Boolean getEsNacional() {
        return esNacional;
    }
}
