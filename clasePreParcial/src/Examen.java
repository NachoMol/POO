public abstract class Examen {

    private String titulo;
    private String enunciado;

    private Alumno alumno;
    private Double nota;


    public Examen(String titulo, String enunciado, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public abstract Boolean aprobado();

    public void calificar (double nota){
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Double getNota() {
        return nota;
    }
}
