public class Startr {
    public static void main(String[] args) {
        String rykard= "Rykard";
        int lunghezza= rykard.length();
        dieci(lunghezza);

    }
    public static void dieci (int lung){
        if (lung>10){
            System.out.println( "Lunghezza maggiore di 10");
        } else if (lung==10) {
            System.out.println("Lunghezza pari a 10");
        } else {
            System.out.println("Lunghezza minore di 10");
        }
    }
}
