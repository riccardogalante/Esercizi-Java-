class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    // Costruttore
    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    // Implementazione del metodo calcolaArea per il rettangolo
    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("L'area del rettangolo è: " + area);
    }

    // Metodo per ottenere il tipo di forma
    public TipoForma getTipo() {
        return TipoForma.RETTANGOLO;
    }
}
