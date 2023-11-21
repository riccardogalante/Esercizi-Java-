public class Main {
    public static void main(String[] args) {
        double x=8.7;
        double y=4.6;
        double z=5.9;
        System.out.println(calcoloMedia(x,y,z));

    }
    public static double calcoloMedia(double num1,double num2,double num3){
        double media= (num1+num2+num3)/3;
        return media;
    }
}