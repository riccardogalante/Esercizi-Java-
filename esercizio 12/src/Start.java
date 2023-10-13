public class Start {
    public static void main(String[] args) {

        char a= 'a';
        char b= 'b';
        boolean risultato= diverso(a,b);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("la comparazione a != b è = " + risultato);


    }
    public static boolean diverso (char a, char b){
        return a!=b;

    }
}
