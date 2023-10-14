public class Start {
    public static void main(String[] args) {
        Auto auto1= new Auto(1800, "cs128fp", "fiat", "bravo");
        Auto auto2= new Auto(1300, "cb280pk", "bmw", "x1");
        System.out.println(auto1);
        System.out.println(auto2);

        auto2.setCilindrata(1900);
        System.out.println(auto2);


    }
}
