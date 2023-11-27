public class Main {
    public static void main(String[] args) {
        int numero=6;
        tabellina(numero);
    }
    public static void tabellina(int num){
        int rangeTabellina=10;

        for(int i=1; i<=rangeTabellina; i++){
            System.out.println(num + "*" + i + "= " + i*num);
        }
    }
}