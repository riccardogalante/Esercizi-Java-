import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Studente studente=new Studente("Rykard", "galante",3);




        System.out.println(studente.getNome());
        studente.setNome("Michael");
        System.out.println(studente.getNome());


    }
}
