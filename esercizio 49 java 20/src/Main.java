import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = Student.creaStudentiIniziali(4);

        System.out.println("ArrayList iniziale:");
        Student.stampaListaStudenti(studentList);

        Student.aggiungiNuoviStudenti(studentList);

        System.out.println("\nArrayList aggiornato:");
        Student.stampaListaStudenti(studentList);
    }
}