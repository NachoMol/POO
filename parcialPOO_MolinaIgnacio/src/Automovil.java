import java.time.LocalDate;

public class Automovil extends Vehiculo{

    private Boolean usaGas;
    private Integer cilindrada;

    public Automovil(Dueño dueño, LocalDate fechaAdquirido, Double cotizacionUsd, String marca, String patente, Boolean esNacional, Boolean usaGas, Integer cilindrada) {
        super(dueño, fechaAdquirido, cotizacionUsd, marca, patente, esNacional);
        this.usaGas = usaGas;
        this.cilindrada = cilindrada;

    }

    public Boolean esEconomico(){
        if (usaGas){
            return true;
        }else{
            if(cilindrada < 1200){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " usa gas?: " + usaGas + " cilindrada: " + cilindrada;
    }
}
