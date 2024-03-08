public class Figura {
    public double getArea(double radio){
        return(radio*radio);
    }
    public double getArea(double x,double y){
        if (x<0 || y<0)
            return(-1);
        else return(x*y);
    }

}
