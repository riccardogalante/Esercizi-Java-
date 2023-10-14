public class Start {
    public static void main(String[] args) {
        Auto auto1= new Auto(2000,"dx340gp","opel", "gt" );
        Auto auto2= new Auto(1800,"ax340ff","seat", "ibiza" );


        System.out.println(auto1);
        System.out.println(auto2);

        auto2.setCilindrata(2000);
        System.out.println(auto2);


    }
}
