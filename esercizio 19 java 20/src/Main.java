public class Main {
    public static void main(String[] args) {
        int numeroLimiteSuperiore=5;
        System.out.println(sommaLimiteSuperiore(numeroLimiteSuperiore));
    }
    public static int sommaLimiteSuperiore(int limiteSuperiore){
        int somma=0;
        int i=0;
        while (i<limiteSuperiore){
            somma+=i;
            i++;
        }
        return somma;
    }
}