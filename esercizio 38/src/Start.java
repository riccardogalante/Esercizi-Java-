public class Start {
    public static void main(String[] args) {
        int num=2;

        System.out.println(rangeVerifica(num));

    }
    public static boolean rangeVerifica(int number){
        int min =1;
        int max =20;
        if (number < min || number > max){
            return true;
        } else {
            throw new RuntimeException("il numero non è compreso");
        }

    }
}

//    Scrivere una funzione che controlli se un numero int è in un determinato range
//    Se lo è ritorna true se non lo è lancia un'eccezione



