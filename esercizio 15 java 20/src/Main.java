public class Main {
    public static void main(String[] args) {
        int num= 15;
        stampaFizzBuzz(num);
    }
    public static void stampaFizzBuzz(int numero){

        if (numero%3==0 && numero%5==0){
            System.out.println("FizzBuzz");
        } else if (numero%3==0) {
            System.out.println("Fizz");
        } else if (numero%5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println("valore nè Fizz nè Buzz");
        }
    }
}





//    Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile, utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
//        Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

