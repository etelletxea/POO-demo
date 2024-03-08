package excepciones;

public class PeligroException extends Exception{
    private final ErrorCode code;

    public PeligroException(int code) {
        this.code = code;
    }
    public void showMessage(){
        System.out.println("código de error: "+code.INVALID_INPUT+" el objeto "+bienes+" del equipaje "+ equipaje.nombre + "pertenece a sustancias peligrosas");
    }
}
