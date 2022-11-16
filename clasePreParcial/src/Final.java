public class Final extends Examen implements Comparable{

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

    @Override
    public int compareTo(Object o) {
        Final f = (Final) o;

        if((this.getNota() + this.notaOral) > (f.notaOral + f.getNota()) ){
            return 1;
        }else if((this.getNota() + this.notaOral) == (f.notaOral + f.getNota())){
            return 0;
        }else{
            return -1;
        }

    }
}
