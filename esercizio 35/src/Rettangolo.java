public class Rettangolo implements Forma {

    public double base;
    public double altezza;
    public Rettangolo(double base, double altezza) {
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    public double calcolaArea() {
        return base*altezza;
    }
}
