package excepciones;

public class PeligroException extends Exception{
    private final ErrorCode code;

    public PeligroException(ErrorCode code) {
        this.code = code;
    }
    public void showMessage(int bienes,Equipaje equipaje){
        System.out.println("código de error: "+code.INVALID_INPUT+" el objeto "+bienes+" del equipaje "+ equipaje.nombre + "pertenece a sustancias peligrosas");
    }
}
