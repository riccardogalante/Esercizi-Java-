public class Start {
    public static void main(String[] args) {
        char a = '/';
        operation(a);
    }
    public static int operation(char b){
        switch (b){
            case '+':
                System.out.println("si tratta di un'addizione.");
                break;
            case '-':
                System.out.println("si tratta di una sottrazione.");
                break;
            case '/':
                System.out.println("si tratta di una divisione.");
                break;
            case '*':
                System.out.println("si tratta di una moltiplicazione.");
                break;
            default:
                System.out.println("ERRORE");
        };
        return b;
    }
}
