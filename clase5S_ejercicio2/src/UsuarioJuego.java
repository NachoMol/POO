public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public void UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public void aumentarPuntaje(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor){
        puntaje += valor;
    }

    public Double getPuntaje(){
        return puntaje;
    }

    public int getNivel(){
        return nivel;
    }



}
