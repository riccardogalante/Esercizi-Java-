public class Main {
    public static void main(String[] args) {
        int x=26;
        int y=46;
        System.out.println(incrementoConMoltiplicazione(x,y));

    }
    public static int incrementoConMoltiplicazione(int num1, int num2){
        num1+=4;
        num2+=4;
        int calcolo= num1 * num2;
        return calcolo;
    }
}