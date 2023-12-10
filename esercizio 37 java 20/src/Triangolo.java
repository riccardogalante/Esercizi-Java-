class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo calcolaArea per il triangolo
    @Override
    public void calcolaArea() {
        double area = 0.5 * base * altezza;
        System.out.println("L'area del triangolo è: " + area);
    }

    // Metodo per ottenere il tipo di forma
    public TipoForma getTipo() {
        return TipoForma.TRIANGOLO;
    }
}