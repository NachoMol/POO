public abstract class Examen {

    private String titulo;
    private String enunciado;
    private Double nota;


    public Examen(String titulo, String enunciado, Double nota) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public abstract Boolean aprobado();

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
