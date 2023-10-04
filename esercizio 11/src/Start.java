public class Start {
    public static void main(String[] args) {

        int x=10;
        int y=10;
        boolean risultato= diverso(x,y);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println(risultato);


    }
    public static boolean diverso (int x, int y){
        return x!=y;

    }
}

