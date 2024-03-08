package polimorfismo;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            Pelicula pelicula = peliculaAleatoria();
            System.out.println("Pelicula " + i + " " + pelicula.getTitulo() + " \n" + pelicula.trama());
        }
    }
    public static Pelicula peliculaAleatoria() {
        int numero = (int) (Math.random()*5) + 1; //genera un número aleatorio entre 1 - 5
        System.out.println(numero);
        switch (numero) {
            case 1:
                return new Spiderman();
            case 2:
                return new Batman();
            case 3:
                return new Zombieland();
            case 4:
                return new StarWars();
            case 5:
                return new PeliRandom();
        }
        return null;
    }
}
