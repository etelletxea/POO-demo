package polimorfismo;

public class Pelicula {
    private String titulo;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String trama() {
        return "No hay trama";
    }
}
class Spiderman extends Pelicula {
    public Spiderman() {
        super("Spiderman");
    }

    @Override
    public String trama() {
        return "Un hombre que le muerde una araña y adquiere sus poderes.";
    }
}
class Batman extends Pelicula {
    public Batman() {
        super("Batman");
    }

    @Override
    public String trama() {
        return "Un hombre que le muerde un murciélago y adquiere sus poderes.";
    }
}

class Zombieland extends Pelicula {
    public Zombieland() {
        super("Zombieland");
    }

    @Override
    public String trama() {
        return "Un puñado de humanos convertidos en zombies tratan de hacerse con el mundo";
    }
}
class StarWars extends Pelicula {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String trama() {
        return "Las fuerzas imperiales tratan de hacerse con control del mundo";
    }
}

class PeliRandom extends Pelicula {
    public PeliRandom() {
        super("PeliRandom");
    }
}