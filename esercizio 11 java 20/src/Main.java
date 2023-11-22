public class Main {
    public static void main(String[] args) {
        int primoNum=10;
        int secondNum=10;
        System.out.println(primoNum);
        System.out.println(secondNum);
        System.out.println("i due numeri sono diversi: " + verificaNumero(primoNum,secondNum));
    }
    public static boolean verificaNumero(int num1, int num2){
        boolean verifica= num1==num2;
        return verifica;
    }
}