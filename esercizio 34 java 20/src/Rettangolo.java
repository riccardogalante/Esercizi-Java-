class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    // Costruttore
    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    // Override del metodo calcolaArea per calcolare l'area del rettangolo
    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}