public class Start {
    public static void main(String[] args) {
        numInverso(6,3);

    }
    public static void numInverso(int partenza, int numRisultati){
        for (int i=partenza; i>partenza-numRisultati; i--){
            System.out.println(i);
        }
    }
}
