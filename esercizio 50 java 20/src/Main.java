import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = Student.creaListaStudenti();

        System.out.println("ArrayList iniziale:");
        Student.stampaListaStudenti(studentList);

        Student.ordinaListaStudentiPerNome(studentList);

        System.out.println("\nArrayList ordinato per nome:");
        Student.stampaListaStudenti(studentList);
    }
}