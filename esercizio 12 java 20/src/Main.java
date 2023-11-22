public class Main {
    public static void main(String[] args) {
        char char1='A';
        char char2='B';
        System.out.println(char1);
        System.out.println(char2);
        System.out.println("i due caratteri sono diversi: " + verificaChar(char1,char2));
    }
    public static boolean verificaChar(int primoChar, int secondoChar){
        boolean verifica= primoChar!=secondoChar;
        return verifica;
    }
}