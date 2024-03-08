package polimorfismo;

public class Forma {
    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    protected double calculoArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
} // Fin forma
    class Esfera extends Forma {
        private double radio;
        public Esfera(String nombre, double radio) {
            super(nombre);
            this.radio = radio;
        }

        @Override
        protected double calculoArea() {
           double area = 4 * Math.PI * Math.pow(this.radio, 2);
            return (area);
        }

        @Override
        public String toString() {
            return "Esfera{" +
                    "radio=" + radio +
                    '}';
        }
    }// Fin esfera
    class Rectangulo extends Forma {
        private double longitud;
        private double ancho;

        public Rectangulo(String nombre, double longitud, double ancho) {
            super(nombre);
            this.longitud = longitud;
            this.ancho = ancho;
        }

        @Override
        protected double calculoArea() {
            double area;
            area = longitud * ancho;
            return (area);
        }
    }
        class Cilindro extends Forma{
            private double radio;
            private double altura;
            public Cilindro(String nombre, double radio,double altura) {
                super(nombre);
                this.radio=radio;
                this.altura=altura;
            }

            @Override
            protected double calculoArea() {
                double area;
                area=Math.PI*Math.pow(radio,2)*this.altura;
                return area;
            }

        }




