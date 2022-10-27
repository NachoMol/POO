public class UsuarioJuego {
    private String nombre;
        private String clave;
    private Double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
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

    public String toString(){
        return "Usuario: " + nombre + " Clave: " + clave +  " Puntaje: " + puntaje + " Nivel: " + nivel;
    }

}
