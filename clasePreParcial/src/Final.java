public class Final extends Examen implements Comparable<Final>{

    private Double notaOral;
    private Integer tema;

        public Final(String titulo, String enunciado, Alumno alumno, Double notaOral, Integer tema) {
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
    public int compareTo(Final f) {

        if(((this.getNota() + this.notaOral) / 2) > (f.notaOral + f.getNota()) ){
            return 1;
        }else if(((this.getNota() + this.notaOral) / 2) == (f.notaOral + f.getNota())){
            return 0;
        }else{
            return -1;
        }

    }
}
