public class Start {
    public static void main(String[] args) {
        char a='a';
        char b='2';
        System.out.println(carattereVerifica(a));

    }
    public static boolean carattereVerifica(char a){
        if (Character.isDigit(a)){
            return true;
        } else {
            throw new RuntimeException("il carattere non è un numero");
        }

    }
}
//    Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
