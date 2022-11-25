public class EmpresaException extends Exception{

    public EmpresaException() {
        super();
    }

    public EmpresaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Exception: " + getClass().getName() + "Mensaje de error: " + getMessage();
    }
}
