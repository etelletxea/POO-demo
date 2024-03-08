package abstractas;

public class HourlyEmployee extends Employee {
    protected double tasapago;
    protected int numhoras;

    public HourlyEmployee(String nombre, String cargo) {
        super(nombre, cargo);
    }

    @Override
    public double calculateWeeklyDay(double tasa, int horas) {
        return (tasa*horas);
    }
}
