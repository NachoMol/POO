import java.io.ObjectStreamException;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion){
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if(obj == null){
            resultado = false;
        }
        if(obj.getClass() != this.getClass() ){
            resultado =  false;
        }
        Objeto temp = (Objeto)obj;

        if(((Objeto) obj).direccion== temp.direccion){
            resultado =  true;
        }
        return resultado;
    }
}
