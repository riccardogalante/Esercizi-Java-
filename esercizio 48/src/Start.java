import java.util.ArrayList;


public class Start {

    public static void main(String[] args) {

        int n = 5;
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student("Student" + i, 20 + i);
            studentList.add(student);
        }

        System.out.println("Lista iniziale:");
        printStudentList(studentList);


        for (int i = 0; i < 4; i++) {
            Student newStudent = new Student("NewStudent" + i, 25 + i);
            studentList.add(newStudent);
        }

        System.out.println("\nLista aggiornata:");
        printStudentList(studentList);
    }


    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}