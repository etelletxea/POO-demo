public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad < 0 || edad > 100)
            this.edad=0;
        else this.edad = edad;
    }
    public boolean esAdolescente(){
        if (this.edad>12 && this.edad<20)
         return true;
        else return false;
    }
    public String getFullName(){
     String valor="";
    if (this.nombre.isEmpty() && this.apellidos.isEmpty())
        valor="";
    else if (this.nombre.isEmpty()) {
        valor=this.apellidos;
    }
    else valor=this.nombre+" "+this.apellidos;
    return (valor);}
}
