
public class ClienteVIP {
    String nombre;
    double limiteCredito;
    String email;
    tipoVIP tipoVip;
    public ClienteVIP(){
        this("",0,"",tipoVIP.NORMAL);
    }
    public ClienteVIP(String nombre,double limiteCredito){
        this(nombre,limiteCredito,"",tipoVIP.NORMAL);
    }
    public ClienteVIP(String nombre,double limiteCredito,String email,tipoVIP tipoVip){
        this.nombre=nombre;
        this.limiteCredito=limiteCredito;
        this.email=email;
        this.tipoVip=tipoVip;
    }

}
