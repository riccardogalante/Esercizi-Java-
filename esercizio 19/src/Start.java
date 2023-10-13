public class Start {
    public static void main(String[] args) {
        System.out.println(calcoloSum(5));
    }
    public static int calcoloSum (int limiteSuperiore){
        int sum= 0;
        int i=0;
                while (i<limiteSuperiore){
                    sum+=i;
                    i++;

                }
                return sum;
    }
}
