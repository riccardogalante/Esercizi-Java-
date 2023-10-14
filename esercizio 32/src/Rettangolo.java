public class Rettangolo extends Forma {
    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public int calcolaArea() {
        super.calcolaArea();
        return base*altezza;
    }
}
