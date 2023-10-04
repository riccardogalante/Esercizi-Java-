public class start {
    public static void main(String[] args) {


        int risultato = incMol(4,3,10);



    }

    public static int incMol (int x, int y, int inc){

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println();

        x+=inc;
        System.out.println("x inc: " + x);
        y+=inc;
        System.out.println("y inc: " + y);
        int z= x*y;
        System.out.println("x*y= " + z);

        return z;

    }
}
