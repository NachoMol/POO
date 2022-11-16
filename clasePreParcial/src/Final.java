public class Final extends Examen{

    private Double notaOral;
    private String tema;

    public Final(String titulo, String enunciado, Double nota, Double notaOral, String tema) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.tema = tema;
    }

    @Override
    public Boolean aprobado(){
        if(this.getNota() >= 4 && this.notaOral > 4){
            return true;
        }else{
            return false;
        }
    }

}
