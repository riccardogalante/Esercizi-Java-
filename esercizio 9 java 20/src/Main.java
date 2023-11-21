public class Main {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(incrementoConMoltiplicazione(x,y));

    }
    public static int incrementoConMoltiplicazione(int num1, int num2){
        num1++;
        num2++;
        int calcolo= num1 * num2;
        return calcolo;
    }
}