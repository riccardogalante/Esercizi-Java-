public class Start {
    public static void main(String[] args) {
        int num=9;
        int min =10;
        int max =20;

        System.out.println(rangeVerifica(num, min, max));

    }
    public static boolean rangeVerifica(int number,int min,int max){

        if (number< max && number>min){
            return true;
        } else {
            throw new RuntimeException("il numero non è compreso");
        }

    }
}

//    Scrivere una funzione che controlli se un numero int è in un determinato range
//    Se lo è ritorna true se non lo è lancia un'eccezione



