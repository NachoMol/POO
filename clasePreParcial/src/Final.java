public class Final extends Examen implements Comparable{

    private Double notaOral;
    private String tema;

        public Final(String titulo, String enunciado, Alumno alumno, Double notaOral, String tema) {
        super(titulo, enunciado, alumno);
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

    public void rendirOral(double nota){
        this.notaOral = nota;
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
