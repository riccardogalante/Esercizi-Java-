public class Start {
    public static void main(String[] args) {
        int x= 27;
        System.out.println(x + " è un numero pari? = " + pari(x));
        System.out.println(x+ " è un numero dispari? = " + dispari(x));

    }
    public static boolean pari(int x){
        boolean pari = (x% 2 == 0);
        return pari;
    }

    public static Boolean dispari(int x){
        boolean dispari = (x% 2 != 0);
        return dispari;
    }

}
