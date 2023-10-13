public class start {
    public static void main(String[] args) {
        double x=6;
        double y=30;
        double z=22.4;
        System.out.println("il limite inferiore  è = " + x + " mentre il limite superiore è = " + y);
        System.out.println("se il numero è = " + z + " il suo essere compreso tra " +x + " e " + y + " risulterà " + range(x,y,z));
    }

    public static boolean range (double x, double y, double z) {
        boolean zRange= (z>= x) && (z<=y);
        return zRange;
    }
}
