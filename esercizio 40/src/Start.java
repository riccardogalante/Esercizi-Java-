public class Start {
    public static void main(String[] args) {
        int num=5;
        try {
            divisionePerZero(num);
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
    public static int divisionePerZero(int num){

        return num/0;
    }
}
//    Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
