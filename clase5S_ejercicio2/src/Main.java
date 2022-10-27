public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("NachoMol" , "asdasd");
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.subirNivel();

        usuario1.bonus(50);

        System.out.println(usuario1);

    }
}