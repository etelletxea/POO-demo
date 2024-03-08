public class Coche {
    private int puertas;
    private double peso;
    private double precio;
    private String modelo;
    private String color;
    private String marca;

     public Coche()
     {
         this.marca="";
         this.modelo="";
         this.peso=0;
         this.puertas=0;
         this.color="";
         this.precio=0;
         }
    public Coche(String modelo,String marca,double peso,int puertas,String color,double precio)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.peso=peso;
        this.puertas=puertas;
        this.color=color;
        this.precio=precio;
    }
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
