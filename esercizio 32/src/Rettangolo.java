public class Rettangolo extends Forma {

    public int base;
    public int altezza;
    public Rettangolo(int base, int altezza) {
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}
